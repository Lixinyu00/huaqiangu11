package com.example.huaqiangu;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_3 extends Activity{
	Button btn1,btn3,btn4;
	EditText tx;
	public void onCreate(Bundle savedInstanceState) {
		
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.a_3);
		tx=(EditText)findViewById(R.id.pw);
		btn1=(Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(new MyButtonListener());
		btn3=(Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(new MyButtonListener());
		btn4=(Button) findViewById(R.id.btn_4);
		btn4.setOnClickListener(new MyButtonListener());
	}
	class MyButtonListener implements OnClickListener{
		@Override
		public void onClick(View v){
			Intent intent = new Intent();
			switch (v.getId()) {
			case R.id.btn_1:
				intent.setClass(Activity_3.this, Video_2.class);
				Activity_3.this.startActivity(intent);
				Activity_3.this.finish();
				break;
			case R.id.btn_3:
				if(tx.getText().toString().equals("729654")){
					intent.setClass(Activity_3.this, Activity_4.class);
					Activity_3.this.startActivity(intent);
				}
				else{
					Toast.makeText(Activity_3.this, " ‰»Î¥ÌŒÛ£¨«Î÷ÿ ‘£°", Toast.LENGTH_LONG).show();
				}
				break;
			case R.id.btn_4:
				intent.setClass(Activity_3.this, Activity_2.class);
				Activity_3.this.startActivity(intent);
				Activity_3.this.finish();
				break;
				
			}
		}
		
	}

	public boolean onKeyDown(int keyCode,KeyEvent event){
		 switch(keyCode){
		 //case KeyEvent.KEYCODE_HOME:return true;
		 case KeyEvent.KEYCODE_BACK:return true;
		
		 /*case KeyEvent.KEYCODE_CALL:return true;
		 case KeyEvent.KEYCODE_SYM: return true;
		 case KeyEvent.KEYCODE_VOLUME_DOWN: return true;
		 case KeyEvent.KEYCODE_VOLUME_UP: return true;
		 case KeyEvent.KEYCODE_STAR: return true;*/
		 }
		 return super.onKeyDown(keyCode, event);
		 }
}
