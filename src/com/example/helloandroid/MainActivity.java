package com.example.helloandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn=(Button)findViewById(R.id.btnOK);
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);     
        alert.setTitle("Quantity");     
        alert.setMessage("Enter Quantity"); 
        alert.setNegativeButton("OK", null);
        final TextView tv=(TextView)findViewById(R.id.myText);
        
        tv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv.setText("");
			}
		});
        tv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus==false)
					tv.setText("Input Your Text");
			}
		});
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				alert.setMessage(tv.getText()); 
				alert.show();
			}
		});
    }
}