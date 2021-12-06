package pl.testuj.access;

public class University {
    public String name;
    protected String course;
    private String grade;
    String city;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
