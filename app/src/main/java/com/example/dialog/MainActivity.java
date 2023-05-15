package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bgButton;
    public ConstraintLayout relativeLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = findViewById(R.id.button_fon);
        relativeLayout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);
        context = MainActivity.this;



    }

    public void Set(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Хотите поменять фон?");
        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int items) {
                switch (items){
                    case 0:
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.redColor);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.yellowColor);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        relativeLayout.setBackgroundResource(R.color.greenColor);
                        break;
                }

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}