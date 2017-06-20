package com.example.huaqiangu;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {
	private Button btn_1 = null;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN); // »´∆¡œ‘ æ
		setContentView(R.layout.into);
		this.setTitle("true");

		btn_1 = (Button) findViewById(R.id.btn_1);
		btn_1.setOnClickListener(new MyButtonListener());

	}

	class MyButtonListener implements OnClickListener {
		public void onClick(View v) {
			if (v == btn_1) {
				Intent intent = new Intent(MainActivity.this,
						Video_1.class);
				startActivity(intent);
				MainActivity.this.finish();
			}
		}
	}
}
