package com.test3.demo11;

import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int[] parent = new int[x + 1];
            for (int i = 1; i <= x; i++) {
                parent[i] = i;  // 初始化，每个人自成一个社交圈，表示自己与自己认识
            }

            for (int i = 0; i < y; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                union(parent, a, b);  // 合并认识的人所在的社交圈
            }

            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (parent[i] == i) {  // 统计根节点的个数
                    count++;
                }
            }

            System.out.println(count);
        }

        private static void union(int[] parent, int a, int b) {
            int rootA = find(parent, a);  // 找到a所在社交圈的根节点
            int rootB = find(parent, b);  // 找到b所在社交圈的根节点
            if (rootA != rootB) {
                parent[rootB] = rootA;  // 将b所在社交圈的根节点指向a所在社交圈的根节点，实现合并
            }
        }

        private static int find(int[] parent, int x) {
            if (parent[x] != x) {
                parent[x] = find(parent, parent[x]);  // 路径压缩，将x的父节点设为根节点
            }
            return parent[x];
        }
    }


