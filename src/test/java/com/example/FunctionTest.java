package com.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionTest {

    @Test
    public void testFunction() throws Exception {
        try (Function function = new Function()) {
            assertEquals("Hello World", function.hello(HttpRequest.builder().build(), null).getBody());
        }
    }
}
