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
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_1 extends Activity {
	Button btn1,btn2,btn3;
	EditText tx;
	static int i=0;
	private static final int dialog3 = 3;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.a_1);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		tx=(EditText) findViewById(R.id.pw);
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
			
			if(v.getId()==R.id.btn_1){
				Intent intent = new Intent();
				intent.setClass(Activity_1.this, Video_1.class);
				Activity_1.this.startActivity(intent);
			}
			if(v.getId()==R.id.btn_2){
				 showDialog(3);
				 
			}
			if(v.getId()==R.id.btn_3){
				
				if(tx.getText().toString().equals("311254")){
					Intent intent = new Intent();
					intent.setClass(Activity_1.this, Activity_2.class);
					Activity_1.this.startActivity(intent);
					Activity_1.this.finish();
				}
				else{
					Toast.makeText(Activity_1.this, " ‰»Î¥ÌŒÛ£¨«Î÷ÿ ‘£°", Toast.LENGTH_LONG).show();
				}
				
			}
		}
		
	}
    protected Dialog onCreateDialog(int id) {     
            return buildDialog(Activity_1.this);
    }
	private Dialog buildDialog(Context context) {        
        LayoutInflater inflater = LayoutInflater.from(this);
        final View textEntryView = inflater.inflate(R.layout.mydialog, null);
        
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
       // builder.setTitle("Hello");
        builder.setView(textEntryView);//πÿº¸
        //builder.setPositiveButton("YES", null);
        //builder.setNegativeButton("NO", null);        
        return builder.create();    
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
