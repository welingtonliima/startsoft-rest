package wjangoo.io.startsoft.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/endpoint")
public class SampleController {
    
    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("teste",HttpStatus.OK);
    }
    
}
