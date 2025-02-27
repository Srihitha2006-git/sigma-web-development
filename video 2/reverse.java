import java.util.Scanner;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        int size = st.size();
        for (int i = 0; i < size; i++) {
            System.out.print(st.pop());
        }
        sc.close();
    }
}

