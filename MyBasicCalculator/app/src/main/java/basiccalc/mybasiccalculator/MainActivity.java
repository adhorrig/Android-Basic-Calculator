package basiccalc.mybasiccalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button btnSubmit;
    private TextView tvResult;
    private EditText etfirst,etsecond,etamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void init(){
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        tvResult = (TextView)findViewById(R.id.tvResult);
        etfirst = (EditText)findViewById(R.id.etFirst);
        etsecond = (EditText)findViewById(R.id.etSecond);
        etsecond = (EditText)findViewById(R.id.etSecond);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        String amount = etamount.getText().toString();
        switch(view.getId()){
            case R.id.btnSubmit:
                int divide =  (Integer.parseInt(num2) / Integer.parseInt(num1)) +1;
                int multiply = divide * Integer.parseInt(amount);
                tvResult.setText(String.valueOf(multiply));
                break;
        }
    }


}
