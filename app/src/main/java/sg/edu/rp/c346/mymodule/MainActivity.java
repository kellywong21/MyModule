package sg.edu.rp.c346.mymodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewC346;
    TextView textViewC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewC346 = findViewById(R.id.textViewC346);
        textViewC349 = findViewById(R.id.textViewC349);

        textViewC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("Year", 2018);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue" , "W66M");
                startActivity(intent);
            }
        });


    }
}
