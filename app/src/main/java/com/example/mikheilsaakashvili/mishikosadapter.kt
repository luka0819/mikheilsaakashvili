package com.example.mikheilsaakashvili

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class mishikosadapter(private val mishaprezidentia: List<mishka>) :RecyclerView.Adapter<mishikosadapter.mishikoViewHolder>(){
    class mishikoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val  imageview: ImageView = itemView.findViewById(R.id.imageView)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mishikoViewHolder {
      val view =  LayoutInflater.from(parent.context).inflate(R.layout.mikheilsaakashviligallery,parent,false)
        return mishikoViewHolder(view)
    }


    override fun onBindViewHolder(holder: mishikoViewHolder, position: Int) {
       val mishiko = mishaprezidentia[position]
        Glide.with(holder.imageview.context)
            .load(mishiko.url)
            .centerCrop()
            .into(holder.imageview)



    }

    override fun getItemCount(): Int = mishaprezidentia.size


}