package com.example.umc_hackathon.post

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.umc_hackathon.R


class MyPointRAdapter(val pointList: List<PointHistoryRecent>): RecyclerView.Adapter<MyPointRAdapter.MyViewHolder>() {

    val TAG: String = "<MyPointRAdapter>"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.board_point_item, parent, false)
        Log.d("MyPointViewHolder() / ", "MyPointRAdapter에서 메소드 called")

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pointList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d(TAG, " - onBindViewHolder() called / position: $position")

        if (pointList[position].addAmount != 0) {
            holder.point.text = "+" + pointList[position].addAmount.toString() + "P"
            holder.point.setTextColor(Color.parseColor("#7798dd"))
            holder.state.text = "적립"

        }

        if (pointList[position].subAmount != 0) {
            holder.point.text = "-" + pointList[position].subAmount.toString() + "P"
            holder.point.setTextColor(Color.parseColor("#e279be"))
            holder.state.text = "사용"
        }

        holder.date.text = pointList[position].created.toString()
        Log.d("date", " : " +  pointList[position].created)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val point = itemView.findViewById<TextView>(R.id.board_point_item_point_tv)
        val state = itemView.findViewById<TextView>(R.id.board_point_item_state_tv)
        val date = itemView.findViewById<TextView>(R.id.board_point_item_date_tv)
    }

}