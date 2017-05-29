package com.labs.renegades.clientapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 1 on 29.05.2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private List<Model> users;

    public MyAdapter(Context mContext, List<Model> users) {
        this.mContext = mContext;
        this.users = users;
    }

    static class ViewHolder {
        TextView name;
        TextView lastLogin;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) view.findViewById(R.id.list_user_name);
            viewHolder.lastLogin = (TextView) view.findViewById(R.id.last_login);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.name.setText("user name = " + users.get(i).getUsername());
        Object o = users.get(i).getLastLogin();
        if (o != null) {
            viewHolder.lastLogin.setText("last login = " + o.toString());
        } else {
            viewHolder.lastLogin.setText("last login = null");
        }

        return view;
    }

}
