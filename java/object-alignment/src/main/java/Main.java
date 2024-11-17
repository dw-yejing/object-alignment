import org.openjdk.jol.info.ClassLayout;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        String s = ClassLayout.parseInstance(person).toPrintable();
        System.out.println(s);

        Person2 person2 = new Person2();
        String s2 = ClassLayout.parseInstance(person2).toPrintable();
        System.out.println(s2);
    }
}
