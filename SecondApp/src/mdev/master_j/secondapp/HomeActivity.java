package mdev.master_j.secondapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends ActionBarActivity {
	static final int NUMBER_OF_ELEMENTS = 60;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		String[] listStrings = new String[NUMBER_OF_ELEMENTS];
		for(int i = 0; i<NUMBER_OF_ELEMENTS; i++)
			listStrings[i] = "item #" + i;
		ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.list_item_text, listStrings);
		ListView listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
	}
}
