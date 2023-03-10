package faqih.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit(){
        List.of("Mohamad", "Faqih", "Egy", "Hapis", "Wijayanto").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Mohamad", "Faqih", "Egy", "Hapis", "Wijayanto").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Mohamad", "Melisa", "Faqih", "Egy", "Hapis", "Wijayanto").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile(){
        List.of("Mohamad", "Faqih", "Egy", "Hapis", "Wijayanto").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindEny(){
        Optional<String> optional =  List.of("Mohamad", "Faqih", "Egy", "Hapis", "Wijayanto").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst(){
        Optional<String> optional =  List.of("Mohamad", "Faqih", "Egy", "Hapis", "Wijayanto").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}