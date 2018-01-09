package lincolntee.studentfinance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LivingExpensesActivity extends MainActivity{

    private EditText editTextIncome;
    private EditText editTextItemName;
    private EditText editTextItemPrice;
    private TextView textViewBalance;
    private TextView textViewExpenseValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_expenses);

        editTextIncome = (EditText) findViewById(R.id.editTextIncomeValue); //get Income Value
        editTextItemName = (EditText) findViewById(R.id.editTextItemName); //get Item Name
        editTextItemPrice = (EditText) findViewById(R.id.editTextItemPrice); //get Item Price
        Button buttonCalculate = (Button) findViewById(R.id.buttonCalculate); //button to calculate balance
        Button buttonBack = (Button) findViewById((R.id.buttonBack_LEA)); //return to main menu
        textViewBalance = (TextView) findViewById(R.id.textViewBalanceValue); //calculate balance
        textViewExpenseValue = (TextView) findViewById(R.id.textViewExpenseValue); //get Expenses Value


        buttonCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                calculateBalance();
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                // Return to main activity
                Intent intent = new Intent(LivingExpensesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calculateBalance()
    {
        double income = Double.valueOf(editTextIncome.getText().toString());
        double expense = Double.valueOf(textViewExpenseValue.getText().toString());
        double price = Double.valueOf(editTextItemPrice.getText().toString());
        expense += price;
        double balance = income - expense;
        textViewBalance.setText("" + balance);
        textViewExpenseValue.setText("" + price);
    }
}
