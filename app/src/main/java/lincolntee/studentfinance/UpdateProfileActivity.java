package lincolntee.studentfinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateProfileActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextStudentId;
    EditText editTextIcNumber;
    EditText editTextYearIntake;
    Button buttonUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextStudentId = (EditText) findViewById(R.id.editTextStudentID);
        editTextIcNumber = (EditText) findViewById(R.id.editTextIcNumber);
        editTextYearIntake = (EditText) findViewById(R.id.editTextYearIntake);
        buttonUpdate = (Button) findViewById(R.id.buttonUpdate);
        buttonUpdate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String studentId = editTextStudentId.getText().toString();
                String icNumber = editTextIcNumber.getText().toString();
                String yearIntake = editTextYearIntake.getText().toString();
                Intent intent = new Intent(UpdateProfileActivity.this, ProfileActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("STUDENTID", studentId);
                intent.putExtra("ICNUMBER", icNumber);
                intent.putExtra("YEARINTAKE", yearIntake);
                startActivity(intent);
            }

        });
    }
}
