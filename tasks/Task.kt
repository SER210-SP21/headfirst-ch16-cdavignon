package edu.quinnipiac.ser210.tasks

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey(autoGenerate = true)
    var taskId: Long = 0L,
    @ColumnInfo(name = "task_name")
    var taskName: String = "",
    @ColumnInfo(name = "task_done")
    var taskDone: Boolean = false
)
