package hello;
/**
 * you can run the application using ./mvnw spring-boot:run.
 * Or you can build the JAR file with ./mvnw clean package.
 * Then you can run the JAR file:
 * java -jar target/gs-messaging-stomp-websocket-0.1.0.jar
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
