package a100bittech.androidalarmsnooze;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AlarmAdapter extends ArrayAdapter<Alarm> {

    private Context aContext;
    private List<Alarm> alarmsList = new ArrayList<>();


    public AlarmAdapter(@NonNull Context context, ArrayList<Alarm> list) {
        super(context,0, list);
        aContext = context;
        alarmsList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(aContext).inflate(R.layout.rowlayout,parent,false);

        Alarm currentAlarm = alarmsList.get(position);

        TextView name = (TextView) listItem.findViewById(R.id.name);
        name.setText(currentAlarm.getaName());

        TextView time = (TextView) listItem.findViewById(R.id.time);
        time.setText(currentAlarm.getaTime());

        TextView days = (TextView) listItem.findViewById(R.id.days);
        days.setText(currentAlarm.getaRecdays());

        Switch toggle = (Switch) listItem.findViewById(R.id.toggle);
        toggle.setChecked(currentAlarm.isaToggle());

        return listItem;
    }
}