package com.example.taskmanager.ui.addTask

data class DataTasks(
    val id: String,
    val title: Int,
    val isCompleted: Boolean,
    val dueDate: String, // или используйте тип даты
    val hour: Int,
    val minute: Int
)