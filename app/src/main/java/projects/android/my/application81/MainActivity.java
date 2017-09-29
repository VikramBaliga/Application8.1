package projects.android.my.application81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView nameList;
    String[] names = {"CCC","FFF","AAA","DDD","EEE","BBB","III","HHH","GGG","JJJ"};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the listView
        nameList = (ListView) findViewById(R.id.nameList);

        adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,names);
        nameList.setAdapter(adapter);

    }

    public void sortAscending(View view)
    {
        Toast.makeText(this,"Ascending",Toast.LENGTH_SHORT).show();


       // Convert Array to Listo
       List <String> sortedNames = Arrays.asList(names);
       // Inbuilt method to sort string data
       Collections.sort(sortedNames);
       adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,sortedNames);
       nameList.setAdapter(adapter);
       adapter.notifyDataSetChanged();


    }

    public void sortDescending(View view)
    {
        Toast.makeText(this,"Descending",Toast.LENGTH_SHORT).show();
        Arrays.sort(names,Collections.<String>reverseOrder());
        adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,names);
        nameList.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
