package mdev.master_j.secondapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends Activity {
	private static final int NUMBER_OF_ELEMENTS = 60;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		String prefix = getString(R.string.list_item_prefix);
		String[] listStrings = new String[NUMBER_OF_ELEMENTS];
		for(int i = 0; i<NUMBER_OF_ELEMENTS; i++)
			listStrings[i] = prefix + i;
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.list_item_text, listStrings);
		ListView listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
	}
}
