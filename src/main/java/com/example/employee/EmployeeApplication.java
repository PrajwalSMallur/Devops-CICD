@SpringBootApplication
public class EmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    // NEW CODE (this is important)
    public String hello() {
        return "hello";
    }
}
