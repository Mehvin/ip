package duke.task;

import java.util.ArrayList;

/**
 * Handles storing of the tasks to task list.
 */
public class TaskList {
    private ArrayList<Task> taskList;

    /**
     * Constructor for TaskList class.
     * This object can be used for storing tasks.
     */
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    /**
     * Returns size of task list.
     *
     * @return Size as Integer.
     */
    public int size() {
        return this.taskList.size();
    }

    /**
     * Returns task of given index from task list.
     *
     * @param index Index of list.
     * @return Task as Task.
     */
    public Task get(int index) {
        return this.taskList.get(index);
    }

    /**
     * Adds given task to task list.
     *
     * @param task Task given to add into list.
     */
    public void add(Task task) {
        this.taskList.add(task);
    }

    /**
     * Removes task of given index from task list.
     *
     * @param index Index of list.
     */
    public void remove(int index) {
        this.taskList.remove(index);
    }
}
