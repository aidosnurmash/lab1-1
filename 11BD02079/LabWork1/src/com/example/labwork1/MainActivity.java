package com.example.labwork1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	Button btnOK;
	EditText firstIn;
	static final String EXTRA_MESSAGE = "AAAA"; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btnOK = (Button)findViewById(R.id.btnOk);
		firstIn = (EditText) findViewById(R.id.firstInput);
		
		btnOK.setOnClickListener(this);
	}
	
	public void onClick(View v) {
	    
		String message = firstIn.getText().toString();
		//firstIn.setText(secondIn.getText().toString());
		//secondIn.setText(message);
		Intent intent = new Intent(this, MyActivity.class);
	    intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);
	    
	}
}
