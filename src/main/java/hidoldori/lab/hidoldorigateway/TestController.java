package hidoldori.lab.hidoldorigateway;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hidoldori/lab/hidoldori-gateway")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
