import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson01.Greeting;
import ru.sberbank.jd.lesson01.GreetingImpl;

import java.util.ArrayList;
import java.util.List;


public class GreetingTest {
    Greeting greeting = new GreetingImpl(
            "Василий",
            "Сиренко",
            1990,
            List.of("ролики", "сноуборд"),
            "https://github.com/vvsirenko/home-assignments-0224",
            "+79154268253",
            List.of("практика", "опыт", "освоение ООП")
    );

    @Test
    public void firstName() {
        Assert.assertTrue(greeting.getFirstName().equals("Василий"));
    }

    @Test
    public void lastName() {
        Assert.assertTrue(greeting.getLastName().equals("Сиренко"));
    }

    @Test
    public void birthYear() {
        Assert.assertEquals(greeting.getBirthYear(),  1990);
    }

    @Test
    public void getHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("ролики");
        hobbies.add("сноуборд");
        Assert.assertEquals(greeting.getHobbies(), hobbies);
    }

    @Test
    public void getRepoUrl() {
        Assert.assertTrue(greeting.getRepoUrl().equals("https://github.com/vvsirenko/home-assignments-0224"));
    }

    @Test
    public void getPhone() {
        Assert.assertTrue(greeting.getPhone().equals("+79154268253"));
    }

    @Test
    public void getCourseExpectations() {
        List<String> courseExpectations = new ArrayList<>();
        courseExpectations.add("практика");
        courseExpectations.add("опыт");
        courseExpectations.add("освоение ООП");
        Assert.assertEquals(greeting.getCourseExpectations(), courseExpectations);
    }
}
