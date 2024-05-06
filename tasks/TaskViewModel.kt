package edu.quinnipiac.ser210.tasks
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TaskViewModel(val dao: TaskDAO) : ViewModel() {
    var newTaskName = ""

    fun addTask(){
        viewModelScope.launch {
            val task = Task()
            task.taskName = newTaskName
            dao.insert(task)
        }
    }
}