public class logger {
    private static logger instance = new logger();

    private logger() {
        System.out.println("Logger instance created.");
    }

    public static logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
