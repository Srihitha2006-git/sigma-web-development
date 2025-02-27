
import java.util.Scanner;
public class append {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Original string:");
        StringBuffer m=new StringBuffer(sc.nextLine());
        System.out.println("String to be appended");
        String n=sc.nextLine();
        m.append(n);
        System.out.println(m);
        
    }
}
