package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonmid.quizdos.Models.UserModelJuanFajardo;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUANJO FAJARDO on 10/10/2017.
 */

public class UserAdpaterJuanFajardo extends RecyclerView.Adapter<UserAdpaterJuanFajardo.ViewHolder> {

    List<UserModelJuanFajardo> userList = new ArrayList<>();
    Context context;

    public UserAdpaterJuanFajardo(List<UserModelJuanFajardo> userList, Context context) {
        this.userList = userList;
        this.context = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes
        holder.textViewname.setText(userList.get(position).getName());
        holder.textViewusername.setText(userList.get(position).getUsername());
        holder.textViewemail.setText(userList.get(position).getEmail());
        holder.textViewphone.setText(userList.get(position).getPhone());

    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewname;
        TextView textViewusername;
        TextView textViewemail;
        TextView textViewphone;
        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            textViewname = (TextView) item.findViewById(R.id.id_tv_userinput_name);
            textViewusername = (TextView) item.findViewById(R.id.id_tv_userinput_username);
            textViewemail = (TextView) item.findViewById(R.id.id_tv_userinput_email);
            textViewphone = (TextView) item.findViewById(R.id.id_tv_userinput_phone);
        }



        @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, UserModelJuanFajardo.class);
            contextItem.startActivity(intent);
        }
    }




    }
