import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();
        TreeMap<String,Integer> myMap = new TreeMap<>();
        String[] arr = input.toLowerCase().split(" ");
        for (String s : arr) {
            if (myMap.containsKey(s)) {
                myMap.put(s, myMap.get(s) + 1);
            } else {
                myMap.put(s, 1);
            }
        }

        System.out.println("Có tổng "+arr.length+" chữ nhập vào");
        int cnt = 1;
        for (String key : myMap.keySet()) {
            System.out.printf("%d, %s xuất hiện %d lần\n",cnt,key,myMap.get(key));
            cnt++;
        }
    }
}
