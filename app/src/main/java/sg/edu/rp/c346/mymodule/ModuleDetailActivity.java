package sg.edu.rp.c346.mymodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView Module;
    TextView Name;
    TextView Year;
    TextView Semester;
    TextView ModuleCredit;
    TextView Venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Module = findViewById(R.id.textViewModule);
        Name = findViewById(R.id.Name);
        Year = findViewById(R.id.Year);
        Semester = findViewById(R.id.Semester);
        ModuleCredit = findViewById(R.id.ModuleCredit);
        Venue =findViewById(R.id.Venue);

        Intent intentReceived1 = getIntent();
        String Code = intentReceived1.getStringExtra("ModuleCode");
        Module.setText("Module Code: " + Code);

        Intent intentReceived2 = getIntent();
        String name = intentReceived2.getStringExtra("ModuleName");
        Name.setText("Module Name: " + name);

        Intent intentReceived3 = getIntent();
        int year = intentReceived3.getIntExtra("Year",0);
        Year.setText("Academic Year: " + year);

        Intent intentReceived4 = getIntent();
        int sem = intentReceived4.getIntExtra("Semester",0);
        Semester.setText("Semester: " + sem);

        Intent intentReceived5 = getIntent();
        int credit = intentReceived5.getIntExtra("ModuleCredit",0);
        ModuleCredit.setText("Module Credit: " + credit);

        Intent intentReceived6 = getIntent();
        String venue = intentReceived6.getStringExtra("Venue");
        Venue.setText("Venue: " + venue);







    }
}
