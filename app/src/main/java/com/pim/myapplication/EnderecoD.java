package com.pim.myapplication;

public class EnderecoD {

    private String Nome;
    private int Cep;
    private String Rua;
    private int Numero;
    private String Complemento;

    public EnderecoD(String nome, int cep, String rua, int numero, String complemento){
        this.Nome = nome;
        this.Cep = cep;
        this.Rua = rua;
        this.Numero = numero;
        this.Complemento =  complemento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int cep) {
        Cep = cep;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
}
