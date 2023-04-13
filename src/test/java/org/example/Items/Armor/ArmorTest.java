package org.example.Items.Armor;

import org.example.Enum.ArmorType;
import org.example.Enum.ItemSlots;
import org.example.Enum.WeaponType;
import org.example.Items.Weapons.Weapons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {

    @Test
    public void test_getArmorSlot_should_pas(){
    Armor a = new  Armor("Stick",1,ItemSlots.HEAD, ArmorType.CLOTH,1,2,3);
        assertEquals(a.getArmorSlot(), ItemSlots.HEAD);
    }
    @Test
    public void test_setArmorSlot_should_pas(){
        Armor a = new  Armor("Stick",1,ItemSlots.HEAD, ArmorType.CLOTH,1,2,3);
        assertEquals(a.setArmorSlot(ItemSlots.BODY), ItemSlots.BODY);
    }
    @Test
    public void test_getArmorType_should_pas(){
        Armor a = new  Armor("Stick",1,ItemSlots.HEAD, ArmorType.CLOTH,1,2,3);
        assertEquals(a.getArmorType(), ArmorType.CLOTH);
    }
    @Test
    public void test_setArmorType_should_pas(){
        Armor a = new  Armor("Stick",1,ItemSlots.HEAD, ArmorType.CLOTH,1,2,3);
        assertEquals(a.setArmorType(ArmorType.MAIL), ArmorType.MAIL);
    }


}