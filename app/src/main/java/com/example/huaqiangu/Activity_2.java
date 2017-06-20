package com.example.huaqiangu;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
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

public class Activity_2 extends Activity {
	Button btn1, btn2, btn3, btn4, btn5, btn6;
	EditText tx;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.a_2);

		tx = (EditText) findViewById(R.id.pw);
		btn1 = (Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(new MyButtonListener());
		btn2 = (Button) findViewById(R.id.btn_2);
		btn2.setOnClickListener(new MyButtonListener());
		btn3 = (Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(new MyButtonListener());
		btn4 = (Button) findViewById(R.id.btn_4);
		btn4.setOnClickListener(new MyButtonListener());
		btn5 = (Button) findViewById(R.id.btn_5);
		btn5.setOnClickListener(new MyButtonListener());
		btn6 = (Button) findViewById(R.id.btn_6);
		btn6.setOnClickListener(new MyButtonListener());

	}

	class MyButtonListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent();
			switch (v.getId()) {
			case R.id.btn_1:
				Dialog dialog = new Dialog(Activity_2.this, R.style.MyDialog);
				// 设置它的ContentView
				dialog.setContentView(R.layout.tip_1);
				dialog.show();
				WindowManager.LayoutParams params = dialog.getWindow()
						.getAttributes();
				params.width = 1600;
				params.height = 1200;
				dialog.getWindow().setAttributes(params);
				break;
			case R.id.btn_2:
				Dialog dialog_2 = new Dialog(Activity_2.this, R.style.MyDialog);
				// 设置它的ContentView
				dialog_2.setContentView(R.layout.tip_2);
				dialog_2.show();
				WindowManager.LayoutParams params_2 = dialog_2.getWindow()
						.getAttributes();
				params_2.width = 1600;
				params_2.height = 1200;
				dialog_2.getWindow().setAttributes(params_2);
				break;
			case R.id.btn_3:
				Dialog dialog_3 = new Dialog(Activity_2.this, R.style.MyDialog);
				// 设置它的ContentView
				dialog_3.setContentView(R.layout.tip_3);
				dialog_3.show();
				WindowManager.LayoutParams params_3 = dialog_3.getWindow()
						.getAttributes();
				params_3.width = 1600;
				params_3.height = 1200;
				dialog_3.getWindow().setAttributes(params_3);
				break;
			case R.id.btn_4:
				Dialog dialog_4 = new Dialog(Activity_2.this, R.style.MyDialog);
				// 设置它的ContentView
				dialog_4.setContentView(R.layout.tip_4);
				dialog_4.show();
				WindowManager.LayoutParams params_4 = dialog_4.getWindow()
						.getAttributes();
				params_4.width = 1600;
				params_4.height = 1200;
				dialog_4.getWindow().setAttributes(params_4);
				break;
			case R.id.btn_5:
				intent.setClass(Activity_2.this, Video_2.class);
				Activity_2.this.startActivity(intent);
				break;
			case R.id.btn_6:
				intent.setClass(Activity_2.this, Video_1.class);
				Activity_2.this.startActivity(intent);
				Activity_2.this.finish();
				break;
			}

		}

	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		// case KeyEvent.KEYCODE_HOME:return true;
		case KeyEvent.KEYCODE_BACK:
			return true;

			/*
			 * case KeyEvent.KEYCODE_CALL:return true; case
			 * KeyEvent.KEYCODE_SYM: return true; case
			 * KeyEvent.KEYCODE_VOLUME_DOWN: return true; case
			 * KeyEvent.KEYCODE_VOLUME_UP: return true; case
			 * KeyEvent.KEYCODE_STAR: return true;
			 */
		}
		return super.onKeyDown(keyCode, event);
	}

}
