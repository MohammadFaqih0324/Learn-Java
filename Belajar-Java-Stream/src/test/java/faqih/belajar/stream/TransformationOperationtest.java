package faqih.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationtest {

    @Test
    void testMap(){
        List.of("Mohamad", "Faqih", "Egy").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap(){
        List.of("Mohamad", "Faqih", "Egy").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(length -> System.out.println(length));
    }
}
