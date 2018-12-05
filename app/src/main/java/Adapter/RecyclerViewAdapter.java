package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kiran.recyclerviewlistview.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private List<Contacts> contactsList = new ArrayList<>();
    Context context;

    public RecyclerViewAdapter(Context context, List<Contacts> contactsList) {
        this.context = context;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.d(TAG,"onBindViewHolder : called");
        Contacts contact = contactsList.get(i);
        //viewHolder.image.setImageResource();
        viewHolder.Fullname.setText(contact.getName());
        viewHolder.Details.setText(contact.getDetail());

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    //Holds the widgets in memory of each individual entry. thats why its holding view so viewholder :)
    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView Fullname , Details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.profile_image);
            Fullname = itemView.findViewById(R.id.lblFullname);
            Details = itemView.findViewById(R.id.lblDetails);
        }

    }
}