package entities;

public class Instructor {

    private int id;
    private String instructorFirstName;
    private String instructorLastName;

    public Instructor() {

    }

    public Instructor(int id, String instructorFirstName, String instructorLastName) {
        this.id = id;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }
}
