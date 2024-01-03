package com.example.taskmanager.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.taskmanager.R

class GridCalendarAdapter(private val context: Context, private val days: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return days.size
    }

    override fun getItem(position: Int): Any {
        return days[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        val holder: ViewHolder

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.fragment_grid_calendar, parent, false)
            holder = ViewHolder()
            holder.dayNumberTextView = view.findViewById(R.id.dayNumberTextView)
            // Добавьте другие элементы, если они присутствуют
            view.tag = holder
        } else {
            holder = view.tag as ViewHolder
        }

        // Установите номер дня
        holder.dayNumberTextView?.text = days[position]

        // Дополнительные настройки, если необходимо

        return view!!
    }

    private class ViewHolder {
        var dayNumberTextView: TextView? = null
        // Добавьте другие элементы, если они присутствуют
    }
}
