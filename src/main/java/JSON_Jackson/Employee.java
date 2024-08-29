package JSON_Jackson;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String fName;
    private String lName;
    private List tech = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List getTech() {
        return tech;
    }

    public void setTech(List tech) {
        this.tech = tech;
    }
}
