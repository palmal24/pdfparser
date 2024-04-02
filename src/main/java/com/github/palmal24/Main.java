package com.github.palmal24;

import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cmd = "";
        displayText();

        while (!cmd.equals("exit")) {
            System.out.print("Enter cmd: ");
            cmd = scan.next().trim();
            if (!cmd.isEmpty()) {
                listDir(cmd);
            }
        }
        scan.close();
    }


    private static void listDir(String cmd) {
        File[] directories = new File(cmd).listFiles();
        if (directories != null) {
            for (File directory : directories) {
                System.out.println(directory);
            }
        } else {
            System.out.printf("%s does not exist or is not a directory\n", cmd);
        }
    }


    private static void displayText() {
        System.out.println("1. Parse single file - \033[3mfile path\033[0m");
        System.out.println("2. Parse all files in directory - \033[3mdir location\033[0m");
        System.out.println("3. Quit application - \033[3mexit\033[0m");
    }
}

