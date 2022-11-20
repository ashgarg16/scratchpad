import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTests {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("one", "two", "three", "four");
                //List.of("one", "two", "three", "four");

        //Inplace sorting
        Collections.sort(stringList, (s1, s2)-> s1.length()- s2.length());
        System.out.println(stringList);
        //Inplace sorting in reverse order
        Collections.sort(stringList, (s1,s2)->s2.length()-s1.length());
        System.out.println(stringList);

        // producing new sorted list
        stringList.stream()
                .sorted((s1, s2)-> s1.length()- s2.length())
                .forEach(System.out::println);
        System.out.println(stringList);

        var mapList = stringList.stream()
                .collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(mapList);
    }
}
