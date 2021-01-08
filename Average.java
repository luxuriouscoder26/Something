import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average{
    public static void main(String args[])throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double a,d,p,ar;
        System.out.println("Enter The Diagonal of a square");
        d=Double.parseDouble(in.readLine());
        a=d/Math.sqrt(2);
        ar=a*a;
        p=4*a;
        System.out.println("The area ="+ar);
        System.out.println("The perimeter = "+p); 
    }
}