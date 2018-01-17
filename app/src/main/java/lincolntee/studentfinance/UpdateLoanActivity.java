package lincolntee.studentfinance;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateLoanActivity extends AppCompatActivity {

    EditText editTextLoanAmount;
    EditText editTextLoanDuration;
    EditText editTextPaymentDueDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_loan);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.button);
        editTextLoanAmount = (EditText)findViewById(R.id.editTextLoanAmount);
        editTextLoanDuration = (EditText)findViewById(R.id.editTextLoanDuration);
        editTextPaymentDueDate = (EditText)findViewById(R.id.editTextPaymentDueDate);
        Button buttonUpdateLoanBack = (Button) findViewById(R.id.buttonUpdateLoanBack_LA);
        Button buttonUpdateLoan = (Button) findViewById(R.id.buttonUpdateLoan);
        buttonUpdateLoanBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                // Return to main activity
                Intent intent = new Intent(UpdateLoanActivity.this, LoanActivity.class);
                startActivity(intent);
                mp.start();
            }
        });
        buttonUpdateLoan.setOnClickListener(new View.OnClickListener()
        {
          @Override
            public void onClick(View view)
          {
              String loanAmount = editTextLoanAmount.getText().toString();
              String loanDuration = editTextLoanDuration.getText().toString();
              String paymentDueDate = editTextPaymentDueDate.getText().toString();
              Intent intent = new Intent(UpdateLoanActivity.this, LoanActivity.class);
              intent.putExtra("LOANAMOUNT",loanAmount);
              intent.putExtra("LOANDURATION", loanDuration);
              intent.putExtra("PAYMENTDUEDATE",paymentDueDate);
              startActivity(intent);
              mp.start();
          }

        });
    }
}
