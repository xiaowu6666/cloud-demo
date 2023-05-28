package tk.syf.book.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@Data
public class Book {

    public Book() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            this.ip = addr.getHostAddress();
        } catch (UnknownHostException e) {

        }
    }

    private String bookName = "Kubernetes云原生实践";

    private String author = "神易风";

    private String press = "xx工业出版社";

    private String introduce = "这是一本关于Java云原生实践想法";

    private String ip;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime localDateTime = LocalDateTime.now();
}
