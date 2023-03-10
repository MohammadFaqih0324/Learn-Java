package faqih.belajar.unit.test.service;

import faqih.belajar.unit.test.data.Person;
import faqih.belajar.unit.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           personService.get("not found");
        });
    }

    @Test
    void testGetPersonSucces() {
        // menambah behavior ke mock object
        Mockito.when(personRepository.selectById("egy"))
                .thenReturn(new Person("egy","Egy"));

        var person = personService.get("egy");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("egy", person.getId());
        Assertions.assertEquals("Egy", person.getName());
    }

    @Test
    void testRegisterSuccess(){
        var person = personService.register("Egy");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Egy", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Egy"));
    }
}