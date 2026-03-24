package ru.mirea.afanaseva.toastapp;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private int studentNumber = 8;
    private String group = "БСБО-50-24"; //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickCount(View view) {
        String text = editText.getText().toString();
        int count = text.length();

        String message = "СТУДЕНТ № " + studentNumber +
                " ГРУППА " + group +
                " Количество символов - " + count;

        Toast toast = Toast.makeText(getApplicationContext(),
                message,
                Toast.LENGTH_LONG);
        toast.show();

        Toast centerToast = Toast.makeText(getApplicationContext(),
                message,
                Toast.LENGTH_SHORT);
        centerToast.setGravity(Gravity.CENTER, 0, 0);
        centerToast.show();
    }
}