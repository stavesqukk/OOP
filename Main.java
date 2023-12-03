import models.Mammalia;
import models.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Student sc = new Student();
        Student sm = new Student();
        System.out.println(sc);
        System.out.println(sm);
        System.out.println(sc.getAge());
        System.out.println(sm.getName());
        Mammalia dog = new Mammalia();
        Mammalia cow = new Mammalia();
        System.out.println(dog.getNo_of_heart());
        System.out.println(cow.isWarm_blodded());
        System.out.println(dog.isHairy_body());
        System.out.println(cow.getName());
        cow.setName("Cow");
        System.out.println(cow.getName());

    }
}
//generate result math english science keep a person name than set reusult marks