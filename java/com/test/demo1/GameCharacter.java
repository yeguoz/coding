package com.test.demo1;

import java.util.Random;

public class GameCharacter {
    private String gameCharacterName;
    private int bloodVolume;
    private int attackPower;

    public GameCharacter(String gameCharacterName, int bloodVolume, int attackPower) {
        this.gameCharacterName = gameCharacterName;
        this.bloodVolume = bloodVolume;
        this.attackPower = attackPower;
    }

    public GameCharacter() {
    }

    public String getGameCharacterName() {
        return gameCharacterName;
    }

    public void setGameCharacterName(String gameCharacterName) {
        this.gameCharacterName = gameCharacterName;
    }

    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }


    public void attack(GameCharacter g){
        Random r = new Random();
        int damage = r.nextInt(21);
        g.bloodVolume = g.bloodVolume - damage <= 0?0 : g.bloodVolume-damage;
        System.out.println(this.gameCharacterName+"对"+g.gameCharacterName
                            +"造成了"+damage+"点伤害"+g.gameCharacterName+
                            "还有"+g.bloodVolume+"血量"
                            );

    }
}
