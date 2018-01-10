package lincolntee.studentfinance;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LivingExpensesActivity extends MainActivity{

    private EditText editTextIncome;
    private EditText editTextItemName;
    private EditText editTextItemPrice;
    private EditText editTextItemPrice1;
    private EditText editTextItemPrice2;
    private EditText editTextItemPrice3;
    private EditText editTextItemPrice4;
    private TextView textViewBalance;
    private TextView textViewExpenseValue;
    private double expense, income;

    private void calculateBalance()
    {
        income = Double.valueOf(editTextIncome.getText().toString());
        expense = Double.valueOf(textViewExpenseValue.getText().toString());
        double price = Double.valueOf(editTextItemPrice.getText().toString());
        double price1 = Double.valueOf(editTextItemPrice1.getText().toString());
        double price2 = Double.valueOf(editTextItemPrice2.getText().toString());
        double price3 = Double.valueOf(editTextItemPrice3.getText().toString());
        double price4 = Double.valueOf(editTextItemPrice4.getText().toString());

        expense = expense + price + price1 + price2 + price3+ price4;
        if(expense >income)
        {
            new AlertDialog.Builder(LivingExpensesActivity.this).setTitle("Budget Reminder").setMessage("Over Budget").setNeutralButton("ok",null)
                    .setIcon(android.R.drawable.stat_sys_warning).show();
        }
        double balance = income - expense;
        textViewBalance.setText("" + balance);
        textViewExpenseValue.setText("" + expense);
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_expenses);

        editTextIncome = (EditText) findViewById(R.id.editTextIncomeValue); //get Income Value
        editTextItemName = (EditText) findViewById(R.id.editTextItemName); //get Item Name
        editTextItemPrice = (EditText) findViewById(R.id.editTextItemPrice); //get Item Price
        editTextItemPrice1 = (EditText) findViewById(R.id.editTextItemPrice1); //get Item Price
        editTextItemPrice2 = (EditText) findViewById(R.id.editTextItemPrice2); //get Item Price
        editTextItemPrice3 = (EditText) findViewById(R.id.editTextItemPrice3); //get Item Price
        editTextItemPrice4 = (EditText) findViewById(R.id.editTextItemPrice4); //get Item Price

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





}
