package com.aidjajd.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        // 初始化界面
        int[][] data =  new int[3][3];
        initJFrame();

        // 初始化菜单
        initMenuBar();

        // 初始化数据
        initData(data);


        // 初始化图片
        initImage(data);

        // 显示
        this.setVisible(true);
    }

    private void initData(int[][] data) {
        int[] number = {0,1,2,3,4,5,6,7,8};
        Random r = new Random();
        for (int i = 0; i < number.length; i++) {
            int index = r.nextInt(number.length);
            int temp = number[index];
            number[index] = number[i];
            number[i] = temp;
        }

        for (int i = 0; i < number.length; i++) {
            data[i / 3][i % 3] = number[i];
        }
    }

    private void initImage(int[][] data) {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                ImageIcon icon = new ImageIcon("C:\\Users\\aidja\\Pictures\\"+ data[i][j]++ +".png");

                JLabel jLabel = new JLabel(icon);
                jLabel.setBounds(300*i,300*j,300,300);
                this.getContentPane().add(jLabel);
            }
        }

        JLabel background = new JLabel(new ImageIcon("C:\\Users\\aidja\\Pictures\\comic-master\\52.jpg"));
        background.setBounds(10,0,1000,2000);
        this.getContentPane().add(background);
    }


    private void initJFrame() {
        this.setSize(980,1040);

        // 界面标题
        this.setTitle("拼图单机版");

        // 界面置顶
        this.setAlwaysOnTop(true);

        // 界面居中
        this.setLocationRelativeTo(null);

        // 闭关模式
        this.setDefaultCloseOperation(3);

        // 取消默认居中放置
        this.setLayout(null);
    }

    private void initMenuBar() {
        // 菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        // 菜单项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // 菜单子项
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        // 加入栏中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(aboutJMenu);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }
}
