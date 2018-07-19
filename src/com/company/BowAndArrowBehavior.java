package com.company;

import com.company.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("implements shooting bow and arrow");
    }
}
