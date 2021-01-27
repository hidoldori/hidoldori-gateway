package hidoldori.lab.hidoldorigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

public class FallbackController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/fallback")
    public Mono<String> fallback(){
        log.error("+++++++++++++++++++++++++++++++++++++++++");
        log.error("+++++++++++++++++++++++++++++++++++++++++");
        log.error("+++++++++++++++++++++++++++++++++++++++++");
        log.error("+++++++++++++++++++++++++++++++++++++++++");
        log.error("+++++++++++++++++++++++++++++++++++++++++");
        log.error("+++++++++++++++++++++++++++++++++++++++++");
        return Mono.just("fallback");
    }
}
