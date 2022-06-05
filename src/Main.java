public class Main {
    public static void main(String[] args) {
        double INTEREST_RATE = .17;

        double initialBalance = 5000.00;

        double month1Balance = initialBalance + initialBalance * INTEREST_RATE;
        double month2Balance = month1Balance + month1Balance * INTEREST_RATE;

        System.out.println("With an initial balance of " + initialBalance + " dollars, after one month the balance will be " +
                month1Balance + " dollars, and after two months the balance will be " + month2Balance + " dollars.");
    }
}