package org.example.exospring1.entity;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Todos {



    private String name;
    private String description;
    private boolean status;



}
