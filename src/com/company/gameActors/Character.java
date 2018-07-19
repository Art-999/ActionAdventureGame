package com.company.gameActors;

import com.company.interfaces.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
