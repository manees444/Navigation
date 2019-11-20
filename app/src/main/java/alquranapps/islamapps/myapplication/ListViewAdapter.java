package alquranapps.islamapps.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
    Context ctx;
    String arr[] = {"Orange", "Apple", "Grapes", "Mango", "Banana", "Pine"};

    public ListViewAdapter(Context context) {
        this.ctx = context;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(ctx).inflate(R.layout.listview_item, parent, false);
        }

        TextView text = view.findViewById(R.id.textView);
        Log.e("List", arr[position]);

        text.setText(arr[position]);
        return view;
    }
}
