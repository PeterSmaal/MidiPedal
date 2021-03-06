package nl.psmaal.midipedal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import nl.psmaal.midipedal.lists.adapters.SongListViewAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add dynamic listing of songs
        //TODO: Add Request button for new songs.

        ListView list;

        String[] maintitle = {
                "Title 1", "Title 2",
                "Title 3", "Title 4",
                "Title 5",
        };

        String[] subtitle = {
                "Sub Title 1", "Sub Title 2",
                "Sub Title 3", "Sub Title 4",
                "Sub Title 5",
        };

        Integer[] imgid = {
                1,2,3,4,5
        };

        SongListViewAdapter songListViewAdapter = new SongListViewAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(songListViewAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                }
            }


        });
    }

}
