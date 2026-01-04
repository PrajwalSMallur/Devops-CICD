package com.example.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeApplicationTest {

    @Test
    void testHelloMethod() {
        EmployeeApplication app = new EmployeeApplication();
        assertEquals("hello", app.hello());
    }
}
