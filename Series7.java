//24,99,224,399
import java.util.*;
public class Series7 {
    public static void main(String[] args) {
        int i,n,s=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            s = 25*(i*i)-1;
            System.out.print(s+",");
        }
    }
}
