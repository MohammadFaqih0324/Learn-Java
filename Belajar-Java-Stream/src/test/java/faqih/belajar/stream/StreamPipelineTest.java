package faqih.belajar.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateSteramPipeline(){

        // JARANG DI GUNAKAN CARA SEPERTI INI

        List<String> list = List.of("Mohamad", "Faqih", "Egy");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr " + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk(){

        List<String> list = List.of("Mohamad", "Faqih", "Egy");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr " + upper)
                .forEach(System.out::println);
    }
}
