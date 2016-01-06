package com.rokki.sanya;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    private EditText edt;
    private Button btnEvent;

    Integer first = null;
    Integer second = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (EditText) findViewById(R.id.edt_result);
        btnEvent = (Button) findViewById(R.id.btn_event);
        btnEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first==null){
                    first = Integer.valueOf(edt.getText().toString());
                    edt.setText("");
                }else if(second==null){
                    int res = 0;
                    second = Integer.valueOf(edt.getText().toString());

                    for(int i = first; i<=second; i++){
                        res+=i;
                    }
                    edt.setText("result = "+ res);
                }

            }
        });

    }
}

