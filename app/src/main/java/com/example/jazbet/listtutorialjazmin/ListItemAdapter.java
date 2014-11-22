package com.example.jazbet.listtutorialjazmin;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static android.graphics.drawable.Drawable.*;

/**
 * Created by jazbet on 11/15/14.
 */
public class ListItemAdapter extends BaseAdapter {
    //Variables
    private Context mContext = null;
    private ArrayList<ListItem> mArrayList = null;
    private LayoutInflater mLayoutInflater = null;

    public ListItemAdapter(Context context, ArrayList<ListItem> arrayList)
    {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mArrayList = arrayList;
    }

    public int getCount(){
        return mArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        View view = convertView;
        //Check if view is null
        if(view == null)
        {
            holder = new Holder();
            view = mLayoutInflater.inflate(R.layout.list_item, null);
            holder.imageUser = (ImageView)view.findViewById(R.id.image_user);
            holder.txtHeader = (TextView)view.findViewById(R.id.txt_header);
            holder.txtSubHeader = (TextView)view.findViewById(R.id.txt_subheader);
            view.setTag(holder);
        }
        else {
            holder = (Holder)view.getTag();
        }
        holder.imageUser.setImageDrawable(mArrayList.get(position).getImageUser());
        holder.txtHeader.setText(mArrayList.get(position).getHeader());
        holder.txtSubHeader.setText(mArrayList.get(position).getSubHeader());

        return view;
    }

    static class Holder {
        ImageView imageUser;
        TextView txtHeader;
        TextView txtSubHeader;
    }
}


