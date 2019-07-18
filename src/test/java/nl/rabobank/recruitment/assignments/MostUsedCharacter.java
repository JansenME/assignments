package nl.rabobank.recruitment.assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MostUsedCharacter {
    @Test
    public void test1() {
        final String[] stringArray = new String[]{"A", "B", "A", "B", "A"};

        assertEquals("A", getMostUsedCharacter(stringArray));
    }

    @Test
    public void test2() {
        final String[] stringArray = new String[]{"A", "B", "A", "B", "B"};

        assertEquals("B", getMostUsedCharacter(stringArray));
    }

    private String getMostUsedCharacter(final String[] stringArray) {
        return null;
    }
}
