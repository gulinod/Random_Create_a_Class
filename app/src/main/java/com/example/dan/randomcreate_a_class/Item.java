package com.example.dan.randomcreate_a_class;

/**
 * Created by Dan | March 2016.
 */
public class Item {

    private String itemName = null;
    private int picLoc = 0;


    public Item()
    {

    }
    public Item(String name)
    {
        itemName = name;

    }
    public Item(String name, int loc)
    {
        itemName = name;
        picLoc = loc;

    }

    public String getName()
    {
        return itemName;
    }
    public int getPicLoc()
    {
        return picLoc;
    }
    public void setName(String name)
    {
        itemName = name;
    }
    public void setPicLoc(int loc)
    {
        picLoc = loc;
    }

}
