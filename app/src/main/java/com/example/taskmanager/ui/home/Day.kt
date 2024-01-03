package com.example.taskmanager.ui.home

import  com.example.taskmanager.ui.addTask.AddTask
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.taskmanager.databinding.FragmentDayBinding


class Day : Fragment() {

    private var _binding: FragmentDayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDayBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Настройка вашего фрагмента, например, установка выбранного дня, дня недели и т. д.

        // Обработка нажатия на кнопку добавления задачи
        binding.addTaskButton.setOnClickListener {
            val intent = Intent(requireContext(), AddTask::class.java)

            // Запустите активность
            startActivity(intent)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
