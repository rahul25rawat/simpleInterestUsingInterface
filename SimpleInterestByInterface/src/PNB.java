
public class PNB implements SimpleInterest{
    @Override
    public double interestCalculator(double amount, int months) {
        return (4.63*amount*months/100);
    }
}

