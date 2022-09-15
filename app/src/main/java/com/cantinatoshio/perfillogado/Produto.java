package com.cantinatoshio.perfillogado;

public class Produto
{
   private int idProduto;
   private String nomeProduto;
   private double valorProduto;

   public Produto(){}

   public Produto(int idProduto, String nomeProduto, double valorProduto)
   {
       this.idProduto = idProduto;
       this.nomeProduto = nomeProduto;
       this.valorProduto = valorProduto;
   }

    public int getIdProduto()
    {
        return idProduto;
    }

    public void setIdProduto(int idProduto)
    {
        this.idProduto = idProduto;
    }

    public String getNomeProduto()
    {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto)
    {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto()
    {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto)
    {
        this.valorProduto = valorProduto;
    }
}
