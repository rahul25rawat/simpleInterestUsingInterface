import java.util.Scanner;

public class Main{
    static double  amt;
    static int m;
    public static void main(String[] args) {

        System.out.println("Enter the Bank: SBI/HDFC/PNB/Axis");

        Scanner s = new Scanner(System.in);
        String str= s.nextLine();

        if(str.equals("SBI")){
            System.out.println("Enter the Amount");
            amt= s.nextDouble();

            System.out.println("Enter the Months");
            m = s.nextInt();

           SBI sb = new SBI();
           sb.interestCalculator(amt,m);
           System.out.println("Simple Interest is: "+ sb.interestCalculator(amt,m));
       }

       else if(str.equals("PNB")){
            System.out.println("Enter the Amount");
            amt= s.nextDouble();

            System.out.println("Enter the Months");

            m = s.nextInt();
           PNB pb= new PNB();
           pb.interestCalculator(amt,m);
           System.out.println("Simple Interest is: "+ pb.interestCalculator(amt,m));
       }

       else if(str.equals("HDFC")){
            System.out.println("Enter the Amount");
            amt= s.nextDouble();

            System.out.println("Enter the Months");
            m = s.nextInt();

           HDFC hd= new HDFC();
           hd.interestCalculator(amt,m);
           System.out.println("Simple Interest is: "+ hd.interestCalculator(amt,m));
       }

       else if(str.equals("Axis")){
            System.out.println("Enter the Amount");
            amt= s.nextDouble();

            System.out.println("Enter the Months");
            m = s.nextInt();

           Axis ax= new Axis();
           ax.interestCalculator(amt,m);
           System.out.println("Simple Interest is: "+ ax.interestCalculator(amt,m));
       }

       else{
           System.out.println("Invalid Choice");
       }
    }
}