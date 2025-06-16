package org.example.exospring1.controler;

import org.example.exospring1.entity.Todos;
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

    @RequestMapping("/home/listingall")
    @ResponseBody
    public List<String> getTodos(){
        return List.of("Task 1", "Task 2", "Task 3", "Task 4");
    }




    @RequestMapping("/home/detaillast")
    public String todosInfos(Model model){
model.addAttribute("name", "Task 1");
model.addAttribute("description", "Relink Wire");
model.addAttribute("status", true);
        model.addAttribute("name", "Task 2");
        model.addAttribute("description", "Scanner");
        model.addAttribute("status", false);
        model.addAttribute("name", "Task 3");
        model.addAttribute("description", "Upload Manifold");
        model.addAttribute("status", true);
        return "listing/details";
    }

//    @RequestMapping("/home/listingall")
//    public String todosALL(Model model){
//        model.addAttribute("name", "Task 1");
//        model.addAttribute("description", "Relink Wire");
//        model.addAttribute("status", true);
//        List<String> todos = List.of("Task 1", "Task 2", "Task 3", "Task 4");
//        model.addAttribute("todos", todos);
//
//        return "listing/listOFall";
//    }


//    @RequestMapping
//    public Todos todos(){
//        Todos todos = new Todos();
//        todos.setName("Task 2");
//        todos.setDescription("Upload Manifold");
//        todos.setStatus(false);
//        return
//    }


    @RequestMapping("/home/listingempty")
    public String todosInfosEmpty(Model model){
//        model.addAttribute("name", "Task 1");
//        model.addAttribute("description", "Relink Wire");
        List<String> todos = List.of();
        model.addAttribute("todos", todos);

        return "listing/listOFall";
    }

}
