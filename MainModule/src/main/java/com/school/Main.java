package com.school;

import com.iterator.ArrayIterator;
import com.sample.SampleObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Object>();

        arr.add(new SampleObject("Tom", 19));
        arr.add(new SampleObject("Mary", 18));
        arr.add(new SampleObject("Sue", 43));
        arr.add(new SampleObject("Jenny", 31));
        arr.add(new SampleObject("Joe", 21));
        arr.add(new SampleObject("David", 40));
        arr.add(new SampleObject("Bred", 34));
        arr.add(new SampleObject("Judi", 17));

        ArrayIterator<SampleObject> arrIter = new ArrayIterator<SampleObject>(arr);

        for (SampleObject obj : arrIter) {
            obj.doSomething();
        }

    }
}
