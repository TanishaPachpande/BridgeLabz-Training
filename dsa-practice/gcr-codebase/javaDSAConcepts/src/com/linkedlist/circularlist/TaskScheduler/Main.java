package com.linkedlist.circularlist.TaskScheduler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularTaskList taskList = new CircularTaskList();

        while (true) {
            System.out.println("\n--- Circular Task Scheduler ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task & Move Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Due Date: ");
                    String date = sc.nextLine();

                    if (choice == 1)
                        taskList.addAtBeginning(id, name, priority, date);
                    else if (choice == 2)
                        taskList.addAtEnd(id, name, priority, date);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        taskList.addAtPosition(pos, id, name, priority, date);
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    taskList.removeByTaskId(sc.nextInt());
                    break;

                case 5:
                    taskList.viewNextTask();
                    break;

                case 6:
                    taskList.displayAllTasks();
                    break;

                case 7:
                    System.out.print("Enter Priority: ");
                    taskList.searchByPriority(sc.nextInt());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

