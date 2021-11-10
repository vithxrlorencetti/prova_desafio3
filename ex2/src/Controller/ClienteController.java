package Controller;

import DAO.ClienteDAO;
import Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    List<Cliente> clientes = new ArrayList<>();
    ClienteDAO clienteDao = new ClienteDAO();

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void cadastrarCliente(Cliente cliente) {

        if (idExistente(cliente.getIdCLiente()) == false) {
            clientes.add(cliente);
            clienteDao.gerarLog(cliente);
            System.out.println("Você cadastrou > " + cliente.getNomeCliente() + " < com sucesso!");
        } else {
            System.out.println("ID já cadastrado.");
        }

    }

    public boolean idExistente(Long idCliente){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getIdCLiente() == idCliente){
                return true;
            }
        }
        return false;
    }

}
