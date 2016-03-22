package com.example.dan.randomcreate_a_class;
import android.app.Activity;

import java.util.*;

/**
 * Created by Dan Gulino March|2016.
 */
public class Reader extends Activity {


    String name = null;
    int i =0;
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
    private ArrayList<Integer> images = new ArrayList<Integer>();


    public void read(String weapons)
    {


        Item it = new Item();



          String line = "";

            //adds drable weapon image ID's to an arraylist of ints (Has to be a better way)
            images.add(R.drawable.weap_1);
            images.add(R.drawable.weap_2);
            images.add(R.drawable.weap_3);
            images.add(R.drawable.weap_4);
            images.add(R.drawable.weap_5);
            images.add(R.drawable.weap_6);
            images.add(R.drawable.weap_7);
            images.add(R.drawable.weapon_mp5);
            images.add(R.drawable.weapon_mini_uzi);
            images.add(R.drawable.weapon_skorpion);
            images.add(R.drawable.weapon_p90);
            images.add(R.drawable.weapon_aks74u);
            images.add(R.drawable.weapon_m249saw);
            images.add(R.drawable.weapon_rpd);
            images.add(R.drawable.weapon_m60e4);
            images.add(R.drawable.weapon_winchester1200_grip);
            images.add(R.drawable.weapon_benelli_m4);
            images.add(R.drawable.weapon_m40a3);
            images.add(R.drawable.weapon_m14_scoped);
            images.add(R.drawable.weapon_dragunovsvd);
            images.add(R.drawable.weapon_remington700);
            images.add(R.drawable.weapon_barrett50cal);



        Scanner read = new Scanner(weapons);


            read.useDelimiter(":");


            while(read.hasNextLine())
            {

                line = read.next();

                switch(line)
                {
                    case "AR":// checks line againts the case statement
                        //if the case is true read the next line to get the weapon
                        line = read.next();
                        //set name = to line?
                        name = line;
                        //create a new object with weapon name and drawable image ID
                        it = new Item(name,images.get(i));
                        //adds to array list for the catagory
                        ar.add(it);
                        //increments the counter for drawable ID array These comments hold true
                        //for the rest of the switch statement
                        i++;
                        break;
                    case "SMG":
                        line = read.next();
                        name = line;
                        it = new Item(name,images.get(i));
                        smg.add(it);
                        i++;
                        break;
                    case "LMG":
                        line = read.next();
                        name = line;
                        it = new Item(name,images.get(i));
                        lmg.add(it);
                        i++;
                        break;
                    case "SHOT":
                        line = read.next();
                        name = line;
                        it = new Item(name,images.get(i));
                        shottie.add(it);
                        i++;
                        break;
                    case "SCOPE":
                        line = read.next();
                        name = line;
                        it = new Item(name,images.get(i));
                        sniper.add(it);
                        i++;
                        break;
                    case "PERK1":
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        perk1.add(it);
                        break;
                    case "PERK2":
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        perk2.add(it);
                        break;
                    case "PERK3":
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        perk3.add(it);
                        break;
                    case "GRENADE":
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
                        break;
                    case "ATTA":
                        line = read.next();
                        name = line;
                        it = new Item(name);
                        attach.add(it);
                        break;



                }

            }

            //add arraylists of items to the arraylist
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


    }
    //Allows other classes to access the array lists
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
