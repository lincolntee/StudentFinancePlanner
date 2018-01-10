package lincolntee.studentfinance;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class ProfileActivity extends AppCompatActivity {

    TextView name,email,studentID, icNumber, intakeYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);
        Button buttonUpdateProfile = (Button) findViewById((R.id.buttonUpdateProfile)); //return to main menu

        name = (TextView) findViewById(R.id.textViewName);
        email = (TextView) findViewById(R.id.textViewEmail);
        studentID = (TextView) findViewById(R.id.textViewStudentID);
        icNumber = (TextView) findViewById(R.id.textViewIcNumber);
        intakeYear = (TextView) findViewById(R.id.textViewYearIntake);


        name.setText("Name " + getIntent().getStringExtra("NAME"));
        email.setText("Email " + getIntent().getStringExtra("EMAIL"));
        studentID.setText("StudentID " + getIntent().getStringExtra("STUDENTID"));
        icNumber.setText("IC Number " + getIntent().getStringExtra("ICNUMBER"));
        intakeYear.setText("Year Intake " + getIntent().getStringExtra("YEARINTAKE"));

        buttonUpdateProfile.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                // Return to main activity
                Intent intent = new Intent(ProfileActivity.this, UpdateProfileActivity.class);
                startActivity(intent);
            }
        });
    }


}
