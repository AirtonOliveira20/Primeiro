package br.pro.oliveira.pacote1;

import br.pro.oliveira.pacote2.Produto;
import br.pro.oliveira.pacote3.Estoque;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Computador", 100, "85-7542-239-1"));
        estoque.adicionarProduto(new Produto("TV", 154, "9788595080805"));

        System.out.println("Todos os produtos do estoque:");
        for (Produto produto : estoque.listarProdutos()) {
            System.out.println(produto);
        }


        String nome = "Computador";
        Produto produtoEncontrando = estoque.buscarProduto(nome);
        if (produtoEncontrando != null) {
            System.out.println("\nProduto encontrado por nome: '" + nome + "'" + produtoEncontrando);
        } else {
            System.out.println("\nProduto com nome '" + nome + "' não encontrado.");
        }
    }
}
