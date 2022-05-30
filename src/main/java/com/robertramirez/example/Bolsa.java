package com.robertramirez.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;

@Getter
@Setter
@NoArgsConstructor
public class Bolsa<T> implements Iterable<T>{

    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;

    public Bolsa(int tope){
        super();
        this.tope = tope;
    }

    public void add(T objeto){
        //lista.stream().map(lista -> lista.add(objeto));
        lista.add(objeto);
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

    public String toString(){
        return lista.iterator().toString();
    }

}
