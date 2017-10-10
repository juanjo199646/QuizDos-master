package com.jonmid.quizdos.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonmid.quizdos.Models.CommentModelJuanFajardo;
import com.jonmid.quizdos.Models.UserModelJuanFajardo;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUANJO FAJARDO on 10/10/2017.
 */

public class CommentAdapterJuanFajardo extends RecyclerView.Adapter<CommentAdapterJuanFajardo.ViewHolder>{

    List<CommentModelJuanFajardo> commenlist = new ArrayList<>();
    Context context;

    public CommentAdapterJuanFajardo(List<CommentModelJuanFajardo> commenlist, Context context) {
        this.commenlist = commenlist;
        this.context = context;

    }


    @Override
    public CommentAdapterJuanFajardo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_cardview, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
       CommentAdapterJuanFajardo.ViewHolder viewHolder = new CommentAdapterJuanFajardo.ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserAdpaterJuanFajardo.ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes
        holder.textViewname.setText(commenlist.get(position).getName());
        holder.textViewemail.setText(commenlist.get(position).getEmail());



    }


    @Override
    public int getItemCount() {
        return commenlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewname;
       TextView textViewbody;
        TextView textViewemail;

        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            textViewname = (TextView) item.findViewById(R.id.id_tv_userinput_name);
            textViewemail = (TextView) item.findViewById(R.id.id_tv_userinput_email);
            textViewbody = (TextView) item.findViewById(R.id.id_tv_userinput_email);
        }



        @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, CommentAdapterJuanFajardo.class);

        }
    }




}
