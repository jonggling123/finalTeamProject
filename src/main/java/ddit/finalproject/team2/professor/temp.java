package ddit.finalproject.team2.professor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/professor")
public class temp {
    @GetMapping("/lectureList")
    String lectureList(){
        return "/professor/lectureList";
    }
}