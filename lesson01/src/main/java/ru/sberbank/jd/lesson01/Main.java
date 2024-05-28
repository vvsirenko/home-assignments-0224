package ru.sberbank.jd.lesson01;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Greeting my_greeting = new GreetingImpl(
                "Василий",
                "Сиренко",
                1990,
                List.of("ролики", "сноуборд"),
                "https://github.com/vvsirenko/home-assignments-0224",
                "+79154268253",
                List.of("практика", "опыт", "освоение ООП")
        );
        System.out.println(my_greeting.getFirstName());
        System.out.println(my_greeting.getLastName());
        System.out.println(my_greeting.getBirthYear());
        System.out.println(my_greeting.getHobbies());
        System.out.println(my_greeting.getRepoUrl());
        System.out.println(my_greeting.getPhone());
        System.out.println(my_greeting.getCourseExpectations());
    }
}

