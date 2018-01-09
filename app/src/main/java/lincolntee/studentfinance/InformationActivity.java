package lincolntee.studentfinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private static final int REQUEST_PROFILE_UPDATE = 1;
    public static final String PROFILE_NAME = "lincolntee.studentfinance.name";
    public static final String PROFILE_EMAIL = "lincolntee.studentfinance.email";
    private TextView textViewName, textViewEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        // Linking ui to program
        textViewName = (TextView) findViewById(R.id.textViewName);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //requestCode = the unique code which identify an intent "number 1"
        //resultCode = the result returned by an intent; either ok or cancel.
        //data = the actual data returned by an intent
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PROFILE_UPDATE && resultCode == RESULT_OK) {
            String name, email;
            name = data.getStringExtra(PROFILE_NAME);
            textViewName.setText("Name : " + name);
        }
    }
    public void updateProfile(View view)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}
