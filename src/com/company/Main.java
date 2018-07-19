package com.company;

import com.company.gameActors.Character;
import com.company.gameActors.King;

public class Main {

    public static void main(String[] args) {
        Character king=new King();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
    }
}
