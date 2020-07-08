package example.com.tugasakhir020irham011yuni.entity

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import example.com.tugasakhir020irham011yuni.R

class MenuHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView

    fun bindContent(text: String){
        itemHeader.text = text
    }
}