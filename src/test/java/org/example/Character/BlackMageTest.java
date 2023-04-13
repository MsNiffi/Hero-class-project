package org.example.Character;

import org.example.Enum.ArmorType;
import org.example.Enum.ItemSlots;
import org.example.Enum.JobCategory;
import org.example.Enum.WeaponType;
import org.example.Items.Armor.Armor;
import org.example.Items.Weapons.Weapons;
import org.example.customExceptions.InvalidArmorException;
import org.example.customExceptions.InvalidWeaponException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackMageTest {

    @Test
    public void test_getJobCategory_should_pas(){
        BlackMage p = new BlackMage("Ole");
        JobCategory test = p.getJobCategory();
        assertEquals(test, JobCategory.BLACKMAGE);
    }

    @Test
    public void test_levelUpIncreaseDex_should_pas(){
        BlackMage p = new BlackMage("Ole");
        int test = p.levelUpIncreaseDex();
        assertEquals(test, 2);
}
    @Test
    public void test_levelUpIncreaseInt_should_pas(){
        BlackMage p = new BlackMage("Ole");
        int test = p.levelUpIncreaseInt();
        assertEquals(test, 13);
    }
    @Test
    public void test_levelUpIncreaseStr_should_pas(){
        BlackMage p = new BlackMage("Ole");
        int test = p.levelUpIncreaseStr();
        assertEquals(test, 2);
}
    @Test
    public void test_getTotalHeroDamage_should_pas() throws InvalidWeaponException, InvalidArmorException {
        BlackMage p = new BlackMage("Ole");
        Weapons w = new Weapons("wn",1, WeaponType.WAND,3);
        Armor a = new Armor("An",1, ItemSlots.BODY, ArmorType.CLOTH,2,1,1);
        p.equipBodyArmor(a);
        p.equipWeapon(w);

        int test = 3;
        int pdmg = p.heroAttributes.getIntelligence();
        int admg = a.armorAttributes.getIntelligence();
        int wdmg = w.getWeaponDamange();

        int sumDmg = wdmg * (1 + ((admg + pdmg)/100));

        assertEquals(test, sumDmg);
    }


}