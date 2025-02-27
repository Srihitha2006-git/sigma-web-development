import java.util.Scanner;
class compare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String n=sc.nextLine();
        System.out.println("Enter the String2:");
        String m=sc.nextLine();
        int s=n.compareToIgnoreCase(m);
        if (s==0) {
            System.out.println("Two strings are equal");
        }
    }
}