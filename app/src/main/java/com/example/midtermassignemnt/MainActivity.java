package com.example.midtermassignemnt;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button alertButton, buttonSend;
    firstFragment fragment1;
    secondFragment fragment2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        buttonSend = findViewById(R.id.button1_id);

        textView = findViewById(R.id.text_view);

        if(savedInstanceState==null){

            fragment1 = new firstFragment();
            fragment2 = new secondFragment();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.add(R.id.first_frag, fragment1);
            fragmentTransaction.add(R.id.second_frag, fragment2);

            fragmentTransaction.commit();

        }

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                fragment1.receiveData(text);
                fragment2.receiveData(text);
            }
        });

        alertButton = findViewById(R.id.button2_id);

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBox = new AlertDialog.Builder(MainActivity.this);
                alertDialogBox.setTitle("Alert Dialog Box");
                alertDialogBox.setMessage("Navigate to another activity");
                alertDialogBox.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Create an intent to start the new activity
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        // Start the new activity
                        startActivity(intent);
                    }
                });

                alertDialogBox.create();
                alertDialogBox.show();


            }
        });

        return false;
    }

    public void updateTextView(String data){
        textView.setText(data);
    }
}