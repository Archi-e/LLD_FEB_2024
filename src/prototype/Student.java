package prototype;

public class Student implements Prototype<Student>{
    private String name;
    private String email;
    private String batch;
    private String year;
    private int module;
    private String instructorName;
    private String days;

    public Student(String batch, String year, int module, String instructorName, String days) {
        this.batch = batch;
        this.year = year;
        this.module = module;
        this.instructorName = instructorName;
        this.days = days;
    }

    public Student(Student s){
        this.batch = s.batch;
        this.year = s.year;
        this.module = s.module;
        this.instructorName = s.instructorName;
        this.days = s.days;
    }


    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", batch='" + batch + '\'' +
                ", year='" + year + '\'' +
                ", module=" + module +
                ", instructorName='" + instructorName + '\'' +
                ", days='" + days + '\'' +
                '}';
    }
}
