package lincolntee.studentfinance;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateProfileActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextStudentId;
    EditText editTextIcNumber;
    EditText editTextYearIntake;
    Button buttonUpdate;
    Button buttonGetLocation;
    TextView textViewCoordinate;


    private LocationManager locationManager;
    private LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextStudentId = findViewById(R.id.editTextStudentID);
        editTextIcNumber = findViewById(R.id.editTextIcNumber);
        editTextYearIntake = findViewById(R.id.editTextYearIntake);
        buttonUpdate = findViewById(R.id.buttonUpdate);
        buttonGetLocation = findViewById(R.id.buttonGetLocation);
        textViewCoordinate = findViewById(R.id.textViewCoordinate);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        };



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
