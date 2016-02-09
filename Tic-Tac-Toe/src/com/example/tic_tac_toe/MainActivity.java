package com.example.tic_tac_toe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
    } 
    boolean player=false,winner=false;
    int count=0;
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void set(View v)
    {
    	Button b= (Button) v;
    	if(player)
    	{
    		b.setText("X");
    		b.setClickable(false);
    		player=!player;
    		check();
    		
    	}
    	else
    	{
    		b.setText("O");
    		b.setClickable(false);
    		player=!player;
    		check();
    	}
    }
    public void check()
    {
    	Button b1=(Button) findViewById(R.id.button1);
    	Button b2=(Button) findViewById(R.id.button2);
    	Button b3=(Button) findViewById(R.id.button3);
    	Button b4=(Button) findViewById(R.id.button4);
    	Button b5=(Button) findViewById(R.id.button5);
    	Button b6=(Button) findViewById(R.id.button6);
    	Button b7=(Button) findViewById(R.id.button7);
    	Button b8=(Button) findViewById(R.id.button8);
    	Button b9=(Button) findViewById(R.id.button9);
    	if((b1.getText()==b2.getText())&&(b1.getText()==b3.getText())&&(b1.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b4.getText()==b5.getText())&&(b4.getText()==b6.getText())&&(b5.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b7.getText()==b8.getText())&&(b7.getText()==b9.getText())&&(b7.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b1.getText()==b4.getText())&&(b1.getText()==b7.getText())&&(b1.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b5.getText()==b2.getText())&&(b2.getText()==b8.getText())&&(b2.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b6.getText()==b9.getText())&&(b9.getText()==b3.getText())&&(b3.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b1.getText()==b5.getText())&&(b1.getText()==b9.getText())&&(b1.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if((b3.getText()==b5.getText())&&(b7.getText()==b3.getText())&&(b3.isClickable()==false))
    	{
    		winner=true;
    		
    	}
    	if(count==0)
    	{
    	if(winner)
    	{
    		if(!player)
    		{
    			Toast.makeText(getApplicationContext(), "X is winner", Toast.LENGTH_LONG).show();
    			count++;
    		}
    		else
    		{
    			Toast.makeText(getApplicationContext(), "O is winner", Toast.LENGTH_LONG).show();
    			count++;
    		}
    	}
    	}
    	else
    		Toast.makeText(getApplicationContext(), "game over \n reset the game", Toast.LENGTH_LONG).show();
    }
    public void reset(View v)
    {
    	Button b10=(Button) findViewById(R.id.button10);
    	Button b1=(Button) findViewById(R.id.button1);
    	Button b2=(Button) findViewById(R.id.button2);
    	Button b3=(Button) findViewById(R.id.button3);
    	Button b4=(Button) findViewById(R.id.button4);
    	Button b5=(Button) findViewById(R.id.button5);
    	Button b6=(Button) findViewById(R.id.button6);
    	Button b7=(Button) findViewById(R.id.button7);
    	Button b8=(Button) findViewById(R.id.button8);
    	Button b9=(Button) findViewById(R.id.button9);
    	b1.setClickable(true);
    	b2.setClickable(true);
    	b3.setClickable(true);
    	b4.setClickable(true);
    	b5.setClickable(true);
    	b6.setClickable(true);
    	b7.setClickable(true);
    	b8.setClickable(true);
    	b9.setClickable(true);
    	b1.setText("");
    	b2.setText("");
    	b3.setText("");
    	b4.setText("");
    	b5.setText("");
    	b6.setText("");
    	b7.setText("");
    	b8.setText("");
    	b9.setText("");
    	player=false;
    	winner=false;
    	count=0;
    }
}
