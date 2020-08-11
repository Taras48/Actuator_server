package edu.web.actuator.platformparent;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class PlatformParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformParentApplication.class, args);
	}

}
