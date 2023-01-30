package duke.task;

/**
 * Handles task object to encapsulate commonalities in subclasses.
 */
public class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Constructor for Task object.
     *
     * @param description Description of task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Constructor for Task object.
     *
     * @param description Description of task.
     * @param isMarked Boolean to check if task is marked.
     */
    public Task(String description, boolean isMarked) {
        this.description = description;
        this.isDone = isMarked;
    }

    /**
     * Returns status if marked or not.
     *
     * @return Marked icon as String.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Sets status if marked or not.
     *
     * @param status Status of mark task.
     */
    public void setDone(boolean status) {
        this.isDone = status;
    }

    /**
     * Return string of task.
     *
     * @return Formatted task with details as String.
     */
    @Override
    public String toString() {
        return String.format("[" + getStatusIcon() + "] " + this.description);
    }
}