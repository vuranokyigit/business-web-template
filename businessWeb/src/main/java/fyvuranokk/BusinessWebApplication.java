package fyvuranokk;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;
@EnableJpaRepositories(basePackages = "fyvuranokk.data.repository") //Repository bulamadığı zaman
@EnableJpaAuditing(auditorAwareRef = "auditorAwareMethod")
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
public class BusinessWebApplication {
@PostConstruct
public void init(){
    TimeZone.setDefault(TimeZone.getTimeZone("Europe/Istanbul")); }


    public static void main(String[] args) {
        //Disables headless JOptionPane
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(BusinessWebApplication.class, args);
    }

}
