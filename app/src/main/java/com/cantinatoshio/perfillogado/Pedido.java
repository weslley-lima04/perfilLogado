package com.cantinatoshio.perfillogado;

import java.util.Date;
import java.util.List;

public class Pedido
{
    private int idPedido;
    private String nomeCliente;
    private int idCliente;
    private Date dataPedido;
    private List<Produto> produto;

    public Pedido() {}

    public Pedido(int idPedido, String nomeCliente, int idCliente, Date dataPedido, List<Produto> produto)
    {
        this.idPedido = idPedido;
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
        this.dataPedido = dataPedido;
        this.produto = produto;
    }

    public int getIdPedido()
    {
        return idPedido;
    }

    public Date getDataPedido()
    {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido)
    {
        this.dataPedido = dataPedido;
    }

    public List<Produto> getProduto()
    {
        return produto;
    }

    public void setProduto(List<Produto> produto)
    {
        this.produto = produto;
    }
}
