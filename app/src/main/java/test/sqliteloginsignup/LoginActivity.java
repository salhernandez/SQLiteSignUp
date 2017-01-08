package test.sqliteloginsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText ETUsername, ETPassword;
    private Button signInButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ETUsername = (EditText) findViewById(R.id.ETUsername);
        ETPassword = (EditText) findViewById(R.id.ETPassword);

        signInButton = (Button) findViewById(R.id.signInButton);
        cancelButton = (Button) findViewById(R.id.cancelButton);

        signInButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signInButton:
                checkCredentials();
                break;
            case R.id.cancelButton:
                finish();
                break;
        }
    }

    private void checkCredentials(){
        if(!ETUsername.getText().toString().equals("") && !ETPassword.getText().toString().equals("")){
            //proceed
        }
        else{//don't proceed
            toastIt("cannot have empty fields");
        }
    }

    private void toastIt(String message){
        Toast.makeText(this, message,
                Toast.LENGTH_LONG).show();
    }
}
