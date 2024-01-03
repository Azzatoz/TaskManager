package com.example.taskmanager.ui.addTask
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.taskmanager.R

class AddTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_add_task)

        val confirmButton: Button = findViewById(R.id.confirmButton)

        confirmButton.setOnClickListener {
            addTaskToCalendar()
        }
    }

    private fun addTaskToCalendar() {
        // Получаем данные из пользовательского ввода
        val taskDescription: String = findViewById<EditText>(R.id.taskEditText).text.toString()
        val timePicker: TimePicker = findViewById(R.id.timePicker)
        val hour: Int = timePicker.hour
        val minute: Int = timePicker.minute

        // Создаем объект задачи
       // val task = DataTasks(taskDescription, hour, minute)

        // Добавляем задачу в соответствующий календарь
        // Здесь вам нужно определить, в какой календарь добавлять задачу
        // Например, создать метод addTaskToWeekCalendar(task: Task) и вызвать его
        // Для примера, предположим, что у вас есть объект WeekCalendar
        //WeekCalendar.addTask(task)

        // Закрываем активность после добавления задачи
        finish()
    }
}
