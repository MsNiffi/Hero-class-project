package org.example.Items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {

    @Test
    public void test_getName_should_pas(){
        Items i = new Items("Box",1);
        assertEquals(i.getName(),"Box");
    }
    @Test
    public void test_setName_should_pas(){
        Items i = new Items("Box",1);
        assertEquals(i.setName("Orange"),"Orange");
    }
@Test
    public void test_getRequiredLevel_should_pas(){
    Items i = new Items("Box",1);
    assertEquals(i.getRequiredLevel(), 1);
}
    @Test
    public void test_setRequiredLevel_should_pas(){
        Items i = new Items("Box",1);
        assertEquals(i.setRequiredLevel(2), 2);
    }



}