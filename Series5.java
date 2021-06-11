//1,9,25,49...
import java.util.*;
public class Series5 {
    public static void main(String[] args) {
        int i,n,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for(i=1; i<=n; i+=2){
            s = i*i;
            System.out.print(s+",");

        }
    }
}
