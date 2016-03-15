package com.example.dan.randomcreate_a_class;
import android.app.Activity;

import java.util.*;
import java.io.*;


/**
 * Created by Dan Gulino on March/2016.
 */
public class Reader extends Activity {

    String line = null;
    String type = null;
    String name = null;
    String test = null;
    private ArrayList<Item> ar = new ArrayList<Item>();
    private ArrayList<Item>  smg = new ArrayList<Item>();
    private ArrayList<Item> lmg = new ArrayList<Item>();
    private ArrayList<Item> shottie = new ArrayList<Item>();
    private ArrayList<Item> sniper = new ArrayList<Item>();
    private ArrayList<Item> grenade = new ArrayList<Item>();
    private ArrayList<Item> perk1 = new ArrayList<Item>();
    private ArrayList<Item> perk2 = new ArrayList<Item>();
    private ArrayList<Item> perk3 = new ArrayList<Item>();
    private ArrayList<Item> pistol = new ArrayList<Item>();
    private ArrayList<Item> attach = new ArrayList<Item>();
    private ArrayList<ArrayList<Item>> bigList = new ArrayList<ArrayList<Item>>(); //oh boy


    public void read(String input)
    {

        //make list of opjects
        Item it = new Item();
        test = input;

          String line = "";



            Scanner read = new Scanner(test);
            read.useDelimiter(":");

            //while file is not done
            while(read.hasNextLine())
            {
                //System.out.println("has next 1" + read.next());
                line = read.next();
                // try switch statement
                switch(line)
                {
                    case "AR":// line.equals("AR");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        ar.add(it);
                        break;
                    case "SMG":/// line.equals("SMG");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        smg.add(it);
                        break;
                    case "LMG":// line.equals("LMG");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        lmg.add(it);
                        break;
                    case "SHOT": //line.equals("SHOT");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        shottie.add(it);
                        break;
                    case "SCOPE": //line.equals("SCOPE");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        sniper.add(it);
                        break;
                    case "PERK1":// line.equals("PERK1");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        perk1.add(it);
                        break;
                    case "PERK2": //line.equals("PERK2");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        perk2.add(it);
                        break;
                    case "PERK3":// line.equals("PERK3");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        perk3.add(it);
                        break;
                    case "GRENADE": //line.equals("GRENADE");
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        grenade.add(it);
                        break;
                    case "PISTOL":
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        pistol.add(it);
                    case "ATTA":
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        attach.add(it);



                }

                //System.out.print(line);


                //creates a new item and puts line as its text
                //line = null;

            }

            bigList.add(ar);
            bigList.add(smg);
            bigList.add(lmg);
            bigList.add(shottie);
            bigList.add(sniper);
            bigList.add(attach);
            bigList.add(pistol);
            bigList.add(grenade);
            bigList.add(perk1);
            bigList.add(perk2);
            bigList.add(perk3);





       /*}
        catch(FileNotFoundException e)
        {
            System.out.println("Unable to open file '" +  test + "'" );

        }*/


    }
    /////Allows other classes to access the array lists\\\\\\\\
    public ArrayList<Item> getAr()
    {
        return ar;
    }
    public ArrayList<Item> getSmg()
    {
        return smg;
    }
    public ArrayList<Item> getLmg()
    {
        return lmg;
    }
    public ArrayList<Item> getShot()
    {
        return shottie;
    }
    public ArrayList<Item> getSniper()
    {
        return sniper;
    }
    public ArrayList<Item> getPistol()
    {
        return pistol;
    }
    public ArrayList<Item> getPerk1()
    {
        return perk1;
    }
    public ArrayList<Item> getPerk2()
    {
        return perk2;
    }
    public ArrayList<Item> getPerk3()
    {
        return perk3;
    }
    public ArrayList<Item> getGrenade()
    {
        return grenade;
    }
    public ArrayList<ArrayList<Item>> getBigArrayList()
    {
        return bigList;
    }



}
