package View;

import Controller.MensagemController;
import DAO.MensagemDAO;
import Model.Mensagem;

import java.util.Scanner;

public class MensagemView {

    Scanner input = new Scanner(System.in);
    MensagemController mensagemController = new MensagemController();
    MensagemDAO mensagemDAO = new MensagemDAO();

    public void cadastrarMensagem(Long idSelecionado) {

        Mensagem mensagem = new Mensagem();

        System.out.println("Digite sua mensagem: ");
        mensagem.setFeedback(input.nextLine());
        mensagem.setIdCliente(idSelecionado);

        mensagemController.cadastrarMensagem(mensagem);

    }

    public void listarMensagens(Long idCliente) {
        System.out.println(mensagemController.getMensagensByIdCliente(idCliente));
    }
}
