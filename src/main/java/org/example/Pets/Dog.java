package org.example.Pets;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dog extends Pets {
    ArrayList<String> commands = new ArrayList<>();

    public Dog(String name, LocalDate birthDate, ArrayList<String> commands) {
        super(name, birthDate, commands);
    }

    public void showCommands() {
        System.out.print("\n" + this.getName() + " может ");
        for (String command : this.commands) {
            System.out.print(command + ", ");
        }
        System.out.println("\n");
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }
}
