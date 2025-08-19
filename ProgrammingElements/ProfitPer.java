package ProgrammingElements;

public class ProfitPer {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellprice = 191;
        int profit = sellprice - costPrice;
        double profitper = (profit/(double)costPrice)*100;
        System.err.println("The Cost Price is "+ costPrice+ " and the selling price is "+sellprice);
        System.out.println("The profit is "+profit+ " and the Profit percentage is "+String.format("%.2f",profitper)+"%");

    }

    
}
