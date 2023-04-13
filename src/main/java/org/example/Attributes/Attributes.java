package org.example.Attributes;

public class Attributes {
    private int intelligence;
    private int dexterity;
    private int strength;

    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getStrength(){
        return strength;
    }
    public int setDexterity(int setDex){
      dexterity = setDex;
      return dexterity;
    }
    public int setIntelligence(int setInt){
        intelligence = setInt;
        return intelligence;
    }
    public int setStrength(int setStr){
        strength = setStr;
        return strength;
    }

   public int getLevelAttribute() {
        return  getDexterity() + getIntelligence() + getStrength();
    }
    public Attributes(int dex, int inte, int str){
        dexterity = dex;
        intelligence = inte;
        strength = str;
    }
}
