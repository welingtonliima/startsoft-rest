package wjangoo.io.startsoft.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/endpoint")
public class SampleController {
    
    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("teste",HttpStatus.OK);
    }
    
}
