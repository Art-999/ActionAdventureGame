package com.company;

import com.company.interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("implements chopping with an axe");
    }
}
