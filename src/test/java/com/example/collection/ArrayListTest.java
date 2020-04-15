package com.example.collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    private ArrayList<Integer> items;

    @Before
    public void initList() {
        items = new ArrayList<>();
    }

    @Test
    public void isEmptyShouldReturnTrueForEmptyList() {
        final boolean expected = true;
        final boolean actual = items.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyShouldReturnFalseForNotEmptyList() {
        items.addItem(1);

        final boolean expected = false;
        final boolean actual = items.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeShouldReturnZeroIfListEmpty(){
        final int expected = 0;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeShouldReturnOneIfListHasOneElement(){
        items.addItem(1);

        final int expected = 1;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeShouldReturnTwoIfListHasTwoElements(){
        items.addItem(1);
        items.addItem(2);

        final int expected = 2;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeShouldReturn3IfListHas3Elements(){
        items.addItem(1);
        items.addItem(2);
        items.addItem(3);

        final int expected = 3;
        final int actual = items.size();

        assertEquals(expected, actual);
    }


}
