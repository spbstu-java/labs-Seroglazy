public class TestAnnotation
{
    @Calls(callCount = 3)
    public static void firstPublic () {
        System.out.println("Public 1");
    }
    public static void secondPublic () {
        System.out.println("Public 2");
    }

    protected static void firstProtected () {
        System.out.println("Protected 1");
    }
    @Calls(callCount = 4)
    protected static void secondProtected () {
        System.out.println("Protected 2");
    }
    @Calls(callCount = 2)
    protected static void thirdProtected () {
        System.out.println("Protected 3");
    }

    @Calls(callCount = 1)
    private static void firstPrivate () {
        System.out.println("Private 1");
    }
    @Calls(callCount = 2)
    private static void secondPrivate () {
        System.out.println("Private 2");
    }
    private static void thirdPrivate () {
        System.out.println("Private 3");
    }
}
