package com.robertramirez.example;

public class TestBolsa {
    public static void main(String[] args){
        Bolsa<Chocolatina> bolsaChocolatina = new Bolsa<Chocolatina>();
        Chocolatina firstChoco = new Chocolatina("san jorge");
        Chocolatina secondChoco = new Chocolatina("alicorp");
        bolsaChocolatina.add(firstChoco);
        bolsaChocolatina.add(secondChoco);

        bolsaChocolatina.getLista().stream().forEach(System.out::println);
    }
}
