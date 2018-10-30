package demo.poly.com.view_pt13354;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox;
    private RadioButton radioButton;
    private ToggleButton toggleButton;
    private Switch aSwitch;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.cbMusic);
        radioButton = findViewById(R.id.rdMusic);
        toggleButton = findViewById(R.id.tgMusic);
        aSwitch = findViewById(R.id.swMusic);
        radioGroup = findViewById(R.id.rdgNghe);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               Toast.makeText(MainActivity.this,isChecked?"chon":"bo chon", Toast.LENGTH_LONG).show();
            }
        });

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked?"chon":"bo chon", Toast.LENGTH_LONG).show();
            }
        });
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked?"chon":"bo chon", Toast.LENGTH_LONG).show();
            }
        });
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked?"chon":"bo chon", Toast.LENGTH_LONG).show();
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rdDoctor:
                        Toast.makeText(MainActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rdTeacher:
                        Toast.makeText(MainActivity.this, "Teacher", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
