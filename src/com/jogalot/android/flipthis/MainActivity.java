package com.jogalot.android.flipthis;

import com.marakana.android.yamba.R;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText editText; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText = (EditText) findViewById(R.id.editText1);
		editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) { flipIt(); }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }
        });
	}
	
	void flipIt() {
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
