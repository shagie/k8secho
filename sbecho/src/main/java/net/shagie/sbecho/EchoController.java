package net.shagie.sbecho;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping("/echo")
    public Echo greeting(@RequestParam(value = "value", defaultValue = "echo") String echo) {
        return new Echo(echo);
    }
}
