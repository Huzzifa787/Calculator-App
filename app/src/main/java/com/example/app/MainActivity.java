package com.example.app;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {

    TextView result, solution;
    String sol = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextview();
        solution.setText("0");

    }
    private void initTextview(){
        solution = (TextView) findViewById(R.id.solution);
        result = (TextView) findViewById(R.id.result);

    }
    private void setSolution(String value){
        sol = sol + value;
        solution.setText(sol);
    }
    public void equalonClick(View view)
    {
        Double res = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        try {
            res = (Double) engine.eval(sol);
        }catch (ScriptException e)
        {
            Toast.makeText(this, "Invaled Input", Toast.LENGTH_SHORT).show();
        }
        if (res != null){
            result.setText(String.valueOf(res.doubleValue()));
        }

    }
    public void clickonSeven(View view){
        setSolution("7");
    }
    public void clickonEight(View view)
    {
        setSolution("8");

    }
    public void clickonNine(View view){

        setSolution("9");
    }
    public void clickonSix(View view){
        setSolution("6");
    }
    public void clickonFive(View view){
        setSolution("5");
    }
    public void clickonFour(View view){
        setSolution("4");
    }
    public void clickonThree(View view){
        setSolution("3");
    }
    public void clickonTwo(View view){
        setSolution("2");
    }
    public void clickonOne(View view){
        setSolution("1");
    }
    public void clickonZero(View view){
        setSolution("0");
    }
    public void clickonplus(View view){
        setSolution("+");
    }
    public void clickonminus(View view){
        setSolution("-");
    }
    public void clickonDivide(View view){
        setSolution("/");
    }
    public void clickonMutliply(View view){
        setSolution("*");
    }
    public void clickonDot(View view){
        setSolution(".");
    }

    public void clickonClear(View view)
    {
        solution.setText("0");
        sol = " ";
        result.setText("0");

    }


}