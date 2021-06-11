//1.5,3.0,4.5,6.0
import java.util.*;
 public class Series3 {
    public static void main(String[] args) {
        double i,n,s = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n=sc.nextInt();
        for(i=1; i<=n; i++){
            s = i * 1.5;
            System.out.print(s+",");
        }
    }
}
