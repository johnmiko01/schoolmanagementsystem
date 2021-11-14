package com.finalproj.schoolmanagementsystem.Controller;
import com.finalproj.schoolmanagementsystem.Service.ParentService;
import com.finalproj.schoolmanagementsystem.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
public class ParentController {
    @Autowired
    private ParentService parentService;
    @PostMapping("/add")
    public String add(@RequestBody Parent parent){
        parentService.saveParent(parent);
        return "New Student is added";
    }

}
