package org.example.Cartage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends Cartage {
    ArrayList<String> commands = new ArrayList<>();

    public Horse(String name, LocalDate birthDate, ArrayList<String> commands) {
        super(name, birthDate, commands);
    }

    @Override
    public void showCommands() {
        System.out.print("\n" + getName() + " может ");
        for (String command : this.commands) {
            System.out.print(command + ", ");
        }
        System.out.println("\n");
    }

    @Override
    public void addCommand(String command) {
        this.commands.add(command);
    }
}
