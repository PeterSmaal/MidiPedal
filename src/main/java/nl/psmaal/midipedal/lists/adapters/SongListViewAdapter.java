package nl.psmaal.midipedal.lists.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import nl.psmaal.midipedal.R;

public class SongListViewAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public SongListViewAdapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.songlist, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.songlist, null,true);

        TextView songTitle = (TextView) rowView.findViewById(R.id.songtitle);
        ImageView albumCover = (ImageView) rowView.findViewById(R.id.albumcover);
        TextView artistName = (TextView) rowView.findViewById(R.id.artistname);

        songTitle.setText(maintitle[position]);
        albumCover.setImageResource(imgid[position]);
        artistName.setText(subtitle[position]);

        return rowView;

    };
}
