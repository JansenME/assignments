package nl.rabobank.recruitment.assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoubleStringCharacter {

    @Test
    public void test1() {
        String value = getFirstDoubleCharacter("ABCDFACB");

        assertEquals("A", value);
    }

    @Test
    public void test2() {
        String value = getFirstDoubleCharacter("BCABCA");

        assertEquals("B", value);
    }

    @Test
    public void test3() {
        String value = getFirstDoubleCharacter("ABCDEFGH");

        assertNull(value);
    }

    private String getFirstDoubleCharacter(final String value) {
        return null;
    }
}
