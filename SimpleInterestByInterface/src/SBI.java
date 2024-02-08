public class SBI implements SimpleInterest{
    @Override
    public double interestCalculator(double amount, int months) {
        return (3.58*amount*months/100);
    }
}
