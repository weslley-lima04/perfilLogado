package com.cantinatoshio.perfillogado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class infoContaFragment extends Fragment
{
    TextView infoTelCliente, infoEmailCliente, infoNomecliente;
    Cliente clienteTeste = new Cliente(0000, "Teste da Silva", "0000-0000", "teste@teste.com");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.infoconta_layout, container, false);
        infoTelCliente = view.findViewById(R.id.infoTelefoneCliente);
        infoEmailCliente = view.findViewById(R.id.infoEmailCliente);
        infoNomecliente = view.findViewById(R.id.infoNomeCliente);

        infoTelCliente.setText(clienteTeste.getTelefoneCliente());
        infoEmailCliente.setText(clienteTeste.getEmailCliente());
        infoNomecliente.setText(clienteTeste.getNomeCliente());



        return view ;
    }


}