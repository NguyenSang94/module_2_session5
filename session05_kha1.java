package session05_Kha1;

import java.util.Scanner;

public class session05_kha1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine();

        // Loại bỏ khoảng trắng thừa
        email = email.trim();

        // Regex kiểm tra email
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";

        // Kiểm tra email
        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        sc.close();
    }
}
