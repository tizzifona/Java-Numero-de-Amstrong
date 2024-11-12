package projects.f5.amstrong_java;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    @Test
    void testMainOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(new String[] {});

        String output = outputStream.toString();

        assertThat(output, containsString("371 is an Amstrong number"));
        assertThat(output, containsString("1634 is an Amstrong number"));
        assertThat(output, containsString("351 is not an Amstrong number"));
        assertThat(output, containsString("2015 is not an Amstrong number"));
    }

    @Test
    void testApp() {
        assertEquals(1, 1);
    }
}
