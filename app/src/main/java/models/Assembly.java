package models;

import java.util.ArrayList;
import java.util.List;

public class Assembly {

    private String name = "";
    List<Task> tasks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Un nom, une durée et une liste de tâches éventuelles à réaliser préalablement)
    public Assembly(String name, List tasks){
        name = this.name;
        tasks = this.tasks;
    }
}
