package org.example.Items.Weapons;
import org.example.Enum.*;
import org.example.Items.Items;

public class Weapons extends Items {
   private ItemSlots itemSlot = ItemSlots.WEAPON;
    private WeaponType weaponType;

    public ItemSlots getItemSlot(){return itemSlot;}
    public WeaponType getWeaponType(){return weaponType;}

    private int weaponDamange;
    public int getWeaponDamange(){return weaponDamange;}
    public int setWeaponDamange(int setWeaponDamage){
        this.weaponDamange = setWeaponDamage;
    return weaponDamange;}


    public Weapons(String name,
                   int requiredLevel,
                   WeaponType weaponType,
                   int weaponDamange){
        super(name, requiredLevel);
        this.weaponType = weaponType;
        this.weaponDamange = weaponDamange;
    }
}
