package org.example.exospring1.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodosControler {

    @RequestMapping("/")
    public String todos(){
        System.out.println("Going in todos main");

        return "todos";
    }

    @RequestMapping("/home/listing")
    @ResponseBody
    public List<String> getTodos(){
        return List.of("Task 1", "Task 2", "Task 3", "Task 4");
    }

    @RequestMapping("/home/listing")
    public String todosInfos(Model model){
model.addAttribute("name", "Task 1");
model.addAttribute("description", "Relink Wire");
model.addAttribute("status", true);
List<String> todos = List.of("Task 1", "Task 2", "Task 3", "Task 4");
model.addAttribute("todos", todos);

        return "listing/details";
    }

    @RequestMapping("/home/listing")
    public String todosInfosEmpty(Model model){
//        model.addAttribute("name", "Task 1");
//        model.addAttribute("description", "Relink Wire");
        List<String> todos = List.of();
        model.addAttribute("todos", todos);

        return "listing/details";
    }

}
