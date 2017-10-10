package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    public UserAdpaterJuanFajardo(List<UserModelJuanFajardo> countryList, Context context) {
        this.userList = countryList;
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
        holder.textViewSubregion.setText(countryList.get(position).getSubregion());
        holder.textViewLanguages.setText(countryList.get(position).getLanguages());
        holder.textViewArea.setText(Integer.toString(countryList.get(position).getArea()));
    }





}
