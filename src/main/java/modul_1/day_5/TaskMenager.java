package modul_1.day_5;

import org.apache.commons.lang3.ArrayUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskMenager {
    public static String[][] tasksArr;
    public static String dirFileCsv = "day_5/tasks.csv";
    public static void main(String[] args) {
        tasksArr = loadTasksFromCsv(dirFileCsv);
        chooseOption();
    }

    public static void showOptions() {
        String[] optionLabel = {"add", "remove", "list", "exit"};
        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        for (int i = 0; i < optionLabel.length; i++) {
            System.out.println(ConsoleColors.WHITE + optionLabel[i]);
        }
        System.out.flush();
    }

    public static String[][] loadTasksFromCsv(String fileName) {
        String[][] result = new String[1][1];
        Path path = Paths.get(fileName);
        int i = 0;
        try {
            for (String line : Files.readAllLines(path)) {
                result[i] = Arrays.copyOf(line.split(", "), line.split(", ").length);
                result = addOne(result);
                i++;
            }
        } catch (IOException e) {
            System.out.println(ConsoleColors.RED + "error: Problem z wczytaniem pliku '" + fileName + "'.");
        }

        return result;
    }

    public static void chooseOption() {
        Scanner scanner = new Scanner(System.in);
        String choose = "";

        while (!choose.equals("exit")) {
            showOptions();
            choose = scanner.next();
            switch (choose) {
                case "add":
                    addTask();
                    break;
                case "remove":
                    removeTask();
                    break;
                case "list":
                    showTasks();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Please select a correct option.");
            }
        }
        System.out.println(ConsoleColors.RED + "Bye bye!!!");
    }

    public static void addTask() {
        String task = "", tmpStr = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print(ConsoleColors.WHITE + "Please add task description: ");
        task += scanner.nextLine();

        while (!tmpStr.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
            System.out.print(ConsoleColors.WHITE + "Please add task due date: ");
            tmpStr = scanner.next();
        }
        task += "," + tmpStr;

        while (!(tmpStr.equals("true") || tmpStr.equals("false"))) {
            System.out.print(ConsoleColors.WHITE + "Is your task is important: true/false ");
            tmpStr = scanner.next();
        }
        task += "," + tmpStr;

        tasksArr[tasksArr.length - 1] = task.split(",");
        tasksArr = addOne(tasksArr);
        saveTasksToCsv(dirFileCsv);
    }

    public static String[][] addOne(String[][] strArr){
        strArr = Arrays.copyOf(strArr, strArr.length + 1);
        return strArr;
    }

    public static void removeTask() {
        Scanner scanner = new Scanner(System.in);
        int taskNum = 0;
        if(tasksArr.length > 1) {
            try {
                System.out.print(ConsoleColors.WHITE + "Please select task number from 1 to " + (tasksArr.length - 1) + " to remove: ");
                while (!scanner.hasNextInt() && taskNum > 0 && taskNum < tasksArr.length) {
                    System.out.print(ConsoleColors.WHITE + "Please select task number from 1 to " + (tasksArr.length - 1) + " to remove: ");
                    taskNum = Integer.valueOf(scanner.next());
                }
                taskNum = scanner.nextInt() - 1;
                tasksArr = ArrayUtils.remove(tasksArr, taskNum);
                saveTasksToCsv(dirFileCsv);
                System.out.println(ConsoleColors.WHITE + "Value was successfully deleted.");
            } catch (InputMismatchException e) {
                System.out.println(ConsoleColors.RED + "error: Wprowadzono inną wartość niż liczbową.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(ConsoleColors.RED + "error: Wprowadzono wartość z po za dozwolonego zakresu.");
            }
        } else {
            System.out.println("There are no tasks to delete.");
        }
    }

    public static void showTasks() {
        String tmpStr = "";
        if(tasksArr.length > 1) {
            for (int i = 0; i < tasksArr.length - 1; i++) {
                tmpStr = Arrays.toString(tasksArr[i]);
                System.out.println((i + 1) + ": " + tmpStr.substring(1, tmpStr.length() - 1));
            }
        } else {
            System.out.println(ConsoleColors.WHITE + "There are no tasks to show.");
        }
    }

    public static void saveTasksToCsv(String fileName) {
        String task = "", tmpStr = "";
        try(FileWriter fileWriter = new FileWriter(fileName, false)) {
            for (int i = 0; i < tasksArr.length - 1; i++) {
                tmpStr = Arrays.toString(tasksArr[i]);
                task = tmpStr.substring(1, tmpStr.length() - 1);
                fileWriter.append(task).append("\n");
            }
        } catch (IOException e) {
            System.out.println(ConsoleColors.RED + "error: Problem z zapisaniem zadań do pliku '" + fileName + "'.");
        }
    }
}
