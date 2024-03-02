package builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private int psp;
    private int gradYear;
    private String email;

    //there are too many attributes so creating constructor can be cumbersome
    //validations and failing objects will require exception throwing that can't be done with normal constructor
    //Object immutability can't be achieved with default constructor


    //make the constructor private as we don't want to give its access directly
    private Student(int id, String name, int age, int psp, int gradYear, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.gradYear = gradYear;
        this.email = email;
    }

    //to use Builder we create static method in Student
    public static Builder builder(){
        return new Builder();
    }

    //create inner static class builder and give all the attributes of Student to it
    public static class Builder{
        private int id;
        private String name;
        private int age;
        private int psp;
        private int gradYear;
        private String email;
        //this class will have three tasks:

        //TASK:1 take input and set them, so add setter
        public Builder id(int id) { //change the return type of setter to Builder object
            this.id = id;
            return this;  //returning Builder object so that we can do chaining while object creation: check in Client
        }

        public Builder name(String name) {
            this.name = name;
            return this;  //sets the name of current calling object and return that object after setting name
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        //TASK 2: Validate -- so add validate() method
        public void validate(){
            if(this.age < 22){
                throw new InvalidAgeException();
            }
            if(gradYear > 2025){
                throw new InvalidGradYearException();
            }
            if(email == null){
                throw new InvalidEmailException();
            }
        }

        //TASK 3: Create Object -- use build() method

        public Student build(){
            validate();
            return new Student(this.id, this.name, this.age, this.psp, this.gradYear, this.email);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", gradYear=" + gradYear +
                ", email='" + email + '\'' +
                '}';
    }
}
