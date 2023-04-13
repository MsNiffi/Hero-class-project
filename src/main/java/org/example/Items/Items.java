package org.example.Items;



public class Items {
   private String name;
   private int requiredLevel;


   public String getName(){return name;}
   public String setName(String setName){
       name = setName;
       return name;
    }

    public int getRequiredLevel(){return requiredLevel;}
    public int setRequiredLevel(int setRequiredLevel){
       requiredLevel = setRequiredLevel;
       return requiredLevel;
    }


    public Items(String name, int requiredLevel){
        this.name = name;
        this.requiredLevel = requiredLevel;
    }


}
