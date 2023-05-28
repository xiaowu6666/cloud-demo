package tk.syf.book.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tk.syf.book.dto.AuthorDTO;

@FeignClient(name = "author",url = "${app.author.remote}")
public interface AuthorFeign {

    @GetMapping("/author/getOne")
    AuthorDTO getOne();
}
