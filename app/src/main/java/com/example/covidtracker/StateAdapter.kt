package com.example.covidtracker


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StateAdapter(private val context:Context, private val statelist:ArrayList<Modalclass>):
    RecyclerView.Adapter<StateAdapter.stateholder>() {
    class  stateholder(itemview:View):RecyclerView.ViewHolder(itemview){
        val statename=itemview.findViewById<TextView>(R.id.statename)
        val recovered=itemview.findViewById<TextView>(R.id.no_r_c)
        val death=itemview.findViewById<TextView>(R.id.no_d_c)
        val cases=itemview.findViewById<TextView>(R.id.no_t_c)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): stateholder {
        val view:View= LayoutInflater.from(context).inflate(R.layout.itemlayout,parent,false)
        return stateholder(view)
    }

    override fun onBindViewHolder(holder: stateholder, position: Int) {
        val currentstate=statelist[position]
        holder.statename.text=currentstate.state
        holder.recovered.text=currentstate.recovered.toString()
        holder.death.text=currentstate.death.toString()
        holder.cases.text=currentstate.cases.toString()
    }

    override fun getItemCount(): Int {
        return  statelist.size
    }
}