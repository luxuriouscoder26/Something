//3,6,9,12
import java.util.*;
 public class Series2 {
    public static void main(String[] args) {
        int i,n,s = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n=sc.nextInt();
        for(i=1; i<=n; i++){
            s = i*3;
            System.out.print(s+",");
        }
    }
}
