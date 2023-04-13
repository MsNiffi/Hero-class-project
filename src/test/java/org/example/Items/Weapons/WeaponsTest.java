package org.example.Items.Weapons;

import org.example.Enum.ItemSlots;
import org.example.Enum.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponsTest {

    @Test
    public void test_getItemSlot_should_pas(){
        Weapons w = new Weapons("Stick",1, WeaponType.WAND,666);
        assertEquals(w.getItemSlot(), ItemSlots.WEAPON);
    }
    @Test
    public void test_getWeaponType_should_pas(){
        Weapons w = new Weapons("Stick",1, WeaponType.WAND,666);
        assertEquals(w.getWeaponType(), WeaponType.WAND);
    }
    @Test
    public void test_getWeaponDamange_should_pas(){
        Weapons w = new Weapons("Stick",1, WeaponType.WAND,666);
        assertEquals(w.getWeaponDamange(),666);
    }
    @Test
    public void test_setWeaponDamange_should_pas(){
        Weapons w = new Weapons("Stick",1, WeaponType.WAND,666);
        assertEquals(w.setWeaponDamange(1),1);
    }


}