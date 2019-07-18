package nl.rabobank.recruitment.assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoundPairSum {
    private static final Integer SUM = 10;

    @Test
    public void test1() {
        final Integer[] intArray = new Integer[]{1, 3, 5, -1, 5};

        assertTrue(method(intArray));
    }

    @Test
    public void test2() {
        final Integer[] intArray = new Integer[]{1, 3, 6, -1, 5};

        assertFalse(method(intArray));
    }

    private boolean method(final Integer[] intArray) {


return false;
    }
}
