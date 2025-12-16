package session05_Gioi2;
import java.util.Random;

import java.util.Scanner;

public class session05_gioi2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Nhập n
        System.out.print("Nhập độ dài chuỗi n (1 - 1000): ");
        int n = sc.nextInt();

        // Kiểm tra n hợp lệ
        if (n < 1 || n > 1000) {
            System.out.println("Giá trị n không hợp lệ!");
            return;
        }

        // Tập ký tự cho phép
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";

        // Tạo chuỗi ngẫu nhiên
        StringBuilder result = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        // In kết quả
        System.out.println("Chuỗi ngẫu nhiên: ");
        System.out.println(result.toString());

        sc.close();
    }
}
