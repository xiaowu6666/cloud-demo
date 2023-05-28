package tk.syf.author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AuthorApp {

    public static void main(String[] args) {
        SpringApplication.run(AuthorApp.class,args);
    }
}
