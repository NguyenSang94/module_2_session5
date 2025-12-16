package session05_Kha2;

import java.util.Scanner;

public class session05_kh2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int loop = 1_000_000;

        // ===== 1. String =====
        long startTime = System.currentTimeMillis();

        String str = "Hello";
        for (int i = 0; i < loop; i++) {
            str += " World";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian nối chuỗi với String: "
                + (endTime - startTime) + " ms");

        // ===== 2. StringBuilder =====
        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < loop; i++) {
            sb.append(" World");
        }

        endTime = System.currentTimeMillis();
        System.out.println("Thời gian nối chuỗi với StringBuilder: "
                + (endTime - startTime) + " ms");

        // ===== 3. StringBuffer =====
        startTime = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < loop; i++) {
            sbf.append(" World");
        }

        endTime = System.currentTimeMillis();
        System.out.println("Thời gian nối chuỗi với StringBuffer: "
                + (endTime - startTime) + " ms");
    }
}
