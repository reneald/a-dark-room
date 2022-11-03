package be.leanderonline.adarkroom;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ADarkRoomApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ADarkRoomApplication.class);
		builder.headless(false);
		builder.run(args);
	}

}
