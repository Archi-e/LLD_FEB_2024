package prototype;

public class Client {
    public static void main(String[] args) {
        Student studentBatchBProto = new Student("B", "2024", 3, "Sandeep", "TTS" );
        Student studentBatchCProto = new Student("C", "2025", 3, "Naman", "MWF" );
        Student archie = studentBatchBProto.clone();
        archie.setName("Archie");
        archie.setEmail("archie.tripathi@google.com");

        System.out.println(archie);

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentBatchBProto);
        studentRegistry.add(studentBatchCProto);

        Student sam = studentRegistry.get("C").clone();
        sam.setEmail("sam@gmail.com");
        sam.setName("Sam");

        System.out.println(sam);

    }

}
