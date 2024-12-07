package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    /*
     * "♦","♣","♥","♠"
     * "3","4","5","6","7","8","9","10","J","Q","K","A","2"
     * */
    static String[] color = {"♦","♣","♥","♠"};
    static String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    static String[] joker = {"小王","大王"};
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<Integer,String> hm = new HashMap<>();

    static {
        // 准备一副牌，将数字和花色拼接在一起加入牌中
        int serialNumber = 1;
        for (String n : number) {
            // 数字
            for (String c : color) {
                // 花色
                hm.put(serialNumber,c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        // 将大小王加入牌中
        for (String j : joker) {
            hm.put(serialNumber,j);
            list.add(serialNumber);
            serialNumber++;
        }

    }

    public PokerGame(){
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            // 先将底牌加到lord中
            if (i < 3){
                lord.add(serialNumber);
                continue;
            }
            if (i % 3 == 0){
                player1.add(serialNumber);
            }else if (i % 3 == 1){
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }
        }
        // 看牌
        look("lord",lord);
        look("player1",player1);
        look("player2",player2);
        look("player3",player3);

    }

    public void look(String name,TreeSet<Integer> ts){
        System.out.print(name+" : ");
        for (int serialNumber : ts) {
            System.out.print(hm.get(serialNumber)+" ");
        }
        System.out.println();
    }
}
