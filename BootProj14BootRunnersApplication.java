package in.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj14BootRunnersApplication {

	public static void main(String[] args) {
		System.out.println("**********Container Started*************");
		ApplicationContext applicationContext = SpringApplication.run(BootProj14BootRunnersApplication.class, args);
		
		System.out.println("******Container stopped***********");
		((ConfigurableApplicationContext) applicationContext).close();
		
	}

}
