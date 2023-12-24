package dot.rpinter.demoprepato.controllers;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class HomeController {

    @Value("${helo.melo}")
    private String heloMeloProp;

    @GetMapping("d1")
    public ResponseEntity<String> getD1() {

        return ResponseEntity.ok("tamamaq:" + heloMeloProp + "");

    }
}
