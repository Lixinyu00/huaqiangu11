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
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.huaqiangu.Activity_3.MyButtonListener;

public class Activity_9 extends Activity{
	Button btn1,btn2,btn3,btn4;
	EditText tx;
	public void onCreate(Bundle savedInstanceState) {
		
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_9);
		btn1=(Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(new MyButtonListener());
		btn2 = (Button)findViewById(R.id.btn_2);
		btn2.setOnClickListener(new MyButtonListener());
		btn3=(Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(new MyButtonListener());
	}
	class MyButtonListener implements OnClickListener{
		@Override
		public void onClick(View v){
			Intent intent = new Intent();
			switch (v.getId()) {
			case R.id.btn_1:
				intent.setClass(Activity_9.this, Video_5.class);
				Activity_9.this.startActivity(intent);
				Activity_9.this.finish();
				break;
			case R.id.btn_2:
				intent.setClass(Activity_9.this, Video_6.class);
				Activity_9.this.startActivity(intent);
				Activity_9.this.finish();
				break;
			case R.id.btn_3:
				intent.setClass(Activity_9.this, Activity_8.class);
				Activity_9.this.startActivity(intent);
				Activity_9.this.finish();
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
