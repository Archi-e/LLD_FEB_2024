package builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                            .id(1)
                            .name("Archie")
                            .age(26)
                            .email("ABC@gmail.com")
                            .build();

        System.out.println(s);
    }
}
