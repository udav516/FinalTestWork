package org.example.Pets;

import org.example.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pets extends Animal {
    public Pets(String name, LocalDate birthDate, ArrayList<String> commands) {
        super(name, birthDate, commands);
    }

    public abstract void showCommands();

    public abstract void addCommand(String command);
}
