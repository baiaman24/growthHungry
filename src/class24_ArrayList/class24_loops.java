package class24_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class class24_loops {
    public static void main(String[] args) {
        boolean isRunning = true;
        List<String> taskList = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you want to do?");
            System.out.println("1. Add a task");
            System.out.println("2. Complete a task");
            System.out.println("3. Print all tasks");
            System.out.println("4. quit");

            String command = sc.nextLine();


            if (command.equalsIgnoreCase("Add a task") || command.equalsIgnoreCase("1")) {
                System.out.println("Enter a task: ");
                String task = sc.nextLine();
                taskList.add(task);

            } else if (command.equalsIgnoreCase("Complete a task") || command.equalsIgnoreCase("2")) {
                System.out.println("Enter a task: ");
                String taskCompleted = sc.nextLine();
                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).equalsIgnoreCase(taskCompleted)) {
                        taskList.remove(i);
                    }
                }

            } else if (command.equalsIgnoreCase("Print all tasks") || command.equalsIgnoreCase("3")) {
                System.out.println(taskList);
            } else if (command.equalsIgnoreCase("4") || command.equalsIgnoreCase("quit")) {
                isRunning = false;
            } else {

            }
        } while(isRunning);
    }
}
