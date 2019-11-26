package alquranapps.islamapps.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.Holder> {
    Context ctx;
    String fruits[] = {"Orange", "Apple", "Grapes", "Mango"};
    int image[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background};

    int pos;

    public ListViewAdapter(Context context) {
        this.ctx = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.listview_item, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.itemView.requestLayout();
        holder.textView.setText(fruits[position]);
        holder.imageView.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return fruits.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.image);

        }
    }
}
