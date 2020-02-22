package villa.usman.plugins;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.villa.usman.plugins.R;

public class NewActivity extends Activity {
	TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("activity_new", "layout", package_name));
		res = (TextView) findViewById(R.id.textView);
		String newString;
		if (savedInstanceState == null) {
		Bundle extras = getIntent().getExtras();
		if(extras == null) {
			newString= null;
		} else {
			newString= extras.getString("result");
			//res.setText("ABC");
      res.setText("Result = " + newString);
		}
		} else {
			newString= (String) savedInstanceState.getSerializable("result");
		}
    }
}
