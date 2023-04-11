package com.leogereks.cursojava.aula22.labs.ex2;

public class TesteLivro {
    public static void main(String[] args) {

        Livro medieval = new Livro();

        medieval.titulo = "GOT";
        medieval.editora = "Suma";
        medieval.edicao = "sexta";
        medieval.paginas = 600;
        medieval.preco = 48.9;

        System.out.println(medieval.titulo);
        System.out.println(medieval.paginas);
        System.out.println(medieval.preco);

        Livro fantasia = new Livro();

        fantasia.titulo = "HP";
        fantasia.editora = "Rocco";
        fantasia.edicao = "quinta";
        fantasia.paginas = 265;
        fantasia.preco = 33.67;

        System.out.println(fantasia.titulo);
        System.out.println(fantasia.paginas);
        System.out.println(fantasia.preco);

    }
}
