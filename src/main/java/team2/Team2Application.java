package team2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages={"team2.controller"})
public class Team2Application {

	public static void main(String[] args) {
		SpringApplication.run(Team2Application.class, args);
	}

}
