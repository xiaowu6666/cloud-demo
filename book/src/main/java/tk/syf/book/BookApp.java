package tk.syf.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookApp {

    public static void main(String[] args) {
        SpringApplication.run(BookApp.class, args);
    }
}
