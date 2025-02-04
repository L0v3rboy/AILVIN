import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Run Scheduler");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 2:
                    runScheduler();
                    break;
                case 3:
                    System.out.println("Exiting Task Scheduler.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

