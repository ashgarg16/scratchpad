import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is thread" + Thread.currentThread().getName());
            }
        });
        thread1.start();

        Thread thread2 = new Thread(()-> System.out.println("This is thread 2 "));
        thread2.start();

        List<String> names = List.of("Ashwani", "Swati", "Kriyansh");

        List<Person> person = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        //stream way
        person = names.stream()
                .map(Person::new)
                .map(Person::new)
                .collect(Collectors.toList());
        System.out.println(person);

        //old way
        for ( String name : names ) {
            personList.add( new Person(name));
        }
        System.out.println(personList);



    }
}
