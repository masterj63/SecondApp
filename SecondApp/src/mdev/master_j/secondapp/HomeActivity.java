package mdev.master_j.secondapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class HomeActivity extends ActionBarActivity {
	static final int NUMBER_OF_ELEMENTS = 20;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		LinearLayout layout = (LinearLayout) findViewById(R.id.scrollLayout);
		for(int i = 0; i<NUMBER_OF_ELEMENTS; i++){
			Button b = new Button(this);
			b.setText("button #" + i);
			b.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			layout.addView(b);
		}
	}
}
