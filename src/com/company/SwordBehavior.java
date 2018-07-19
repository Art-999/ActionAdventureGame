package com.company;

import com.company.interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("implements swinging a sword");
    }
}
