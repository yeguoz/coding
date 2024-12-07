package com.aidjajd.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    public LoginJFrame(){
        this.setSize(488,430);
        // 界面标题
        this.setTitle("拼图登录");
        // 界面置顶
        this.setAlwaysOnTop(true);
        // 界面居中
        this.setLocationRelativeTo(null);
        // 闭关模式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }
}
