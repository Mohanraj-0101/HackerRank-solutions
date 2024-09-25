
import java.text.DecimalFormat;
import java.util.Scanner;

public class output_formatting {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("000");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 1; i <= 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
         
            System.out.println(String.format("%-15s", s1) + df.format(x));
        }
           System.out.println("================================");
           sc.close();
    }
}