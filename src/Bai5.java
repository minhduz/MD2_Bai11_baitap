import sun.net.www.content.text.Generic;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(String.valueOf(input.toLowerCase().charAt(i)));
        }

        StringBuilder reverse = new StringBuilder();

        while (!stack.empty()){
            reverse.append(stack.pop());
        }
        if(Objects.equals(input, reverse.toString())){
            System.out.printf("Chuỗi %s là chuỗi đối xứng",input);
        } else {
            System.out.printf("Chuỗi %s không phải là chuỗi đối xứng",input);
        }
    }
}
