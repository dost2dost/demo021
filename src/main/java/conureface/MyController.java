package conureface;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Dost Muhammad on 5/30/2018.
 */
@Controller
public class MyController {
    @GetMapping("/hello")
    public String index(){
        return "/index";
    }
    @GetMapping("/face")
    public String wel(){
        return "/welcome";
    }
}
