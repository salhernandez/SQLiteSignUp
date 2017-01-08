package test.sqliteloginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.stetho.Stetho;

public class LandingPage extends AppCompatActivity implements View.OnClickListener{

    private Button signIn, signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        signIn = (Button) findViewById(R.id.signInButton);
        signUp = (Button) findViewById(R.id.signUpButton);

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);

        Stetho.initializeWithDefaults(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signInButton:
                Intent intent0 = new Intent(LandingPage.this, LoginActivity.class);
                startActivity(intent0);
                break;
            case R.id.signUpButton:
                Intent intent1 = new Intent(LandingPage.this, SignUpActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
