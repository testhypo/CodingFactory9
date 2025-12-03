package gr.aueb.cf.cf9.ch11;


public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4, "Makis", "Kapetis");
        student2.setFirstname("Xrisostomos");


//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1);                    // setter
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");


        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstname(), alice.getLastname());
        System.out.println(Student.getStudentsCount());
    }
}
