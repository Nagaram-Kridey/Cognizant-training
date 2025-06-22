public class SingletonTest {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger1.log("First message");

        logger logger2 = logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances exist! Singleton failed.");
        }
    }
}
