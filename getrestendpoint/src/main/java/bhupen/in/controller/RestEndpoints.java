package bhupen.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BhupendraKumar on 7/9/18.
 */
@RestController
public class RestEndpoints {

    @RequestMapping("/course")
    public Course myCourse(@RequestParam(value="name",defaultValue = "Spring Boot") String name,
                           @RequestParam(value = "chapter",defaultValue = "5")int chapters){

        return new Course(name,chapters);


    }
}
