package com.test.demo1;

public class FightingGame {
    public static void main(String[] args) {
        GameCharacter g1 = new GameCharacter("凯隐",200,0);
        GameCharacter g2 = new GameCharacter("劫",200,0);
        while (true){
            g1.attack(g2);
            if(g2.getBloodVolume()==0){
                System.out.println(g1.getGameCharacterName()+"击败了"+
                        g2.getGameCharacterName());
                break;
            }

            g2.attack(g1);
            if (g1.getBloodVolume()==0){
                System.out.println(g2.getGameCharacterName()+"击败了"+
                        g1.getGameCharacterName());
                break;
            }

        }
    }

}
