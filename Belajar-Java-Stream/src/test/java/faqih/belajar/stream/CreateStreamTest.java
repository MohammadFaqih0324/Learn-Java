package faqih.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream(){

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Faqih");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = "Hapis";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray(){

        Stream<String> arrayStream = Stream.of("Mohamad", "Faqih", "Egy");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1,2,3,42,65,76,34);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Mohamad", "Faqih", "Egy"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection(){
        Collection<String> collection = List.of("Mohamad", "Faqih", "Egy");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);


        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream(){
        Stream<String> stream = Stream.generate(() -> "Programmer Zaman Now");
//        Stream.forEach(System.out::println);

        Stream<Integer> iterete = Stream.iterate(1, value -> value + 1);
//        iterete.forEach(System.out::println);
    }
}
