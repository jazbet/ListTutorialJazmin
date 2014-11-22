package com.example.jazbet.listtutorialjazmin;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class CompaniesList extends Activity {

    private ArrayList<ListItem> mArrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);
        Button btnHeader = (Button)findViewById(R.id.btn_header);
        ListView listView = (ListView)findViewById(R.id.list_test);
        mArrayList = new ArrayList<ListItem>();
        ListItem listItem = new ListItem();
        listItem.setImageUser(getResources().getDrawable(R.drawable.ic_launcher));
        listItem.setHeader("Jazmin");
        listItem.setSubHeader("Vazquez");
        mArrayList.add(listItem);
        final ListItemAdapter listItemAdapter = new ListItemAdapter(getBaseContext(), mArrayList);
        listView.setAdapter(listItemAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_companies_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
