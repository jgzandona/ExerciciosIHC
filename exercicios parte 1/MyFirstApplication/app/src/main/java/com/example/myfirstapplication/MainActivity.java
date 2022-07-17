package com.example.myfirstapplication;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button b1;
    TextView tV;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editTextNumber); // ID from component
        et2 = (EditText) findViewById(R.id.editTextNumber2); // ID from component
        b1 = (Button) findViewById(R.id.button2); // ID from component
        tV = (TextView) findViewById(R.id.textView2); // ID from component

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1;
                n1 = Integer.parseInt(et1.getText().toString());
                int n2;
                n2 = Integer.parseInt(et2.getText().toString());
                int soma;
                soma = n1+n2;
                String s = "resultado = "+soma;
                tV.setText(s);

            }
        });



    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        //The activity has become visible (now it "resumes").
    }

    }
