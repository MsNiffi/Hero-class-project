package org.example.Attributes;

import org.example.Character.BlackMage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttributesTest {
    @Test
    public void test_getDexterity_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.getDexterity(), 1);
    }
    @Test
    public void test_getIntelligence_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.getIntelligence(), 2);
    }
    @Test
    public void test_getStrength_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.getStrength(), 3);
    }
    @Test
    public void test_setDexterity_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.setDexterity(4), 4);
    }
    @Test
    public void test_setIntelligence_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.setIntelligence(3), 3);
    }
    @Test
    public void test_setStrength_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.setStrength(1), 1);
    }
    @Test
    public void test_getLevelAttribute_should_pas(){
        Attributes attributes = new Attributes(1,2,3);
        assertEquals(attributes.getLevelAttribute(), 6 );
    }





}