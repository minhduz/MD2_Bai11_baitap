import java.util.Scanner;
import java.util.Stack;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần đổi: ");



        int num = scanner.nextInt();
        int numSave = num;
        Stack<Integer> myStack = new Stack<>();

        while (num/2!=0){
            int soDu = num%2;
            myStack.push(soDu);
            num/=2;
        }
        myStack.push(num);

        System.out.printf("%d đổi sang nhị phân là: ",numSave);
        while (!myStack.empty()){
            System.out.printf("%d",myStack.pop());
        }
    }
}
