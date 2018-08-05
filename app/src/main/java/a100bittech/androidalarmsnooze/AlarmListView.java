package a100bittech.androidalarmsnooze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlarmListView extends AppCompatActivity {
    private ListView listView;
    private AlarmAdapter aAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list_view);


        listView = (ListView) findViewById(R.id.alarms_list);
        ArrayList<Alarm> alarmsList = new ArrayList<>();

        alarmsList.add(new Alarm("9:00am", "M T W", "Wake up",true));
        alarmsList.add(new Alarm("11:00am", "M T W T F", "Work",false));
        aAdapter = new AlarmAdapter(this,alarmsList);
        listView.setAdapter(aAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(AlarmListView.this, String.valueOf(i), Toast.LENGTH_LONG).show();
            }
        });

    }

}
