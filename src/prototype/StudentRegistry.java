package prototype;

import java.util.HashMap;

public class StudentRegistry {

    HashMap<String, Student> studentRegistry;

    public StudentRegistry() {
        this.studentRegistry = new HashMap<>();
    }

    public void add(Student student){
        studentRegistry.put(student.getBatch(), student);
    }

    public Student get(String batchName){
        return studentRegistry.get(batchName);
    }
}
