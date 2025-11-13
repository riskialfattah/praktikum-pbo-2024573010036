package modul_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student("Riski ", 20, "2024573010036");

        // Memanggil method dari superclass
        student.displayInfo();

        // Memanggil method dari subclass
        student.study();

        // Memanggil overridden method
        student.greet();

        // Polymorphism: Student sebagai Person
        Person person = new Student("Al Fatah", 19, "031006");
        person.greet(); // Memanggil method yang di-override
    }
}
