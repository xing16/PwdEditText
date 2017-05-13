package com.xing.pwdedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;

import com.xing.pwdedittextlib.PwdEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PwdEditText editText = (PwdEditText) findViewById(R.id.et_pwd);
        editText.addTextChangedListener(new PwdEditText.OnTextChangedListener() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("debug", "result = " + s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
