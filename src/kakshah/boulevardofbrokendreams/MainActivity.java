package kakshah.boulevardofbrokendreams;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	MediaPlayer boul;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Pickle", "OnCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		boul = MediaPlayer.create(this, R.raw.boule);
		// boul.start();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.e("Pickle", "OnResume");
		boul.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.e("Pickle", "OnPause");
		boul.stop();
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void openFB(View v) {
		String url = "https://www.facebook.com/pages/BOULEVARD-OF-BROKEN-DREAMS/96869135634?fref=ts";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

	public void openBC(View v) {
		String url = "http://www.azlyrics.com/lyrics/greenday/boulevardofbrokendreams.html";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

	public void play(View v) {
		Log.e("Pickle", "OnResume");
		boul.start();
		super.onResume();

	}

	public void pause(View v) {
		Log.e("Pickle", "OnResume");
		boul.pause();
		super.onResume();
		super.onCreate(null);
	}

	public void stop(View v) {
		Log.e("Pickle", "OnResume");
		boul.stop();
		super.onPause();
	}
}
