package com.cantinatoshio.perfillogado;

public class Cliente
{

    private int idCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String emailCliente;

    public Cliente()
    {
    }

    public Cliente(int idCliente, String nomeCliente, String telefoneCliente, String emailCliente)
    {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public int getIdCliente()
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente)
    {
        this.idCliente = idCliente;
    }

    public String getEmailCliente()
    {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente)
    {
        this.emailCliente = emailCliente;
    }

    public String getNomeCliente()
    {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente()
    {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente)
    {
        this.telefoneCliente = telefoneCliente;
    }
}
