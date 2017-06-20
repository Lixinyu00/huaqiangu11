package com.example.huaqiangu;

import java.io.File;



import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video_5 extends Activity {
	private VideoView videoView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.video);
		
		videoView = (VideoView) this.findViewById(R.id.videoView);
		File videoFile = new File("/storage/sdcard0/6.mp4");

		// 先判断这个文件是否存在
		if (videoFile.exists()) {
			videoView.setVideoPath(videoFile.getAbsolutePath());
			System.out.println(videoFile.getAbsolutePath());
			// 让VideoView获取焦点
			videoView.requestFocus();
			// 开始播放
			videoView.start();
		} else {
			Toast.makeText(this, "文件不存在", Toast.LENGTH_LONG).show();
		}
		videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
	    {
	     @Override
	     public void onCompletion(MediaPlayer mp)
	     {
	    	Intent intent = new Intent();
			intent.setClass(Video_5.this, Activity_9.class);
			Video_5.this.startActivity(intent);
	     }
	    });
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
