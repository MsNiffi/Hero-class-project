package org.example.Items.Armor;
import org.example.Attributes.Attributes;
import org.example.Enum.ArmorType;
import org.example.Enum.ItemSlots;

import org.example.Items.Items;

public class Armor extends Items {

private ItemSlots armorSlot;
public ItemSlots getArmorSlot(){return armorSlot;}
public ItemSlots setArmorSlot(ItemSlots setSlot){ armorSlot = setSlot;
return armorSlot;}

private ArmorType armorType;
public ArmorType getArmorType(){return armorType;}
public ArmorType setArmorType(ArmorType setArmorType){armorType = setArmorType;
return armorType;}

public Attributes armorAttributes;


    public Armor(String name,
                 int requiredLevel,
                 ItemSlots slot,
                 ArmorType armorType,
                 int inte,
                 int str,
                 int dex) {
        super(name, requiredLevel);
        this.armorType = armorType;
        armorSlot = slot;
        armorAttributes = new Attributes(dex,inte, str);



    }

}
