package ibf2022.ssf.day11workshop;

// import java.util.Collections;

// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11workshopApplication {

	public static void main(String[] args) {

		// SpringApplication app = new SpringApplication(Day11workshopApplication.class);

		// String port = "3000";

		// ApplicationArguments appArgs = new DefaultApplicationArguments(args);

		// if (appArgs.containsOption("port")) {

		// 	port = appArgs.getOptionValues("port").get(0);
		// }

		// app.setDefaultProperties(Collections.singletonMap("server.port", port));
		// app.run(args);

		SpringApplication.run(Day11workshopApplication.class, args);
	}

}
