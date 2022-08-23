package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Service {
    
    @RequestMapping("/list-branch")
    Iterable listBranch() {
        return null;
    }
    
    // Iterable = Able to loop
}