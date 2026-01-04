package com.example.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmployeeControllerTest {

    @Test
    void contextLoads() {
        EmployeeController controller = new EmployeeController();
        assertNotNull(controller);
    }
}
