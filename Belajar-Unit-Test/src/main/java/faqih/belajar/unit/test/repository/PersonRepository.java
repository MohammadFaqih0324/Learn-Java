package faqih.belajar.unit.test.repository;

import faqih.belajar.unit.test.data.Person;
public interface PersonRepository {
    Person selectById(String id);

    void insert(Person person);

}
