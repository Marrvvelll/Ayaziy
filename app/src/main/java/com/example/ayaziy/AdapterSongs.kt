package com.example.ayaziy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ayaziy.data.model.Qosiqlar
import kotlinx.android.synthetic.main.item_songs.view.*

class AdapterSongs:RecyclerView.Adapter<AdapterSongs.ViewHolderSongs>() {

    var models:List<Qosiqlar> = listOf()
    set(value) {
        field=value
        notifyDataSetChanged()
    }


inner class ViewHolderSongs(itemView: View):RecyclerView.ViewHolder(itemView){
    fun populateModel(qosiq:Qosiqlar){
        itemView.itemSongs.text=qosiq.name
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSongs {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_songs,parent,false)
        return ViewHolderSongs(itemView)
    }

    override fun getItemCount(): Int {
     return models.size
    }

    override fun onBindViewHolder(holder: ViewHolderSongs, position: Int) {
        holder.populateModel(models[position])
    }
}