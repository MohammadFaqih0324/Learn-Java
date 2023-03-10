package faqih.belajar.unit.test;

import org.junit.jupiter.api.Test;

public class lifecycleTest {

    private String temp;

    @Test
    void testA() {
        temp = "Faqih";
    }

    @Test
    void testB() {
        System.out.println(temp);
    }
}
