package com.example.collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

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

    @Test
    public void removeItemByIndexShouldRemoveFirstItemFromListThatHaveOneElement() {
        items.addItem(1);

        items.removeItemByIndex(0);

        final int expected = 0;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldRemoveFirstItemFromListThatHaveTwoElements(){
        items.addItem(1);
        items.addItem(2);

        items.removeItemByIndex(0);

        final int expected = 1;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void  removeItemByIndexShouldRemoveSecondItemFromListThatHaveTwoElements(){
        items.addItem(1);
        items.addItem(2);

        items.removeItemByIndex(1);

        final int expected = 1;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldRemoveMiddleItemFromListThatHaveSixElements(){
        items.addItem(1);
        items.addItem(2);
        items.addItem(3);
        items.addItem(4);
        items.addItem(5);
        items.addItem(6);

        items.removeItemByIndex(3);

        final int expected = 5;
        final int actual = items.size();

        assertEquals(expected, actual);
    }

    @Test
    public void removeItemByIndexShouldThrowIllegalArgumentExceptionIfIndexLessThenZero(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Wrong argument value");

        items.removeItemByIndex(-5);
    }

    @Test
    public void removeItemByIndexShouldThrowIllegalArgumentExceptionIfIndexMoreThenSize(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Wrong argument value");
        items.addItem(1);

        items.removeItemByIndex(197);
    }

    @Test
    public void removeItemByIndexShouldThrowIllegalArgumentExceptionIfIndexIsZeroButListIsEmpty(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("List is empty");

        items.removeItemByIndex(0);
    }

}
