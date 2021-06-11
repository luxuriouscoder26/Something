//print 1,4,9,16.......
import java.util.*;
public class Series1 {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        n = sc.nextInt();
        for(i = 1; i <= n ; i++)

       {

           System.out.print((int)(Math.pow(i,2))) ;

           if(i < n)

           System.out.print(" , ") ;

       }
    }
}
