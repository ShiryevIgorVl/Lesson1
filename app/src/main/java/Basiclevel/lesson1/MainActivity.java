package Basiclevel.lesson1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Constant{

    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle arguments = getIntent().getExtras();
        if(arguments != null) {
            String nameSity = getIntent().getExtras().getString(sityCheckBox2);
            TextView textView = (TextView) findViewById(R.id.view);
            textView.setText(nameSity + ":" + "\nВетер северо-западный " + "\nТемпература 9 градусов ");
        }

        Button citySelect = (Button) findViewById(R.id.button);
        citySelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CitySelection.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Переход на activiti_city_selection", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt( "Counter" , counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Counter");
    }
}