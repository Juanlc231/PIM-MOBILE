package com.pim.myapplication;

public class CarrinhoD {
    private String Produto;
    private double Preco;
    private int Quantidade;
    private double Subtotal;

    public CarrinhoD(String produto,double preco,int quantidade,double subtotal) {
        this.Produto = produto;
        this.Preco = preco;
        this.Quantidade = quantidade;
        this.Subtotal = subtotal;
    }

    public String getProduto() {
        return Produto;
    }
    public void setProduto(String produto) {

        Produto = produto;
    }
    public double getPreco() {
        return Preco;
    }
    public void setPreco(double preco) {

        Preco = preco;
    }
    public int getQuantidade() {
        return Quantidade;
    }
    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
    public double getSubtotal() {
        return Subtotal;
    }
    public void setSubtotal(double subtotal) {

        Subtotal = subtotal;
    }
}
