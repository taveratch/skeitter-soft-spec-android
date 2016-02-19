package com.example.taweesoft.skeitter.Service;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.taweesoft.skeitter.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    @Bind(R.id.username_txt)
    EditText username_txt;

    @Bind(R.id.password_txt)
    EditText password_txt;

    @Bind(R.id.rePassword_txt)
    EditText repassword_txt;

    @Bind(R.id.regis_btn)
    Button regis_btn;

    @Bind(R.id.goLogin_txt)
    TextView goLogin_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        setAction();

    }

    public void setAction(){
        regis_btn.setOnClickListener(new Register());
    }

    class Register implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            /**
             * todo
             * Implement Register command.
             */
        }
    }
}
