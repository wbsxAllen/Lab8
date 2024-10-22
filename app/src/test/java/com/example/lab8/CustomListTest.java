package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.sql.Array;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mcklist for my citylist
     * @return
     */

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testHasCity() {
        CustomList customList = new CustomList(context, new ArrayList<>());
        City city = new City("Shanghai", "Shanghai");
        customList.addCity(city);
        assertTrue(customList.hasCity(city));
        assertFalse(customList.hasCity(new City("Beijing", "Beijing")));
    }

}
