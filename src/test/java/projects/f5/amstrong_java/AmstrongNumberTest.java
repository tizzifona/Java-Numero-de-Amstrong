package projects.f5.amstrong_java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class AmstrongNumberTest {

    @Test
    void testIsAmstrongNumber() {
        assertThat("371 should be an Armstrong number", AmstrongNumber.isAmstrongNumber(371), is(true));
        assertThat("1634 should be an Amstrong number", AmstrongNumber.isAmstrongNumber(1634), is(true));
        assertThat("1 741 725 should be an Amstrong number", AmstrongNumber.isAmstrongNumber(1741725), is(true));
    }

    @Test
    void testIsNotAmstrongNumber() {
        assertThat("351 should not be an Amstrong number", AmstrongNumber.isAmstrongNumber(351), is(false));
        assertThat("2015 should not be an Amstrong number", AmstrongNumber.isAmstrongNumber(2015), is(false));
        assertThat("12345 should not be an Amstrong number", AmstrongNumber.isAmstrongNumber(12345), is(false));
    }

}
