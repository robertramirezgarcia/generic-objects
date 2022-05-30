package com.robertramirez.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class Chocolatina {
    private String marca;

    @Override
    public String toString(){
        return "marca: " + marca;
    }
}
