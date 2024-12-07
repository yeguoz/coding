package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
        /*
        * "♦","♣","♥","♠"
        * "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        * */
        static ArrayList<String> color = new ArrayList<>();
        static ArrayList<String> number = new ArrayList<>();
        static ArrayList<String> list = new ArrayList<>();
        static {
            Collections.addAll(color,"♦","♣","♥","♠");
            Collections.addAll(number,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
            for (String c : color) {
                // 花色
                for (String n : number) {
                    // 牌大小
                    list.add(c + n);
                }
            }
            // 大小王加入牌中
            list.add("大王");
            list.add("小王");
        }

        public PokerGame(){
            //做一副牌

            // 洗牌
            Collections.shuffle(list);

            // 看牌，一个底牌集合、三个玩家集合
            ArrayList<String> lord = new ArrayList<>();
            ArrayList<String> player1 = new ArrayList<>();
            ArrayList<String> player2 = new ArrayList<>();
            ArrayList<String> player3 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                // 将前三张牌作为底牌加入lord集合中
                String poker = list.get(i);
                if (i < 3){
                    lord.add(poker);
                    continue;
                }
                // 分发三位玩家的牌
                if (i % 3 == 0){
                    player1.add(poker);
                }else if (i % 3 == 1){
                    player2.add(poker);
                }else {
                    player3.add(poker);
                }
            }
            // 将底牌和三位玩家集合中的牌打印出来
            System.out.println("底牌："+lord);
            System.out.println("玩家1："+player1+player1.size());
            System.out.println("玩家2："+player2+player2.size());
            System.out.println("玩家3："+player3+player3.size());
        }
}
