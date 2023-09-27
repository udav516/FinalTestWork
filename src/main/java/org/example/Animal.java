package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private LocalDate birthDate;
    private ArrayList<String> commands;

    public Animal(String name, LocalDate birthDate, ArrayList<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animals{" +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", commands=" + commands +
                '}';
    }
}
