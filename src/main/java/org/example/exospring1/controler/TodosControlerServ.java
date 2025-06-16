package org.example.exospring1.controler;

import org.example.exospring1.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class TodosControlerServ {

    private TodosService todosService;

    @Autowired
    public TodosControlerServ(@Qualifier("todos") TodosService todosService) {
        this.todosService = todosService;
    }



}
