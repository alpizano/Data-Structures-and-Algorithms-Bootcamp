package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DynamicArrayTest {
    DynamicArray<String> array;

    @Before
    public void setUp() {
        array = new DynamicArray(5);
    }

    @Test
    public void getTest() {

    }

    @Test
    public void setTest() {

    }

    @Test
    public void insertTestUnderCapacity() {
        array.add("1");
        array.add("4");
        array.add("8");

        array.insert(1,"69");

        Assert.assertEquals("1", array.get(0));
        Assert.assertEquals("69", array.get(1));
        Assert.assertEquals("4", array.get(2));
        Assert.assertEquals("8", array.get(3));
    }

    @Test
    public void insertTestOverCapacity() {
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");

        array.insert(5,"69");

        Assert.assertEquals("1", array.get(0));
        Assert.assertEquals("2", array.get(1));
        Assert.assertEquals("3", array.get(2));
        Assert.assertEquals("4", array.get(3));
        Assert.assertEquals("5", array.get(4));
    }

    @Test
    public void addTest() {
        array.add("1");
        array.add("4");
        array.add("8");

        Assert.assertEquals("1", array.get(0));
        Assert.assertEquals("4", array.get(1));
        Assert.assertEquals("8", array.get(2));
    }
}
