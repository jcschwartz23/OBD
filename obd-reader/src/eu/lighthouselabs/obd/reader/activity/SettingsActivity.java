package eu.lighthouselabs.obd.reader.activity;

import eu.lighthouselabs.obd.reader.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends Activity {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
			super.onCreate (savedInstanceState);
			setContentView (R.layout.settings);
			
			final Button switchMain = (Button) findViewById (R.id.mainSettingsButton);
			switchMain.setOnClickListener (new View.OnClickListener() {
				
				@Override
				public void onClick (View v) {
					// TODO Auto-generated method stub
					Intent act = new Intent (v.getContext(), MainMenuActivity.class);
					startActivity (act);
				}
			});
	}
}
