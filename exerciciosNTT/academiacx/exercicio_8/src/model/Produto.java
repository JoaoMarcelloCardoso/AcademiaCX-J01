package model;

public class Produto {
    private Integer id;
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto() {
    }

    public Produto(Integer id, String nome, Double preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String dadosProdutos(){
        return ("\n[ID] - "+this.id +
                "\n[NOME] - "+this.nome +
                "\n[PRECO] - "+this.preco +
                "\n[QTD] - "+ this.quantidade
                );
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
