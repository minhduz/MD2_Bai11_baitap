import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi số nguyễn: ");

        String numbers = scanner.nextLine();
        String[] arr;

        arr = numbers.split(" ");

        Stack<String> myStark = new Stack<>();
        for (String s : arr) {
            myStark.push(s);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(myStark.pop());
        }
    }
}