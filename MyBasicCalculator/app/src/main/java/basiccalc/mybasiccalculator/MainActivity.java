package basiccalc.mybasiccalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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

}
