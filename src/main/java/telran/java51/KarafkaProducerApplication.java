package telran.java51;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaProducerApplication.class, args);
	}

	@Bean
	Supplier<String> sendMsg() {
		return () -> "Supplier #" + (int) (Math.random() * Integer.MAX_VALUE) + 1;
	}
}
