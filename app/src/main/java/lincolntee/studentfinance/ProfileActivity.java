package lincolntee.studentfinance;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    //variables to store data
    String name, email, identityCard, studentId, birthDate;
    int yearIntake;

    //Text
    private EditText editTextName, editTextIdentityCard, editTextStudentID,
            editTextBirthDate, editTextYearIntake, editTextEmail;

    //Button
    Button buttonUpdate;
    Button buttonReset;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editTextName = findViewById(R.id.editTextName);
        editTextIdentityCard = findViewById(R.id.editTextIdentityCard);
        editTextStudentID = findViewById(R.id.editTextStudentID);
        editTextBirthDate = findViewById(R.id.editTextBirthDate);
        editTextYearIntake = findViewById(R.id.editTextYearIntake);
        editTextEmail = findViewById(R.id.editTextEmail);

        buttonUpdate = findViewById(R.id.buttonUpdate);
    }
    public void updateProfile(View view)
    {
        String name, email; // local variable
        name = editTextName.getText().toString();
        Intent intent = getIntent();
        intent.putExtra(InformationActivity.PROFILE_NAME, name);
        setResult(RESULT_OK, intent);
        finish();
    }

}
//       buttonUpdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //To DO Check input details for update
//                AlertDialog.Builder confirmation = new AlertDialog.Builder(ProfileActivity.this);
//                confirmation.setMessage("Confirm update information?").setCancelable(false).setPositiveButton("Yes",
//                        new DialogInterface.OnClickListener(){
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        name = editTextName.getText().toString();
//                        email = editTextEmail.getText().toString();
//                        identityCard = editTextIdentityCard.getText().toString();
//                        studentId = editTextStudentID.getText().toString();
//                        birthDate = editTextBirthDate.getText().toString();
//                        yearIntake = Integer.valueOf(editTextYearIntake.getText().toString());
//                    }}).setNegativeButton("No", new DialogInterface.OnClickListener(){
//                    @Override
//                    public void onClick(DialogInterface dialog, int which)
//                        {
//                            dialog.cancel();
//                        }
//
//                });
//                AlertDialog alert = confirmation.create();
//                alert.setTitle("Update Profile");
//                alert.show();
//
//            }
//    });
//
//        buttonReset = findViewById(R.id.buttonReset);
//        buttonReset.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v)
//            {
//                //TO DO Check details input correctly or not
//                AlertDialog.Builder confirmation= new AlertDialog.Builder(ProfileActivity.this);
//                confirmation.setMessage("Do you want to reset input information?").setCancelable(false).setPositiveButton("Yes",
//                        new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        editTextName.setText("");
//                        editTextEmail.setText("");
//                        editTextIdentityCard.setText("");
//                        editTextStudentID.setText("");
//                        editTextBirthDate.setText("");
//                        editTextYearIntake.setText("");
//
//                    }
//                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                    }
//                });
//                AlertDialog alert = confirmation.create();
//                alert.setTitle("Confirmation");
//                alert.show();
//
//            }
//        });
//
//    }

