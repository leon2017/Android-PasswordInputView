package com.yuzhi.fine.passwordinputview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PasswordInputView passwordInputView = (PasswordInputView) findViewById(R.id.passwordInputView);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, TextUtils.isEmpty(passwordInputView.getText())?"密码不能为空":passwordInputView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
