package lincolntee.studentfinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openProfile(View view)
    {
        // Open profile activity
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void exitApplication(View view)
    {
        // Exit Application
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void viewLoan(View view)
    {
        // View Loans
        Intent intent = new Intent(this, LoanActivity.class);
        startActivity(intent);
    }
    public void viewLivingExpenses(View view)
    {
        // View Living Expenses
        Intent intent = new Intent(this, LivingExpensesActivity.class);
        startActivity(intent);
    }
}
