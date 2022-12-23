import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        List<String> strList = Arrays.asList("Овощ", "Фрукт", "ягода", "Корнеплод", "Бахча");
        Queue<Integer> intList = new LinkedList<>();
        List<Integer> intList1 = Arrays.asList(4, 8, 9, 5, 1, 3, 2, 8, 7);
        Set<Integer> intList2 = Set.of(9, 3, 5, 7, 11, 1, 19, 15);

        System.out.println("1: Среднее значение = " + midValue(intList1));
        System.out.println("2: Изменнные строки = " + editString(strList));
        System.out.println("3: Квадраты неповторяющихся = " + returnSqr(intList1));
        System.out.println("4: Сортированные начинающиеся с буквы слова = " + returnString(strList, 'б'));
        System.out.println("5: Последний элемент = " + returnLast(strList));
        System.out.println("5.1: Последний элемент (коллекция пуста) = " + returnLast(intList));
        System.out.println("6: Сумма четных = " + sumEven(intList1));
        System.out.println("6.1: Сумма четных (четных нет) = " + sumEven(intList2));
        System.out.println("7: Конвертация в Map = " + convertToMap(strList));
    }

    public static double midValue(Collection<Integer> intList) {
        return intList.stream()
                .flatMapToInt(IntStream::of)
                .average()
                .getAsDouble();
    }

    public static List<String> editString(Collection<String> strList) {
        return strList.stream()
                .map(n -> "_new_" + n.toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<Integer> returnSqr(Collection<Integer> intList) {
        return intList.stream()
                .filter(n -> intList.stream().filter(x -> x == n).count() < 2)
                .map(n -> (int)Math.pow(n, 2))
                .collect(Collectors.toList());
    }

    public static List<String> returnString(Collection<String> strList, char ch) {
        return strList.stream()
                .filter(n -> n.toLowerCase().charAt(0) == ch)
                .sorted()
                .collect(Collectors.toList());
    }

    public static <T> T returnLast(Collection<T> list) {
        try {
            return list.stream().reduce((first, second) -> second).orElseThrow();
        }
        catch (NoSuchElementException ex){
            System.out.println("Exception: " + ex.getMessage());
            return null;
        }
    }

    public static int sumEven(Collection<Integer> intList) {
        return intList.stream()
                .flatMapToInt(IntStream::of)
                .filter(n -> n % 2 == 0)
                .sum();
    }

    public static Map<Character, String> convertToMap(Collection<String> strList) {
        return strList.stream()
                .collect(Collectors.toMap(
                        k -> k.charAt(0),
                        v -> v.substring(1)));
    }
}
