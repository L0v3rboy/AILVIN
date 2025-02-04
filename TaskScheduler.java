import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
    // Initialize an empty list to store tasks
    private static List<String> tasks = new ArrayList<>();

    // Function to add a task
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task '" + task + "' added.");
    }

    // Function to run the scheduler
    public static void runScheduler() {
        System.out.println("Running scheduler...");
        for (String task : tasks) {
            System.out.println("Executing task: " + task);
        }
    }

    // Main function
    public static void main(String[] args) {
        System.out.println("Task Scheduler Started");
        addTask("Task 1");
        addTask("Task 2");
        runScheduler();
    }
}
