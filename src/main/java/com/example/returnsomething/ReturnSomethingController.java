package com.example.returnsomething;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnSomethingController {
    @RequestMapping
    public String returnSomenting(){
        return "De azi sunt miliardar";
    }

    @RequestMapping("/serios")
    public String serios(){
        return "Glumeam :)";
    }
}
