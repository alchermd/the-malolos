package me.johnalcher.themalolos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.malls_linear_Layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Malls!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.drinks_linear_Layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Drinks!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.parks_linear_Layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Parks!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.attractions_linear_Layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Attractions!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
