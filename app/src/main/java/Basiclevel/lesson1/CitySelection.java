package Basiclevel.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CitySelection extends AppCompatActivity {

    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_selection);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitySelection.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(CitySelection.this, "Выбран город, переход на activity_main", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Toast.makeText(CitySelection.this, "Сохранения вида activity", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt( "Counter" , counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(CitySelection.this, "Востановленеи вида activity", Toast.LENGTH_SHORT).show();

        counter = savedInstanceState.getInt("Counter");
    }

}
