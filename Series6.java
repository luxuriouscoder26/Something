//4,16,36,64
import java.util.*;
public class Series6 {
    public static void main(String[] args) {
        int i,n,s = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    
        for(i=1;i<=n;i++)
           {
                if(i%2==0)
                  {
                       s = i*i;
                       System.out.println(s+",");
                  }
                  
          
            }
        }  
}

