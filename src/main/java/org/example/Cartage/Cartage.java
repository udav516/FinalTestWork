package org.example.Cartage;

import org.example.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Cartage extends Animal {
    public Cartage(String name, LocalDate birthDate, ArrayList<String> commands) {
        super(name, birthDate, commands);
    }

    public abstract void showCommands();

    public abstract void addCommand(String command);
}
