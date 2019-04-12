package com.caranddiesel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Bimal extends AppCompatActivity implements View.OnClickListener {

    private TextView tvOutput;
    private EditText etMake, etYear, etColor, etCarPrice, etEngineSize;
    private Button btnCreateCar;
    private int a=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = findViewById(R.id.tvOutput);
        btnCreateCar = findViewById(R.id.btnCreateCar);
        etMake = findViewById(R.id.etMake);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etCarPrice = findViewById(R.id.etCarPrice);
        etEngineSize = findViewById(R.id.etEngineSize);
        btnCreateCar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.btnCreateCar)
        {
            tvOutput.setText(tvOutput.getText().toString() + "\n This is vehicle no.: " + (a++) + "\n" +
                    new Bimal_CarAndDiesel(etMake.getText().toString(), etYear.getText().toString(), etColor.getText().toString(),
                    etCarPrice.getText().toString(), etEngineSize.getText().toString()).printOutput() + "\n");
        }
    }
}
