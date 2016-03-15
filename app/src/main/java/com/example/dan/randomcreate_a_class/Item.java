package com.example.dan.randomcreate_a_class;

/**
 * Created by Dan on 3/10/2016.
 */
public class Item {

    private String itemName = null;
    private String picLoc = null;


    public Item()
    {

    }
    public Item(String name)
    {
        itemName = name;

    }
    public Item(String name, String loc)
    {
        itemName = name;
        picLoc = loc;

    }

    public String getName()
    {
        return itemName;
    }
    public String getPicLoc()
    {
        return picLoc;
    }
    public void setName(String name)
    {
        itemName = name;
    }
    public void setPicLoc(String loc)
    {
        picLoc = loc;
    }

}
