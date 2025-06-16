package org.example.exospring1.service;

import org.example.exospring1.entity.Todos;
import org.springframework.stereotype.Service;

@Service("todos")
public class TodosServiceMTD implements TodosService{

    Todos todos = new Todos();

  @Override
  public boolean flipTask(Todos todos) {
        todos.setStatus(!todos.isStatus());
        return todos.isStatus();
    }


}
