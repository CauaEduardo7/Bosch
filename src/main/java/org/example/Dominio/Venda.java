package org.example.Dominio;

// src/main/java/com/varejorapido/model/Venda.java
public class Venda {
    private String idVenda;
    private String dataVenda;
    private double valorTotal;
    private String idCliente;

    // Construtor completo
    public Venda(String idVenda, String dataVenda, double valorTotal, String idCliente) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    // Getters
    public String getIdVenda() { return idVenda; }
    public String getDataVenda() { return dataVenda; }
    public double getValorTotal() { return valorTotal; }
    public String getIdCliente() { return idCliente; }
}