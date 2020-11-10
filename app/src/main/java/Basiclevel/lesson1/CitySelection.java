package Basiclevel.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import static Basiclevel.lesson1.Constant.*;

public class CitySelection extends AppCompatActivity implements Constant{

    private int counter = 0;

    private EditText messageEditText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_selection);

        Button citySelect = (Button) findViewById(R.id.button4);
        citySelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
                if (checkBox2.isChecked()){
                    String sityName = (String) checkBox2.getText();
                    Intent intent = new Intent(CitySelection.this, MainActivity.class);
                    intent.putExtra(sityCheckBox2, sityName);
                    startActivity(intent);
                    Toast.makeText(CitySelection.this, sityName + " Переход на activiti_main_activity", Toast.LENGTH_SHORT).show();
                    finish();
            }

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
