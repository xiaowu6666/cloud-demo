package tk.syf.author.model;

import lombok.Data;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Data
public class Author {

    public Author() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            this.ip = addr.getHostAddress();
        } catch (UnknownHostException e) {

        }
    }

    private String name = "神易风";

    private String experience = "从事Java开发已经有7年了，自称地下道程序员";
    ;

    private String company = "传统制造业";

    private String ip;
}
