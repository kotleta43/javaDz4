public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int expected = 150;
        long actual = (int) service.calculate(5000, true);
        System.out.println("1. " + expected + " == ? == " + actual);
    }
}
