package edu.quinnipiac.ser210.tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import edu.quinnipiac.ser210.guessinggame.databinding.TaskItemBinding
import edu.quinnipiac.ser210.tasks.TaskItemAdapter.*

class TaskItemAdapter() : ListAdapter<Task, TaskItemAdapter.TaskItemViewHolder>(TaskDiffItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : TaskItemViewHolder = TaskItemViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder:TaskItemViewHolder, position: Int){
        val item = getItem(position)
    }

    class TaskItemViewHolder(val binding: TaskItemBinding) : RecyclerView.ViewHolder(binding.root) {


        companion object {
            fun inflateFrom(parent: ViewGroup) : TaskItemViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = TaskItemBinding.inflate(layoutInflater, parent, false)
                return TaskItemViewHolder(binding)
            }
        }

        fun bind(item: Task){
            binding.task = item
        }
    }

}