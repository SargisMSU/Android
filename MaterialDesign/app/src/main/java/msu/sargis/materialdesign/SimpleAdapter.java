package msu.sargis.materialdesign;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleHolder> {

    ArrayList<String> lines;
    Context context;

    public SimpleAdapter(Context context, ArrayList<String> lines) {
        this.context = context;
        this.lines = lines;
    }

    @NonNull
    @Override
    public SimpleAdapter.SimpleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SimpleHolder(LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleHolder simpleHolder, int i) {
        simpleHolder.textView.setText(lines.get(i));
    }

    @Override
    public int getItemCount() {
        return lines.size();
    }

    class SimpleHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public SimpleHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView;
        }
    }
}
