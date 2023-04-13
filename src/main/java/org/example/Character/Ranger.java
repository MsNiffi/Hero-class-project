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

public class Ranger extends Hero {
    JobCategory jobCategory = JobCategory.RANGER;
    @Override
    public JobCategory getJobCategory(){return jobCategory;}
    @Override
    public int levelUpIncreaseDex(){
        int x = heroAttributes.getDexterity();
        return heroAttributes.setDexterity(x+5);
    }
    @Override
    public int levelUpIncreaseInt(){
        int x = heroAttributes.getIntelligence();
        return heroAttributes.setIntelligence(x+1);
    }
    @Override
    public int levelUpIncreaseStr(){
        int x = heroAttributes.getStrength();
        return heroAttributes.setStrength(x+1);
    }
    @Override
    public int getTotalHeroDamage() {
        int heroStat = heroAttributes.getDexterity();
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
                armorStat = armor.armorAttributes.getDexterity();
            }
        }
        return damageOfEquippedWeapon * (1 + ((armorStat + heroStat) / 100));
    }
    public Ranger(String name) {
        super(name);
        setJobCategory(JobCategory.RANGER);
        allowedArmorType.add(ArmorType.LEATHER);
        allowedArmorType.add(ArmorType.MAIL);
        allowedWeaponType.add(WeaponType.BOW);
        heroAttributes = new Attributes(7,1,1);
        setJobtitle("Ranger");
    }

}
