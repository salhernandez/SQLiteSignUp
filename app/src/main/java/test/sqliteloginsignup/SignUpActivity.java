package test.sqliteloginsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    final String TAG = "SignUpActivity";
    private EditText ETUsername, ETPassword;
    private Button signUpButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ETUsername = (EditText) findViewById(R.id.ETUsername);
        ETPassword = (EditText) findViewById(R.id.ETPassword);

        signUpButton = (Button) findViewById(R.id.signUpButton);
        cancelButton = (Button) findViewById(R.id.cancelButton);

        signUpButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signUpButton:
                checkCredentials();
                break;
            case R.id.cancelButton:
                finish();
                break;
        }
    }

    private void checkCredentials(){
        // get db and StringBuilder objects
        UsersDB db;
        User user;

        //checks that username and password are not empty
        if(!ETUsername.getText().toString().equals("") && !ETPassword.getText().toString().equals("")){
            //proceed

            db = new UsersDB(this);

            String username = ETUsername.getText().toString();
            String password = ETPassword.getText().toString();

            //need to check the database to see if the value already exists
            Log.d(TAG, "Did the user already exist?"+db.userExists(username));

            //if the user exists
            if(db.userExists(username)){
                toastIt("username "+username+" already exists");
            }
            else{//if the user does not exist, then it inserts it
                user = new User(username, password);
                long insertId = db.insertUser(user);

                toastIt("Successfully added "+username);
            }
        }
        else{//don't proceed
            toastIt("cannot have empty fields");
        }
    }

    private void toastIt(String message){
        Toast.makeText(this, message,
                Toast.LENGTH_SHORT).show();
    }
}
