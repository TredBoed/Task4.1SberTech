package com.iterator;

 import java.util.ArrayList;
 import java.util.Iterator;


public  class ArrayIterator<Object> implements Iterable<Object>
{
    private ArrayList<Object> list;
    private int currentSize;

    public ArrayIterator(ArrayList<Object> newList)
    {
        this.list = newList;
        this.currentSize = newList.size();
    }

    public ArrayList<Object> getList() {
        return list;
    }


    @Override
    public Iterator<Object> iterator()
    {
        Iterator<Object> it = new Iterator<Object>()
        {
            private int currentIndex = 0;
            @Override
            public boolean hasNext()
            {
                return currentIndex < currentSize && list.get(currentIndex) != null && !list.isEmpty();
            }

            @Override
            public Object next()
            {
                return list.get(currentIndex++);
            }

            @Override
            public void remove()
            {
                list.remove(currentIndex);
            }
        };
        return it;
    }
}