package lincolntee.studentfinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoanActivity extends MainActivity {

    TextView loanAmount, loanDuration, paymentDueDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        Button buttonBack = (Button) findViewById((R.id.buttonBack_LA)); //return to main menu
        Button buttonUpdateLoanInformation = (Button) findViewById(R.id.buttonUpdateLoanInformation);

        loanAmount = (TextView)findViewById(R.id.textViewLoanAmount);
        loanDuration = (TextView)findViewById(R.id.textViewLoanDuration);
        paymentDueDate = (TextView)findViewById(R.id.textViewPaymentDueDate);

        loanAmount.setText("Amount : " + getIntent().getStringExtra("LOANAMOUNT"));
        loanDuration.setText("Duration : " + getIntent().getStringExtra("LOANDURATION"));
        paymentDueDate.setText("Due Date : " + getIntent().getStringExtra("PAYMENTDUEDATE"));

        buttonBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
            // Return to main activity
            Intent intent = new Intent(LoanActivity.this, MainActivity.class);
            startActivity(intent);
            }
        });
        buttonUpdateLoanInformation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                // Return to main activity
                Intent intent = new Intent(LoanActivity.this, UpdateLoanActivity.class);
                startActivity(intent);
            }
        });
    }
}
