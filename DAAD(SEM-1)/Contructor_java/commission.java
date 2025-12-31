import java.util.*;
public class commission
{
    double sales;
    double commission;
   commission() 
   {
        sales = 0;
        commission = 0;
    }
      commission(double saleAmount) 
  {
        sales = saleAmount;
        commission = 0.02 * sales;
    }
    void display() {
        System.out.println("Total Sales: " + sales);
        System.out.println("Commission (2%): " + commission);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales Amount: ");
        double salesAmount = sc.nextDouble();
        commission obj = new commission(salesAmount);
        obj.display();
    }
}