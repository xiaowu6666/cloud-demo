package tk.syf.author.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tk.syf.author.dto.BookDTO;

@FeignClient(name = "book",url = "${app.book.remote}")
public interface BookFeign {
    
    @GetMapping("/book/getOne")
    BookDTO getOne();
}
