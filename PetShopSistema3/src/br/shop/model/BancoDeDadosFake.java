package br.shop.model;

import java.util.ArrayList;
import java.util.List;

import br.shop.agendamento.Agendamento;

public class BancoDeDadosFake {
    
    // Lista de clientes visível em todo o sistema
    public static List<Cliente> clientes = new ArrayList<>();

    // Lista de agendamentos visível em todo o sistema
    public static List<Agendamento> agendamentos = new ArrayList<>();
}
