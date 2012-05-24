package de.berlin.htw;

import de.berlin.htw.helper.OpenGLRenderer;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class OpenGLActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//For getting a Fullscreen
		  this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
	      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	      WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
	      //all for the view and the Render		
		GLSurfaceView view = new GLSurfaceView(this); // SurfaceView speziell für opengl anwendungen
		view.setRenderer(new OpenGLRenderer()); //extra class
		setContentView(view);
	}

}
