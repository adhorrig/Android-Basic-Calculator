package basiccalc.mybasiccalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button btnSubmit;
    TextView tvResult;
    EditText etfirst,etsecond,etamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        tvResult = (TextView)findViewById(R.id.tvResult);
        etfirst = (EditText)findViewById(R.id.etFirst);
        etsecond = (EditText)findViewById(R.id.etSecond);
        etamount = (EditText)findViewById(R.id.etAmount);
        btnSubmit.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        String amount = etamount.getText().toString();
        switch(view.getId()){
            case R.id.btnSubmit:
                if(etfirst.getText().toString().length()==0){
                    Toast.makeText(getBaseContext(), "You did not enter a value for the first number", Toast.LENGTH_LONG).show();
                }
                else if(etsecond.getText().toString().length()==0){
                    Toast.makeText(getBaseContext(), "You did not enter a value for the second number", Toast.LENGTH_LONG).show();
                }
                else if(etamount.getText().toString().length()==0){
                    Toast.makeText(getBaseContext(), "You did not enter a value for the amount", Toast.LENGTH_LONG).show();
                }
                else {
                    double divide = (Double.parseDouble(num1) / Double.parseDouble(num2)) + 1;
                    double multiply = divide * Integer.parseInt(amount);
                    tvResult.setText(String.valueOf(multiply));
                    break;
                }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void openSearch(){
        Toast.makeText(this, "Settings button pressed", Toast.LENGTH_SHORT).show();
    }

    private void openSettings(){
        Toast.makeText(this, "Settings button pressed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }

    public boolean doubleBet(MenuItem view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
        return true;
    }


}
