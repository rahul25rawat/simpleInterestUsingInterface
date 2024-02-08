public class Axis implements SimpleInterest{
    @Override
    public double interestCalculator(double amount, int months) {
        return (4.28*amount*months/100);
    }
}
