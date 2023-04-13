package org.example.Character;

import org.example.Enum.ArmorType;
import org.example.Enum.ItemSlots;
import org.example.Enum.JobCategory;
import org.example.Enum.WeaponType;
import org.example.Items.Armor.Armor;
import org.example.Items.Items;
import org.example.Items.Weapons.Weapons;
import org.example.customExceptions.InvalidArmorException;
import org.example.customExceptions.InvalidWeaponException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    public void test_getName_should_pas(){
        BlackMage p = new BlackMage("Ole");
        String expectedValue = "Ole";
        assertEquals(p.getName(), expectedValue);
        };


    @Test
public void test_setName_should_pas(){
        BlackMage p = new BlackMage("Ole");
        String expectedValue = "Bob";
        String test = p.setName("Bob");
        assertEquals(expectedValue, test);
    };

@Test
    public void test_getJobtitle_should_pas(){
    BlackMage p = new BlackMage("Ole");
    String expectedValue = "Black-Mage";
    String test = p.getJobtitle();
    assertEquals(expectedValue, test);
}
    @Test
    public void test_setJobtitle_should_pas(){
        BlackMage p = new BlackMage("Ole");
        String expectedValue = "BlackMage";
        String test = p.setJobtitle("BlackMage");
        assertEquals(expectedValue, test);
    }
    @Test
    public void test_getJobCategory_should_pas(){
        BlackMage p = new BlackMage("Ole");
        JobCategory expectedValue = JobCategory.BLACKMAGE;
        JobCategory test = p.getJobCategory();
        assertEquals(expectedValue, test);
    }
    @Test
    public void test_setJobCategory_should_pas(){
        BlackMage p = new BlackMage("Ole");
        JobCategory expectedValue = JobCategory.BLACKMAGE;
        JobCategory test = p.setJobCategory(JobCategory.BLACKMAGE);
        assertEquals(expectedValue, test);
    }
    @Test
    public void test1_getLevel_should_pas(){
        BlackMage p = new BlackMage("Ole");
        int expectedValue = 1;
        int test = p.getLevel();
        assertEquals(expectedValue, test);
    }
    @Test
    public void test2_getLevel_should_pas(){
        BlackMage p = new BlackMage("Ole");
        p.levelUpOneLevel();
        int expectedValue = 2;
        int test = p.getLevel();
        assertEquals(expectedValue, test);
    }

    @Test
    public void test_levelUpOneLevel_should_pas(){
        BlackMage p = new BlackMage("Ole");
        p.levelUpOneLevel();
        int testlevel = p.getLevel();
       int testint = p.heroAttributes.getIntelligence();
       int testdex = p.heroAttributes.getDexterity();
       int teststr = p.heroAttributes.getStrength();

        int expectedIntValue = 13;
        int expectedDexValue = 2;
        int expectedStrValue = 2;
        int expectedLevel = 2;

        assertEquals(testint, expectedIntValue);
        assertEquals(testdex, expectedDexValue);
        assertEquals(teststr, expectedStrValue);
        assertEquals(testlevel,expectedLevel);
    }
@Test
    public void test_equipWeapon_should_pas(){
    BlackMage p = new BlackMage("Ole");
    Weapons w = new Weapons("wn",1, WeaponType.WAND,3);
    p.equippedItemsHM.put(ItemSlots.WEAPON, w);

    ItemSlots testIS = w.getItemSlot();
    ItemSlots expectedIS = ItemSlots.WEAPON;

    int testRL = w.getRequiredLevel();
    int expectedRL = p.getLevel();

    boolean testAllowedWT = p.allowedWeaponType.contains(w.getWeaponType());
    boolean expectedAllowedWT = true;

    assertEquals(testIS,expectedIS);
    assertEquals(testRL,expectedRL);
    assertEquals(testAllowedWT,expectedAllowedWT);

}
    @Test
    public void test_equipBodyArmor_should_pas(){
        BlackMage p = new BlackMage("Ole");
        Armor a = new Armor("An",1,ItemSlots.BODY, ArmorType.CLOTH,2,1,1);
        p.equippedItemsHM.put(ItemSlots.BODY, a);

        ItemSlots testIS = a.getArmorSlot();
        ItemSlots expectedIS = ItemSlots.BODY;

        int testRL = a.getRequiredLevel();
        int expectedRL = p.getLevel();

        boolean testAllowedWT = p.allowedArmorType.contains(a.getArmorType());
        boolean expectedAllowedWT = true;

        assertEquals(testIS,expectedIS);
        assertEquals(testRL,expectedRL);
        assertEquals(testAllowedWT,expectedAllowedWT);
    }
    @Test
    public void test_equipHeadArmor_should_pas(){
        BlackMage p = new BlackMage("Ole");
        Armor a = new Armor("An",1,ItemSlots.HEAD, ArmorType.CLOTH,2,1,1);
        p.equippedItemsHM.put(ItemSlots.HEAD, a);

        ItemSlots testIS = a.getArmorSlot();
        ItemSlots expectedIS = ItemSlots.HEAD;

        int testRL = a.getRequiredLevel();
        int expectedRL = p.getLevel();

        boolean testAllowedWT = p.allowedArmorType.contains(a.getArmorType());
        boolean expectedAllowedWT = true;

        assertEquals(testIS,expectedIS);
        assertEquals(testRL,expectedRL);
        assertEquals(testAllowedWT,expectedAllowedWT);
    }
    @Test
    public void test_equipLegArmor_should_pas(){
        BlackMage p = new BlackMage("Ole");
        Armor a = new Armor("An",1,ItemSlots.LEGS, ArmorType.CLOTH,2,1,1);
        p.equippedItemsHM.put(ItemSlots.LEGS, a);

        ItemSlots testIS = a.getArmorSlot();
        ItemSlots expectedIS = ItemSlots.LEGS;

        int testRL = a.getRequiredLevel();
        int expectedRL = p.getLevel();

        boolean testAllowedWT = p.allowedArmorType.contains(a.getArmorType());
        boolean expectedAllowedWT = true;

        assertEquals(testIS,expectedIS);
        assertEquals(testRL,expectedRL);
        assertEquals(testAllowedWT,expectedAllowedWT);
    }

@Test
    public void test_getTotalArmorAttribute_should_pas() throws InvalidArmorException {
    BlackMage p = new BlackMage("Ole");
    Armor al = new Armor("An",1,ItemSlots.LEGS, ArmorType.CLOTH,2,1,1);
    p.equipLegArmor(al);
   int test = p.getTotalArmorAttribute();
    assertEquals(test, 14);
}

@Test
    public void test_displayHero_should_pas() throws InvalidWeaponException, InvalidArmorException {
    BlackMage p = new BlackMage("Ole");
    Armor a = new Armor("An",1,ItemSlots.LEGS, ArmorType.CLOTH,2,1,1);
    Weapons w = new Weapons("wn",1, WeaponType.WAND,3);
    p.equipWeapon(w);
    p.equipLegArmor(a);

     String compare = "Ole is a lv 1 Black-Mage. These are the following attributes: Dexterety: 1 Intelligence: 8 Strength: 1. With armor and weapons on is the total attributes 14 and total dammage is 3";
    assertEquals(p.displayHero(), compare);
    }

}
