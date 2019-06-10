package com.example.tictactoev1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        TextView ntf = (TextView)findViewById(R.id.notif);
        switch (view.getId()) {
            case R.id.b1:
                if ((b1.getText()=="X") || (b1.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b1.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b1.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b2:
                if ((b2.getText()=="X") || (b2.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b2.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b2.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b3:
                if ((b3.getText()=="X") || (b3.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b3.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b3.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b4:
                if ((b4.getText()=="X") || (b4.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b4.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b4.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b5:
                if ((b5.getText()=="X") || (b5.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b5.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b5.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b6:
                if ((b6.getText()=="X") || (b6.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b6.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b6.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b7:
                if ((b7.getText()=="X") || (b7.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b7.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b7.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b8:
                if ((b8.getText()=="X") || (b8.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b8.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b8.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
            case R.id.b9:
                if ((b9.getText()=="X") || (b9.getText()=="O")) {
                    break;
                }
                else {
                    if (i==0) {
                        b9.setText("X");
                        i=1;
                        ntf.setTextSize(35);
                        ntf.setText("Player 2's turn");
                        check();
                    }
                    else {
                        b9.setText("O");
                        i=0;
                        ntf.setTextSize(35);
                        ntf.setText("Player 1's turn");
                        check();
                    }
                    break;
                }
        }
    }

    public void reset(View view) {
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        TextView ntf = (TextView)findViewById(R.id.notif);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        i=0;
        ntf.setTextSize(35);
        ntf.setText("Player 1's turn");
    }

    public void check() {
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        TextView ntf = (TextView)findViewById(R.id.notif);

        if (b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X") {
            ntf.setTextSize(50);
            ntf.setText("Player 1 Wins!!");
        }
        else if (b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O") {
            ntf.setTextSize(50);
            ntf.setText("Player 2 Wins!!");
        }
        else if (b1.getText()!="" && b2.getText()!="" && b3.getText()!="" && b4.getText()!=""
         && b5.getText()!="" && b6.getText()!="" && b7.getText()!="" && b8.getText()!="" && b9.getText()!="") {
            ntf.setTextSize(50);
            ntf.setText("It's a Draw!");
        }
    }
}
