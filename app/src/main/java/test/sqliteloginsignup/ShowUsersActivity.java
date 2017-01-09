package test.sqliteloginsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.facebook.stetho.Stetho;

import java.text.DecimalFormat;
import java.util.*;

public class ShowUsersActivity extends AppCompatActivity {

    final String TAG = "ShowUsersActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_users);

        //to access dev tools in chrome and see the database contents
        Stetho.initializeWithDefaults(this);

        ListView listView = (ListView) findViewById(R.id.mobile_list);

        UsersDB db = new UsersDB(this);

        //START LISTVIEW CODE
        ///////////////////////////////////////////
        ArrayList<String> mobileArray = new ArrayList<String>();
        //list of data to display

        ArrayList<User> users = db.getUsers();

        //get data from arraylist onto a regular array
        for (User aUser: users){

            Log.d(TAG, aUser.getUsername());
            mobileArray.add("username: "+aUser.getUsername());
            mobileArray.add("password: "+aUser.getPassword());

            mobileArray.add("");
        }

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, mobileArray);

        listView.setAdapter(adapter);

        //END LISTVIEW CODE
        ////////////////////////////////////////////

    }
}
