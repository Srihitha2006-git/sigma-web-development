import java.util.Scanner;
public class cap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        String a[]=m.split(" ");
        int i;
        for(i=0;i<a.length;i++){
            if(!a[i].isEmpty()){
            String firstletter=a[i].substring(0,1).toUpperCase();
            String remaining=a[i].substring(1);
            String total=firstletter+remaining;
            System.out.print(total+" ");
            }
        }
    }
}
