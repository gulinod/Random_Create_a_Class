package com.example.dan.randomcreate_a_class;
import android.app.Activity;

import java.util.*;


/**
 * Created by Dan Gulino, March 2016.
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

        //make list of opjects
        Item it = new Item();



          String line = "";

            //add images to the image ID array (has to be a better way to do this)
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
            //Scanner loc =  new Scanner(locations);

            read.useDelimiter(":");

            //while file is not done
            while(read.hasNextLine())
            {
                line = read.next();
                switch(line)
                {
                    case "AR":
                        //gets the string after appropriate case
                        line = read.next();
                        //sets name equal to line
                        name = line;
                        //creates a new item with appropriate text and image
                        it = new Item(name,images.get(i));
                        //adds it item to ar array
                        ar.add(it);
                        //increment counter
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

            //adds ArrayList<Item's> to the appropriate positin.
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
