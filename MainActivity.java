package com.example.welcome.calsiapp;

import android.app.Activity;

import android.location.GpsStatus;
import android.os.Bundle;
import android.os.Process;


import android.text.Editable;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.Menu;
import java.io.*;

import android.view.View.OnClickListener;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity implements OnClickListener {

    EditText editText;
    Button button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18;
    int result = 0;
    int op1, op2;
    String optr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);

        try {
            button2.setOnClickListener(this);
            button.setOnClickListener(this);
            button10.setOnClickListener(this);
            button11.setOnClickListener(this);
            button12.setOnClickListener(this);
            button13.setOnClickListener(this);
            button14.setOnClickListener(this);
            button15.setOnClickListener(this);
            button16.setOnClickListener(this);
            button17.setOnClickListener(this);
            button18.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);
            button7.setOnClickListener(this);
            button8.setOnClickListener(this);
            button9.setOnClickListener(this);
        } catch (Exception e) {
        }


    }

    public void operation() {

            if (optr.equals("+")) {
                op2 = Integer.parseInt(editText.getText().toString());
                editText.setText("");
                op1 = op1 + op2;
                editText.setText("result" + Integer.toString(op1));
            } else if (optr.equals("-")) {
                op2 = Integer.parseInt(editText.getText().toString());
                editText.setText("");
                op1 = op1 - op2;
                editText.setText("result" + Integer.toString(op1));
            } else if (optr.equals("*")) {
                op2 = Integer.parseInt(editText.getText().toString());
                editText.setText("");
                op1 = op1 * op2;
                editText.setText("result" + Integer.toString(op1));
            } else if (optr.equals("/")) {
                op2 = Integer.parseInt(editText.getText().toString());
                editText.setText("");
                op1 = op1 / op2;
                editText.setText("result" + Integer.toString(op1));
            }

    }


    @Override
    public void onClick(View arg0) {

            Editable str = editText.getText();
            switch (arg0.getId()) {
                case R.id.button9:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button9.getText());
                    editText.setText(str);
                    break;
                case R.id.button10:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button10.getText());
                    editText.setText(str);
                    break;
                case R.id.button11:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button11.getText());
                    editText.setText(str);
                    break;
                case R.id.button5:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button5.getText());
                    editText.setText(str);
                    break;
                case R.id.button6:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button6.getText());
                    editText.setText(str);
                    break;
                case R.id.button7:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button7.getText());
                    editText.setText(str);
                    break;
                case R.id.button:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button.getText());
                    editText.setText(str);
                    break;
                case R.id.button2:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button2.getText());
                    editText.setText(str);
                    break;
                case R.id.button3:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button3.getText());
                    editText.setText(str);
                    break;
                case R.id.button13:
                    if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    }
                    str = str.append(button13.getText());
                    editText.setText(str);
                    break;
                case R.id.button16:
                    optr = "+";

                    if (op1 == 0) {
                        op1 = Integer.parseInt(editText.getText().toString());

                        editText.setText("");

                    } else if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    } else {
                        //op1=Integer.parseInt(editText.getText().toString());
                        op2 = Integer.parseInt(editText.getText().toString());
                        editText.setText("");
                        op1 = op1 + op2;
                        editText.setText("result:" + Integer.toString(op1));

                    }

                    break;
                case R.id.button12:
                    optr = "-";

                    if (op1 == 0) {
                        op1 = Integer.parseInt(editText.getText().toString());

                        editText.setText("");

                    } else if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    } else {
                        //op1=Integer.parseInt(editText.getText().toString());
                        op2 = Integer.parseInt(editText.getText().toString());
                        editText.setText("");
                        op1 = op1 - op2;
                        editText.setText("result:" + Integer.toString(op1));

                    }
                    break;
                case R.id.button8:
                    optr = "*";

                    if (op1 == 0) {
                        op1 = Integer.parseInt(editText.getText().toString());

                        editText.setText("");

                    } else if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    } else {
                        // op1=Integer.parseInt(editText.getText().toString());
                        op2 = Integer.parseInt(editText.getText().toString());
                        editText.setText("");
                        op1 = op1 * op2;
                        editText.setText("result:" + Integer.toString(op1));

                    }
                    break;
                case R.id.button4:
                    optr = "/";


                    if (op1 == 0) {
                        op1 = Integer.parseInt(editText.getText().toString());

                        editText.setText("");

                    } else if (op2 != 0) {
                        op2 = 0;
                        editText.setText("");

                    } else {
                        //op1=Integer.parseInt(editText.getText().toString());
                        op2 = Integer.parseInt(editText.getText().toString());
                        editText.setText("");
                        op1 = op1 / op2;
                        editText.setText("result:" + Integer.toString(op1));

                    }
                    break;
                case R.id.button15:
                    if (!optr.equals(null)) {
                        if (op2 != 0) {
                            if (optr.equals("+")) {
                                editText.setText("");
                                // op1=op1+op2;
                                editText.setText("result:" + Integer.toString(op1));

                            } else if (optr.equals("-")) {
                                editText.setText("");
                                //op1=op1-op2;
                                editText.setText("result:" + Integer.toString(op1));

                            } else if (optr.equals("*")) {
                                editText.setText("");
                                //op1=op1*op2;
                                editText.setText("result:" + Integer.toString(op1));

                            } else if (optr.equals("/")) {
                                editText.setText("");
                                //op1=op1/op2;
                                editText.setText("result:" + Integer.toString(op1));

                            }
                        } else {
                            operation();
                        }

                    }
                    break;
                case R.id.button17:
                    finish();
                    break;
                case R.id.button18:
                    result = 0;
                    editText.setText(result);
                    break;


            }
        }
    }

