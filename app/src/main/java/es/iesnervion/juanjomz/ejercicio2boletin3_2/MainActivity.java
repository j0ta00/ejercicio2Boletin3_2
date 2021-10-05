package es.iesnervion.juanjomz.ejercicio2boletin3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgOperations;
    Button btnResult;
    EditText edNum1, edNum2;
    TextView txtResult;
    private int resultado;
    private String textOriginalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgOperations=findViewById(R.id.rgOperations);
        btnResult=findViewById(R.id.btnResult);
        edNum1 =findViewById(R.id.txtNumb1);
        edNum2 =findViewById(R.id.txtNumb2);
        txtResult=findViewById(R.id.txtResult);
        textOriginalResult=txtResult.getText().toString();
        resultado=0;
        btnResult.setOnClickListener(x->operations());

    }

    public void operations(){
        if(!edNum1.getText().toString().isEmpty() && !edNum2.getText().toString().isEmpty()) {
            switch (rgOperations.getCheckedRadioButtonId()) {
                case R.id.rdBtnSum: {
                    sum();
                }
                break;
                case R.id.rdBtnSubs: {
                    substract();
                }
                break;
                case R.id.rdBtnMult: {
                    multiplication();
                }
                break;
                case R.id.rdBtnDiv: {
                    division();
                }
                break;
            }
        }
    }

    public void sum(){
        txtResult.setText(textOriginalResult+String.valueOf(Integer.parseInt(edNum1.getText().toString())+Integer.parseInt(edNum2.getText().toString())));
    }
    public void substract(){
        txtResult.setText(textOriginalResult+String.valueOf(Integer.parseInt(edNum1.getText().toString())-Integer.parseInt(edNum2.getText().toString())));
    }
    public void multiplication(){
        txtResult.setText(textOriginalResult+String.valueOf(Integer.parseInt(edNum1.getText().toString())*Integer.parseInt(edNum2.getText().toString())));
    }
    public void division(){
        txtResult.setText(textOriginalResult+String.valueOf(Integer.parseInt(edNum1.getText().toString())/Integer.parseInt(edNum2.getText().toString())));
    }

}