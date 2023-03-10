package faqih.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderStream {

    @Test
    void testCreateStreamBuilder(){

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Mohamad");
        builder.add("Faqih").add("Egy");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify(){

        Stream<Object> stream = Stream.builder()
                .add("Mohamad").add("Faqih").add("Egy").build();

        stream.forEach(System.out::println);
    }
}
