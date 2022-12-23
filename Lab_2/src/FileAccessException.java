public class FileAccessException extends Exception {

    public FileAccessException(){
        super("Файл не существует/нет доступа к файлу");
    }
}