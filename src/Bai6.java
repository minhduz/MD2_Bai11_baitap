import java.util.Scanner;
import java.util.SortedMap;
import java.util.Stack;

class Bai6{

    static boolean isPair(char character1, char character2){
        if(character1 == '(' && character2 == ')')
            return true;

        else if(character1 == '{' && character2 == '}')
            return true;

        else return character1 == '[' && character2 == ']';
    }

    static boolean isBalanced(char[] s){
        Stack<Character> st = new Stack<Character>();

        for (char c : s) {

            if (c == '{' || c == '(' || c == '[')
                st.push(c);

            if (c == '}' || c == ')' || c == ']') {

                if (st.isEmpty()) {
                    return false;
                } else if (!isPair(st.pop(), c)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiếm tra: ");
        String input = scanner.nextLine();

        char[] s = input.toCharArray();

        if(isBalanced(s)){
            System.out.println("Expression is balanced.");
        }

        else{
            System.out.println("Expression is not balanced.");
        }

    }
}
