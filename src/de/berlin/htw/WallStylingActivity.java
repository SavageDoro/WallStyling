package de.berlin.htw;


import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WallStylingActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // onCreate = Callback Methode - hier findet Initialisierung der Activity statt
        setContentView(R.layout.wallstyling); // wichtig dafür der passende View
        
        Button paintButton = (Button) findViewById(R.id.paint_btn);
    	final  Intent intent = new Intent(this, de.berlin.htw.PaintActivity.class);
		paintButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View paint) {
				startActivity(intent);
			}
		});
	        
		Button shakebutton = (Button) findViewById(R.id.shake_btn);
		final  Intent intent2 = new Intent(this, de.berlin.htw.ShakingActivity.class);
        shakebutton.setOnClickListener(new View.OnClickListener() {
          public void onClick(View shaking) {
            startActivity(intent2);
          }	
        });
        
        Button openGL = (Button) findViewById(R.id.opengl_btn);
		final  Intent intent3 = new Intent(this, de.berlin.htw.BluetoothConnection.class);
        openGL.setOnClickListener(new View.OnClickListener() {
          public void onClick(View main) {	
            startActivity(intent3);
          }	
        });
        
               
    }
}

