public class HDFC implements SimpleInterest{
    @Override
    public double interestCalculator(double amount, int months) {
        return (4.86*amount*months/100);
    }
}
