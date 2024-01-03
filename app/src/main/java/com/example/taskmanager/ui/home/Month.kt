package com.example.taskmanager.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.taskmanager.R

class Month : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_month, container, false)
        val changeButton = rootView.findViewById<Button>(R.id.changeButton)
        val gridCalendar: GridView = rootView.findViewById(R.id.gridCalendar)

        // Создаем список дней (заглушка, замените его на реальные данные)
        val days = mutableListOf<String>()
        for (i in 1..31) {
            days.add(i.toString())
        }

        // Создаем адаптер и устанавливаем его для GridView
        val gridAdapter = GridCalendarAdapter(requireContext(), days)
        gridCalendar.adapter = gridAdapter


        changeButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_month_to_fragment_week)
        }
        return rootView
    }
}
