package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Service {
    
    @Autowired BranchRepository br;
    
    @RequestMapping("/list-branch")
    Iterable listBranch() {
        return br.findAll();
    }
    
    // Iterable = Able to loop
}