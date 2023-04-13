package org.example.Character;

import org.example.Attributes.Attributes;
import org.example.Enum.ArmorType;
import org.example.Enum.ItemSlots;
import org.example.Enum.JobCategory;
import org.example.Enum.WeaponType;
import org.example.Items.Armor.Armor;
import org.example.Items.Items;
import org.example.Items.Weapons.Weapons;

import java.util.Map;

public class Warrior extends Hero {
    JobCategory jobCategory = JobCategory.WARRIOR;
    @Override
    public JobCategory getJobCategory(){return jobCategory;}
    Attributes HeroAttributes = new Attributes(5,1,2);
    @Override
    public int levelUpIncreaseDex(){
        int x = HeroAttributes.getDexterity();
        return HeroAttributes.setDexterity(x+2);
    }
    @Override
    public int levelUpIncreaseInt(){
        int x = HeroAttributes.getIntelligence();
        return HeroAttributes.setIntelligence(x+1);
    }
    @Override
    public int levelUpIncreaseStr(){
        int x = HeroAttributes.getStrength();
        return HeroAttributes.setStrength(x+3);
    }
    @Override
    public int getTotalHeroDamage() {
        int heroStat = heroAttributes.getStrength();
        int damageOfEquippedWeapon = 0;
        int armorStat = 0;
        Items weapon = equippedItemsHM.get(ItemSlots.WEAPON);
        if (weapon == null) {
            return 1;
        }
        for (Map.Entry<ItemSlots, Items> equipment : equippedItemsHM.entrySet()) {
            ItemSlots slot = equipment.getKey();
            Items item = equipment.getValue();
            if(item == null){
                continue;
            }
            else if (slot == ItemSlots.WEAPON) {
                Weapons weapons = (Weapons) item;
                damageOfEquippedWeapon = weapons.getWeaponDamange();
            } else {
                Armor armor = (Armor) item;
                armorStat = armor.armorAttributes.getStrength();
            }
        }
        return damageOfEquippedWeapon * (1 + ((armorStat + heroStat) / 100));
    }
    public Warrior(String name) {
        super(name);
        heroAttributes = new Attributes(2,1,5);
        setJobCategory(JobCategory.WARRIOR);
        allowedArmorType.add(ArmorType.PLATE);
        allowedArmorType.add(ArmorType.MAIL);
        allowedWeaponType.add(WeaponType.AXE);
        allowedWeaponType.add(WeaponType.SWORD);
        allowedWeaponType.add(WeaponType.HAMMER);
        setJobtitle("Warrior");

    }

}

