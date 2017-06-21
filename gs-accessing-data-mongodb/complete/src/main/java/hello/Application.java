package hello;

// run the application using "./mvnw spring-boot:run"
//Or you can build the JAR file with ./mvnw clean package. Then you can run the JAR file:
//
//		java -jar target/gs-accessing-data-mongodb-0.1.0.jar

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith","alicesmith@gmail.com"));
		repository.save(new Customer("Bob", "Smith","bobsmith@gmail.com"));
		repository.save(new Customer("Jianmei", "Ye","jianmei2017@gmail.com"));
		repository.save(new Customer("Jamei","Ye"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Ye'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Ye")) {
			System.out.println(customer);
		}

		System.out.println("Customer found with findByEmail('jianmei2017@gmail.com'):");
		System.out.println("-----------@@@@@@@@@@@@@@@-------------");
		System.out.println(repository.findByEmail("jianmei2017@gmail.com"));


	}

}
