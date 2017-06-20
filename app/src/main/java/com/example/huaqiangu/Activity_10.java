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

import com.example.huaqiangu.Activity_7.MyButtonListener;

public class Activity_10 extends Activity {
	Button btn1,btn2,btn3;
	EditText tx;
	static int i=0;
	private static final int dialog3 = 3;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.a_10);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		tx=(EditText) findViewById(R.id.pw);
		btn1=(Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(new MyButtonListener());
		btn3=(Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(new MyButtonListener());
		btn2 = (Button)findViewById(R.id.btn_2);
        btn2.setOnClickListener(new MyButtonListener(){

           
        });
	}
	
	class MyButtonListener implements OnClickListener{
		@Override
		public void onClick(View v){
			if(v.getId()==R.id.btn_3){
				
				if(tx.getText().toString().equals("678834")){
					Intent intent = new Intent();
					intent.setClass(Activity_10.this, Video_7.class);
					Activity_10.this.startActivity(intent);
				}
				else{
					Toast.makeText(Activity_10.this, " ‰»Î¥ÌŒÛ£¨«Î÷ÿ ‘£°", Toast.LENGTH_LONG).show();
				}
				
			}
			if(v.getId()==R.id.btn_1){
				Intent intent = new Intent();
				intent.setClass(Activity_10.this, Video_6.class);
				Activity_10.this.startActivity(intent);
			}
			if(v.getId()==R.id.btn_2){
				Intent intent = new Intent();
				intent.setClass(Activity_10.this, Video_5.class);
				Activity_10.this.startActivity(intent);
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
