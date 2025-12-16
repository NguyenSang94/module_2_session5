package session05_Gioi1;

import java.util.Scanner;

public class session05_gioi1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        // Kiểm tra các điều kiện
        boolean lengthValid = password.length() >= 8;
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[@#$!%].*");

        // Kết luận
        if (lengthValid && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        sc.close();
    }
}
