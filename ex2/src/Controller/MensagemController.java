package Controller;

import DAO.ClienteDAO;
import DAO.MensagemDAO;
import Model.Cliente;
import Model.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class MensagemController {

    List<Mensagem> mensagens = new ArrayList<>();
    MensagemDAO mensagemDAO = new MensagemDAO();

    public void cadastrarMensagem(Mensagem mensagem) {

        mensagens.add(mensagem);
        mensagemDAO.gerarLog(mensagem);
        System.out.println("Feedback enviado com sucesso!");

    }

    public List<Mensagem> getMensagensByIdCliente(Long idCliente) {

        List<Mensagem> mensagensCliente = new ArrayList<>();

        for (int i = 0; i < this.mensagens.size(); i++) {
            if (mensagens.get(i).getIdCliente() == idCliente) {
                mensagensCliente.add(mensagens.get(i));
            }
        }

        return mensagensCliente;

    }

}
