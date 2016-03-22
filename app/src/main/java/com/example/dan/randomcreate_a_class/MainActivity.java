package com.example.dan.randomcreate_a_class;
/**
 * Created by Dan Gulino, March 2016.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ArrayList<Item>> bigList1 = new ArrayList<ArrayList<Item>>(); //arraylist containing arraylists of items
    Reader r = new Reader(); //new reader objects
    int flag;                //global flag variable to assist in finding attachments
    ImageView primWeap;      //imageView used for the primary weapon. more to come soon

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        primWeap = (ImageView) findViewById(R.id.primaryImage);

        //for !!TESTING ONLY!!  proper file IO comes later
        String test = "AR:M-16:AR:M4:AR:AK-47:AR:M-14:AR:G36c:AR:G3:AR:MP44:SMG:MP5:SMG:Mini Uzi:SMG:Skorpian:SMG:P90:SMG:AK74u:LMG:M249 SAW:LMG:RPD:LMG:M60:SHOT:W1200:SHOT:M1014:SCOPE:M40A3:SCOPE:M21:SCOPE:Dragunov:SCOPE:r700:SCOPE:Barrett .50 Cal:PISTOL:M9:PISTOL:USP:PISTOL:M1911:PISTOL:Desert Eagle:PERK1:C4 x 2:PERK1:Special Grenades x 3:PERK1:RPG x 2:PERK1:Bomb Squad:PERK1:Bandolier:PERK2:Juggernaut:PERK2:Slight of Hand:PERK2:Double Tap:PERK2:Overkill:PERK2:UAV Jammer:PERK2:Sonic Boom:PERK2:Stopping power:PERK3:Extreme Conditioning:PERK3:Last Stand:PERK3:Martyrdom:PERK3:Deep Impact:PERK3:Iron Lungs:PERK3:Dead Silence:PERK3:Eavesdrop:PERK3:Steady Aim:GRENADE:Explosive:GRENADE:Flash Bang:GRENADE:Stun:GRENADE:Smoke:ATTA:Grip:ATTA:Iron Sights:ATTA:Red Dot Sight:ATTA:ACOG Scope:ATTA:Silencer:ATTA:Grenade Launcher:\n" ;

        //calls the read function to get the names of the weapons as well as drawable id
        r.read(test);
        bigList1 = r.getBigArrayList();
        flag = 0;

    }
    public void buttonOnClick(View v)
    {

        outDisp(bigList1);
    }

    public static int getItems(int select)
    {
        /* Selects random spot in the arrayList*/
        int output = 0;
        int n = 0;

        Random rand = new Random();

        output = rand.nextInt(select);

        return output;
    }
    //returns a random number within a range its given
    public static int attachRand(int min, int max)
    {
        int output = 0;
        Random rand =  new Random();

        //finds the correct range for the attachment type.
        output = rand.nextInt((max - min) +1) + min;


        return output;
    }
    public void outDisp(ArrayList<ArrayList<Item>> bigList1)
    {

        int i =0; //position of arraylist
        int j =0; //poistion of the arraylist of items in the arraylist
        int k =0; //allows setAttach method to know what weapon the attachment is for

        TextView primaryText = (TextView) findViewById(R.id.PrimaryWeaponInfo);
        TextView secondaryText = (TextView) findViewById(R.id.SecondaryWeaponInfo);
        TextView grenadeText = (TextView) findViewById(R.id.GrenadeInfo);
        TextView perk1Text = (TextView) findViewById(R.id.Perk1Info);
        TextView perk2Text = (TextView) findViewById(R.id.Perk2Info);
        TextView perk3Text = (TextView) findViewById(R.id.Perk3Info);
        ImageView primWeap = (ImageView) findViewById(R.id.primaryImage);


        //primary weapon
        i= getItems(5);
        j = bigList1.get(i).size();
        k = getItems(j);
        primaryText.setText(bigList1.get(i).get(k).getName());

        //set image resources for primary weapon (Soon to include perks and more!)
        primWeap.setImageResource(R.color.colorMainActivityBG);
        primWeap.setBackgroundColor(getResources().getColor(R.color.colorMainActivityBG));
        primWeap.setImageResource(bigList1.get(i).get(k).getPicLoc());

        setAttach(i, k, bigList1);
        i = 6;
        j = bigList1.get(i).size();
        secondaryText.setText(bigList1.get(i).get(getItems(j)).getName());
        i = 7;
        j = bigList1.get(i).size();
        grenadeText.setText(bigList1.get(i).get(getItems(j)).getName());
        i = 8;
        j = bigList1.get(i).size();

        if(flag ==0)//handles if a perk is valid with the current weapon configuration
        {
            perk1Text.setText(bigList1.get(i).get(getItems(j)).getName());
        }
        else
        {
            perk1Text.setText("Disabled");

            //reset flag
            flag = 0;
        }
        i = 9;
        j = bigList1.get(i).size();
        perk2Text.setText(bigList1.get(i).get(getItems(j)).getName());
        i = 10;
        j = bigList1.get(i).size();
        perk3Text.setText(bigList1.get(i).get(getItems(j)).getName());

    }
    public  void setAttach(int blVert, int blHorz, ArrayList<ArrayList<Item>> bigList)
    {
        //takes in a weapon type and determines what atachments to randomize for it
        final int MIN = 1;
        final int AR_MAX = 5;
        final int SMG_MAX = 4;
        final int LMG_MIN = 0;
        final int LMG_MAX = 3;
        final int SHOT_MAX = 2;
        int flip = 0;

        TextView attachText = (TextView)findViewById(R.id.attatchmentInfo);
        //Determins attachments for AR's
        if(blVert == 0 && blHorz == 6)
        {
            attachText.setText("Iron Sights");

        }
        else if(blVert == 0)
        {
            attachText.setText(bigList.get(5).get(attachRand(MIN, AR_MAX)).getName());

        }
        if(blVert == 1)//attachments for SMG's
        {
            attachText.setText(bigList.get(5).get(attachRand(MIN, SMG_MAX)).getName());
        }
        if(blVert == 2)//attachment LGM's
        {
            attachText.setText(bigList.get(5).get(attachRand(LMG_MIN, LMG_MAX)).getName());
            if(attachText.getText().equals("Grip"))//if the attachment determined is a grip then throw the flag
            {
                flag = 1;
            }
        }
        if(blVert == 3)
        {
            attachText.setText(bigList.get(5).get(attachRand(LMG_MIN, SHOT_MAX)).getName());
            if(attachText.getText().equals("Grip"))//if the attachment determined is a grip set the flag
            {
                flag = 1;
            }
        }
        if(blVert == 4) //50/50 chance for ACOG or Defualt scope
        {
             flip = attachRand(LMG_MIN, AR_MAX);
            if(flip < 3)
            {
                attachText.setText("Scope");
            }
            else
            {
                attachText.setText("Acog Scope");
            }

        }


    }

}
