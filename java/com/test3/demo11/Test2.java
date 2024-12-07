package com.test3.demo11;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入人数：");
        int x = sc.nextInt();
        System.out.println("输入认识关系对：");
        int y = sc.nextInt();

        int[][] arr = new int[y][2];
        int[][] new_arr = new int[x][];//最多圈子数为所有人都不认识即所有人x

        initArr(arr);
        int index = 0;
        //{{1,2},{1,3}}     {{}}
        for (int i = 0; i < arr.length; i++) {
            int _index = 0;
            for (int j = 0; j < arr[i].length; j++) {
                new_arr[index][_index] = arr[i][j];
                _index++;
                for (int k = 0; k < new_arr.length; k++) {
                    for (int l = 0; l < new_arr[k].length; l++) {
                        if(arr[i][j] == new_arr[k][l]){
                            new_arr[k][l+1] = arr[i][j];

                        }
                    }
                }
            }
            index++;
        }







    }

    //初始化关系
    public static void initArr(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr["+i+"]"+"["+j+"]:");
                arr[i][j] = sc.nextInt();
            }
        }

    }

}
