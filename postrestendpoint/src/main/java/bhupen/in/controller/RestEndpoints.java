package bhupen.in.controller;

import org.omg.CORBA.Request;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST , value = "register/course")
    public String postCourse(@RequestBody Course course){

        return "We have successfully saved the course "+ course.getCourseName() + " having chapters " + course.getChapters();
    }
}
