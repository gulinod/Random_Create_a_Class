package com.example.dan.randomcreate_a_class;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


           /* my additions                                 */


    }
    public void buttonOnClick(View v)
    {
        //for testing; deal with the file io later
        String test = "AR:M-16:AR:M4:AR:AK-47:AR:M-14:AR:G36c:AR:G3:AR:MP44:SMG:MP5:SMG:Mini Uzi:SMG:Skorpian:SMG:P90:SMG:AK74u:LMG:M249 SAW:LMG:RPD:LMG:M60:SHOT:W1200:SHOT:M1014:SCOPE:M40A3:SCOPE:M21:SCOPE:Dragunov:SCOPE:r700:SCOPE:Barrett .50 Cal:PISTOL:M9:PISTOL:USP:PISTOL:M1911:PISTOL:Desert Eagle:PERK1:C4 x 2:PERK1:Special Grenades x 3:PERK1:RPG x 2:PERK1:Bomb Squad:PERK1:Bandolier:PERK2:Juggernaut:PERK2:SLight of Hand:PERK2:Double Tap:PERK2:Overkill:PERK2:UAV Jammer:PERK2:Sonic Boom:PERK2:Stopping power:PERK3:Extreme Conditioning:PERK3:Last Stand:PERK3:Martyrdom:PERK3:Deep Impact:PERK3:Iron Lungs:PERK3:Dead Silence:PERK3:Eavesdrop:PERK3:Steady Aim:GRENADE:Explosive:GRENADE:Flash Bang:GRENADE:Stun:GRENADE:Smoke:ATTA:GRIP:ATTA:Iron Sights:ATTA:Red Dot Sight:ATTA:ACOG Scope:ATTA:Silencer:ATTA:Grenade Launcher:\n" ;
       // Button button =(Button) v;
        //((Button) v).setText("Clicked!");

        ArrayList<ArrayList<Item>> bigList1 = new ArrayList<ArrayList<Item>>(); //oh boy
        ArrayList<Item>  list = new ArrayList<Item>();
        Reader r = new Reader(); //new reader objects

        r.read(test);
        bigList1 = r.getBigArrayList();
        outDisp(bigList1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
         output = rand.nextInt((max - min) +1) + min;


        return output;
    }
    public void outDisp(ArrayList<ArrayList<Item>> bigList1)
    {

        int i = 0;
        int j =0;
        int k =0;

        TextView primaryText = (TextView) findViewById(R.id.PrimaryWeaponInfo);
        TextView secondaryText = (TextView) findViewById(R.id.SecondaryWeaponInfo);
        TextView grenadeText = (TextView) findViewById(R.id.GrenadeInfo);
        TextView perk1Text = (TextView) findViewById(R.id.Perk1Info);
        TextView perk2Text = (TextView) findViewById(R.id.Perk2Info);
        TextView perk3Text = (TextView) findViewById(R.id.Perk3Info);

        //primary weapon
        i= getItems(5);
        j = bigList1.get(i).size();
        k = getItems(j);
        primaryText.setText(bigList1.get(i).get(k).getName());

        setAttach(i, k, bigList1);
        i = 6;
        j = bigList1.get(i).size();
        secondaryText.setText(bigList1.get(i).get(getItems(j)).getName());
        i = 7;
        j = bigList1.get(i).size();
        grenadeText.setText(bigList1.get(i).get(getItems(j)).getName());
        i = 8;
        j = bigList1.get(i).size();
        perk1Text.setText(bigList1.get(i).get(getItems(j)).getName());
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
        final int AR_MIN = 1;
        final int AR_MAX = 5;
        TextView attachText = (TextView)findViewById(R.id.attatchmentInfo);

        if(blVert == 1 && blHorz == 6)
        {
            attachText.setText("Iron Sights");

        }
        else if(blVert == 1)
        {
            attachText.setText(bigList.get(5).get(attachRand(AR_MIN, AR_MAX)).getName());
            //comment
        }



    }
}
