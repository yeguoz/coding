package com.test3.demo11;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String columnLabel = getColumnLabel(n);
                System.out.println(columnLabel);
            }

            public static String getColumnLabel(int columnNumber) {
                StringBuilder sb = new StringBuilder();
                while (columnNumber > 0) {
                    columnNumber--;
                    sb.insert(0, (char) ('A' + columnNumber % 26));
                    columnNumber /= 26;
                }
                return sb.toString();

    }
}
