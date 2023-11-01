package com.example.myapplicationrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("We SDU",
                                "Puzzle Club",
                                "SDU Debat Club",
                                "Zhasa Club",
                                "Pandup Club",
                                "Dombyra Club",
                                "Event Club",
                                "Art Club")

    private var details = arrayOf(  "Social Life of E&NS Faculty",
                                    "Portraits made from cubes",
                                    "Сөзде мағына, істе жетістік",
                                    "Creative Club",
                                    "Making movies",
                                    "Бізбен бірге бір толқында бол",
                                    "40+ of the LARGEST EVENTS in SDU since 2014",
                                    "Creative community")

    private var images = intArrayOf(R.drawable.picture1,
                                    R.drawable.picture2,
                                    R.drawable.picture3,
                                    R.drawable.picture4,
                                    R.drawable.picture5,
                                    R.drawable.picture6,
                                    R.drawable.picture7,
                                    R.drawable.picture8)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener{
                val position: Int = adapterPosition

                Toast.makeText(itemView.context, "You clicked on ${titles[position]}", Toast.LENGTH_LONG).show()

            }

        }
    }

}