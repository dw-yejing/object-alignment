import org.openjdk.jol.info.ClassLayout;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        String s = ClassLayout.parseInstance(person).toPrintable();
        System.out.println(s);
    }
}
