package com.example.taskmanager.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.taskmanager.R

class Week : Fragment() {

        private lateinit var rootView: View

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            rootView = inflater.inflate(R.layout.fragment_week, container, false)

            val monthButton: Button = rootView.findViewById(R.id.changeButton)

            monthButton.setOnClickListener {
                findNavController().navigate(R.id.action_fragment_week_to_fragment_month)
            }

            return rootView
        }
    }
