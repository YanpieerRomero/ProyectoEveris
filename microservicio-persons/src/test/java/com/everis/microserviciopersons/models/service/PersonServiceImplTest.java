package com.everis.microserviciopersons.models.service;

import com.everis.microserviciopersons.models.dao.PersonDao;
import com.everis.microserviciopersons.models.entity.Person;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class PersonServiceImplTest {
    private PersonDao personDao;
    private IPersonService iPersonService;

    @Before
    public void setup() {
        personDao = Mockito.mock(PersonDao.class);
        iPersonService = new PersonServiceImpl(personDao);

        Mockito.when(personDao.findAll()).thenReturn(Arrays.asList(
                new Person(1L, "10000000", true, true),
                new Person(2L, "10000001", true, true),
                new Person(3L, "10000002", true, true),
                new Person(4L, "10000003", true, true),
                new Person(5L, "10000004", true, true)
        ));

        Mockito.when(personDao.findByDocument("10000000"))
                .thenReturn(new Person(1L, "10000000", true, true));

        Mockito.when(personDao.findById(2L))
                .thenReturn(java.util.Optional.of(new Person(2L, "10000001", true, true)));
    }

    @Test
    public void return_person_by_id() {
        Person person = iPersonService.findById(2L).block();
        Assertions.assertThat(person).isEqualTo(new Person(2L, "10000001", true, true));
    }

    @Test
    public void return_persons_by_document() {
        Person person = iPersonService.findByDocument("10000000").block();
        Assertions.assertThat(person).isEqualTo(new Person(1L, "10000000", true, true));
    }

    @Test
    public void return_all_persons() {
        List<Person> persons = iPersonService.findAll().collectList().block();
        Assertions.assertThat(persons.size() > 0).isTrue();
    }
}