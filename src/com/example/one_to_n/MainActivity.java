package com.example.one_to_n;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
		setListeners();
	}

	private Button calcbutton;
	private TextView result;
	private EditText field_input;

	private void findViews() {
		calcbutton = (Button) findViewById(R.id.submit);
		result = (TextView) findViewById(R.id.result);
		field_input = (EditText) findViewById(R.id.input);

	}

	private void setListeners() {
		calcbutton.setOnClickListener(count);
	}

	private Button.OnClickListener count = new OnClickListener() {

		@Override
		public void onClick(View v) {
			int number = Integer.parseInt(field_input.getText().toString());
			/*
			 * int tmp = 0; for (int i = 1; i <= number; i++) { tmp += i; } //
			 * result.setText(getText(R.string.result)+String.valueOf(tmp));
			 * result.setText(getText(R.string.result) + "" + tmp);
			 */

			result.setText(getText(R.string.result) + ""
					+ (number * (number + 1)) / 2);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
