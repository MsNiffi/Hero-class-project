package org.example.Character;
import org.example.Attributes.Attributes;
import org.example.Enum.ArmorType;
import org.example.Enum.JobCategory;
import org.example.Enum.WeaponType;
import org.example.Items.Armor.Armor;
import org.example.Items.Items;
import org.example.Items.Weapons.Weapons;
import org.example.Enum.ItemSlots;
import org.example.customExceptions.InvalidArmorException;
import org.example.customExceptions.InvalidWeaponException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public abstract class Hero {
    private String name ;
    public String getName(){
        return name;
    }
    public String setName(String setName){name = setName;
   return name;}
    private String jobtitle;
    public String getJobtitle(){return jobtitle;}
    public String setJobtitle(String jobtitle){return this.jobtitle = jobtitle;}
    private JobCategory jobCategory;
    public JobCategory setJobCategory(JobCategory job){
       jobCategory = job;
       return jobCategory;
   }
    public JobCategory getJobCategory(){return this.jobCategory;}
    private int level;
    public int getLevel(){return level;}
    public void levelUpOneLevel(){
        level = level +1;
        levelUpIncreaseDex();
        levelUpIncreaseInt();
        levelUpIncreaseStr();
    }
    public abstract int levelUpIncreaseDex();
    public abstract int levelUpIncreaseInt();
    public abstract int levelUpIncreaseStr();
    public HashMap<ItemSlots, Items> equippedItemsHM = new HashMap<>();
    public ArrayList <ArmorType> allowedArmorType = new ArrayList<>();
    public ArrayList<WeaponType> allowedWeaponType = new ArrayList<>();
    public void equipWeapon (Weapons weapon) throws InvalidWeaponException{
        if(weapon.getItemSlot() == ItemSlots.WEAPON){
            if(weapon.getRequiredLevel() <= level){
                if( allowedWeaponType.contains(weapon.getWeaponType())){
                    equippedItemsHM.put(ItemSlots.WEAPON, weapon);
                }
                else {
                    throw new InvalidWeaponException("weapon type not alloeed");
                }
            }
            else { throw new InvalidWeaponException("Too low level to equip weapon");
            }
        } else {
            throw new InvalidWeaponException("not a vallid weapon type.");
        }
    }
    public void equipBodyArmor(Armor bodyArmor) throws InvalidArmorException{
        if(allowedArmorType.contains(bodyArmor.getArmorType())){
            if(bodyArmor.getArmorSlot() == ItemSlots.BODY){
                if(bodyArmor.getRequiredLevel() <=level){
                    equippedItemsHM.put(ItemSlots.BODY, bodyArmor);
                }
                else {
                    throw new InvalidArmorException("Too low level to equip weapon");
                }
            }
            else {
                throw new InvalidArmorException("Invalid armor slot");
            }
        }
        else{
            throw new InvalidArmorException("Armor type not allowed");
        }
    }
    public void equipHeadArmor(Armor headArmor) throws InvalidArmorException{
        if (allowedArmorType.contains(headArmor.getArmorType())){
            if (headArmor.getArmorSlot() == ItemSlots.HEAD){
                if(headArmor.getRequiredLevel() <= level){
                    equippedItemsHM.put(ItemSlots.HEAD, headArmor);

                }
                else{
                    throw new InvalidArmorException("Too low level to equip weapon");
                }
            }
            else {
                throw new InvalidArmorException("Invalid armor slot");
            }
        }
        else {
            throw new InvalidArmorException("Armor type not allowed");
        }
    }
    public void equipLegArmor (Armor legArmor) throws InvalidArmorException{
        if(allowedArmorType.contains(legArmor.getArmorType())){
            if (legArmor.getArmorSlot() == ItemSlots.LEGS){
                if(legArmor.getRequiredLevel() <= level){
                    equippedItemsHM.put(ItemSlots.LEGS, legArmor);
                }
                else{
                    throw new InvalidArmorException("Too low level to equip weapon");
                }
            }
            else {
                throw new InvalidArmorException("Invalid armor slot");
            }
        }
        else {
            throw new InvalidArmorException("Armor type not allowed");
        }
    }
    Attributes heroAttributes;
    public int getTotalArmorAttribute(){
        int totalArmorAttribute = heroAttributes.getLevelAttribute();
        for(Map.Entry<ItemSlots,Items> equipment : equippedItemsHM.entrySet()){
            ItemSlots slot = equipment.getKey();
            Items item = equipment.getValue();
            if(slot != ItemSlots.WEAPON && item != null){
                Armor armor = (Armor)item;
                int dex = armor.armorAttributes.getDexterity();
                int inte = armor.armorAttributes.getIntelligence();
                int str = armor.armorAttributes.getStrength();
                totalArmorAttribute += dex + inte + str;
            }
        }
        System.out.println("total armor = " + totalArmorAttribute);
        System.out.println("hero level attribute = " + heroAttributes.getLevelAttribute());
        return totalArmorAttribute;
    }
    public abstract int getTotalHeroDamage();
    public String displayHero(){
        return  getName() + " is a lv " + getLevel() + " " + getJobtitle() + ". " +
        "These are the following attributes: Dexterety: "+ heroAttributes.getDexterity() +
        " Intelligence: " + heroAttributes.getIntelligence() + " Strength: " +
        heroAttributes.getStrength() + ". With armor and weapons on is the total attributes " +
        getTotalArmorAttribute() + " and total dammage is " + getTotalHeroDamage();
    }
    public Hero(String name){
        setName(name);
        level = 1;
        equippedItemsHM.put(ItemSlots.HEAD,null);
        equippedItemsHM.put(ItemSlots.BODY, null);
        equippedItemsHM.put(ItemSlots.LEGS, null);
        equippedItemsHM.put(ItemSlots.WEAPON, null);
    }

}
