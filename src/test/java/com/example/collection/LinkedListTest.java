package com.example.collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private LinkedList<Integer> items;

    @Before
    public void init(){
        items = new LinkedList<>();
    }

    @Test
    public void isEmptyShouldReturnTrueIfListIsEmpty(){
       final boolean expected = true;
       final boolean actual = items.isEmpty();

       assertEquals(expected, actual);
    }

    @Test
    public void isEmptyShouldReturnFalseIfListIsNotEmpty(){
        items.addItem(1);

        final boolean expected = false;
        final boolean actual = items.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeShouldReturnZeroIfListIsEmpty(){
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
    public void sizeShouldReturnTwoIfListHasTwoElement(){
        items.addItem(1);
        items.addItem(2);

        final int expected = 2;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldRemoveItemFromListWithOneElement(){
        items.addItem(1);

        items.removeItemByIndex(0);

        final boolean expected = true;
        final boolean actual = items.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldRemoveSecondItemFromListWithTwoElements(){
        items.addItem(1);
        items.addItem(2);

        items.removeItemByIndex(1);

        final int expected = 1;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldRemoveFirstItemFromListWithTwoElements(){
        items.addItem(1);
        items.addItem(2);

        items.removeItemByIndex(0);

        final int expected = 1;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldThrowIllegalArgumentExceptionIfIndexIsLessThenZero(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Wrong argument value");

        items.removeItemByIndex(-1);
    }

    @Test
    public void removeItemByIndexShouldThrowIllegalArgumentExceptionIfIndexMoreThenSize(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Wrong argument value");
        items.addItem(0);

        items.removeItemByIndex(300);
    }

    @Test
    public void removeItemByIndexShouldThrowIllegalArgumentExceptionIfIndexIsZeroButListIsEmpty(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("List is empty");
        items.removeItemByIndex(0);
    }
}
