package com.test;

import com.iterator.ArrayIterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayIteratorTest {

    @Test
    public void test1CheckRemoveElement()
    {
        ArrayList arr = new ArrayList<Object>();

        arr.add("hello");
        arr.add("hola");
        arr.add("privet");

        ArrayIterator<String> arrIter = new ArrayIterator<String>(arr);
        arrIter.iterator().remove();
        arrIter.iterator().remove();
        arrIter.iterator().remove();
        Assert.assertEquals(0, arr.size());
    }

    @Test
    public void test2CheckHasNext()
    {
        ArrayList arr = new ArrayList<Object>();
        arr.add("hello");
        ArrayIterator<String> arrIter = new ArrayIterator<String>(arr);

        Assert.assertEquals(true, arrIter.iterator().hasNext());
        arrIter.iterator().remove();
        arr.add(null);
        Assert.assertEquals(false, arrIter.iterator().hasNext());
    }

    @Test
    public void test3CheckNextObject()
    {
        ArrayList arr = new ArrayList<Object>();
        arr.add("hello");
        ArrayIterator<String> arrIter = new ArrayIterator<String>(arr);

       Assert.assertEquals(arr.get(0), arrIter.iterator().next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test4EmptyList()
    {
        ArrayList arr = new ArrayList<Object>();
        arr.add("something");
        ArrayIterator<String> arrIter = new ArrayIterator<String>(arr);
        arrIter.iterator().remove();
        Assert.assertEquals(false, arrIter.iterator().hasNext());
    }

}
