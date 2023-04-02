package T7.ej1;

/**
 * @author Pere Prior
 */
public class Task implements Comparable<Task> {

    public Task(int priority, int duration) {
        this.priority = priority;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task Priority: "+priority+" - Task Duration: "+duration;
    }

    @Override
    public int compareTo(Task task) {
        return Integer.compare(this.priority, task.priority);
    }

    private int priority;
    private int duration;
}
