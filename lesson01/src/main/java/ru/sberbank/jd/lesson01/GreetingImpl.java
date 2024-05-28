package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Класс приветствия студентов курса по Java
 * @autor vvsirenko
 * @version 1.0
 */
public class GreetingImpl implements Greeting {
    /** Поле имя */
    String firstName;
    /** Поле фамилия */
    String lastName;
    /** Поле год рождения */
    int birthYear;
    /** Поле набора хобби */
    List<String> hobbies;
    /** Поле имени репозитория */
    String url;
    /** Поле телефона */
    String phone;
    /** Поле набора ожиданий */
    List<String> courseExpectations;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param firstName - имя
     * @param lastName - фамилия
     * @param birthYear - год рождения
     * @param hobbies - хобби
     * @param url - репозиторий
     * @param phone - телефон
     * @param courseExpectations - ожидания
     */
    public GreetingImpl(
            String firstName, String lastName, int birthYear,
            List<String> hobbies, String url, String phone, List<String> courseExpectations
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.hobbies = new ArrayList<>(hobbies);
        this.url = url;
        this.phone = phone;
        this.courseExpectations = new ArrayList<>(courseExpectations);
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#firstName}
     * @return возвращает имя
     */
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#lastName}
     * @return возвращает фамилию
     */
    @Override
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#birthYear}
     * @return возвращает год рождения
     */
    @Override
    public int getBirthYear() {
        return this.birthYear;
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#hobbies}
     * @return возвращает хобби
     */
    @Override
    public Collection<String> getHobbies() {
        return this.hobbies;
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#url}
     * @return возвращает репозиторий
     */
    @Override
    public String getRepoUrl() {
        return this.url;
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#phone}
     * @return возвращает телефон
     */
    @Override
    public String getPhone() {
        return this.phone;
    }

    /**
     * Функция получения значения поля {@link GreetingImpl#courseExpectations}
     * @return возвращает ожидания
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return this.courseExpectations;
    }
}
