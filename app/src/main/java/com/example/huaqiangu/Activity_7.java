package com.example.huaqiangu;

import com.example.huaqiangu.Activity_1.MyButtonListener;

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

public class Activity_7 extends Activity {
	Button btn1, btn2, btn3, btn4;
	EditText tx;
	static int i = 0;
	private static final int dialog3 = 3;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.a_7);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		tx = (EditText) findViewById(R.id.pw);
		btn1 = (Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(new MyButtonListener());
		btn4 = (Button) findViewById(R.id.btn_4);
		btn4.setOnClickListener(new MyButtonListener());
		btn2 = (Button) findViewById(R.id.btn_2);
		btn2.setOnClickListener(new MyButtonListener());
		btn3 = (Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(new MyButtonListener());

	}

	class MyButtonListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			if (v.getId() == R.id.btn_3) {

				if (tx.getText().toString().equals("092118")) {
					Intent intent = new Intent();
					intent.setClass(Activity_7.this, Activity_8.class);
					Activity_7.this.startActivity(intent);
					Activity_7.this.finish();
				} else {
					Toast.makeText(Activity_7.this, "������������ԣ�",
							Toast.LENGTH_LONG).show();
				}

			}
			if (v.getId() == R.id.btn_2) {
				showDialog(3);

			}
			if (v.getId() == R.id.btn_1) {
				Intent intent = new Intent();
				intent.setClass(Activity_7.this, Video_4.class);
				Activity_7.this.startActivity(intent);
				Activity_7.this.finish();
			}
			if (v.getId() == R.id.btn_4) {
				Intent intent = new Intent();
				intent.setClass(Activity_7.this, Activity_6.class);
				Activity_7.this.startActivity(intent);
			}

		}

	}

	protected Dialog onCreateDialog(int id) {
		return buildDialog(Activity_7.this);
	}

	private Dialog buildDialog(Context context) {
		LayoutInflater inflater = LayoutInflater.from(this);
		final View textEntryView = inflater.inflate(R.layout.mydialog_1, null);

		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		// builder.setTitle("Hello");
		builder.setView(textEntryView);// �ؼ�
		// builder.setPositiveButton("YES", null);
		// builder.setNegativeButton("NO", null);
		return builder.create();
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