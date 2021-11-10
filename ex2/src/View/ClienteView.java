package View;

import Controller.ClienteController;
import Model.Cliente;

import java.util.Scanner;

public class ClienteView {

    Scanner input = new Scanner(System.in);
    ClienteController clienteController = new ClienteController();
    MensagemView mensagemView = new MensagemView();
    private long idSelecionado;

    public void menuCliente() {

        System.out.println("1 - LISTAR CLIENTES");
        System.out.println("2 - SELECIONAR CLIENTE");
        System.out.println("3 - CADASTRAR CLIENTE");

        switch(input.nextInt()) {

            case 1:
                this.listarClientes();
                this.menuCliente();
                break;

            case 2:
                this.selecionarCliente();
                this.menuMensagem(idSelecionado);
                break;

            case 3:
                this.cadastrarCLiente();
                this.menuCliente();
                break;
        }

    }

    public void menuMensagem(Long idSelecionado) {

        System.out.println("1 - LISTAR MENSAGENS DO CLIENTE");
        System.out.println("2 - ESCREVER NOVA MENSAGEM");
        System.out.println("3 - VOLTAR");

        switch (input.nextInt()) {

            case 1:
                mensagemView.listarMensagens(idSelecionado);
                this.menuMensagem(idSelecionado);
                break;

            case 2:
                mensagemView.cadastrarMensagem(idSelecionado);
                this.menuMensagem(idSelecionado);
                break;

            case 3:
                idSelecionado = null;
                this.menuCliente();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + input.nextInt());
        }

    }

    public void cadastrarCLiente() {

        Cliente cliente = new Cliente();

        System.out.println("Insira um ID: ");
        cliente.setIdCLiente(input.nextLong());
        input.nextLine();
        System.out.println("Insira um nome: ");
        cliente.setNomeCliente(input.next());
        input.nextLine();

        clienteController.cadastrarCliente(cliente);
    }

    public void listarClientes() {
        clienteController.listarClientes();
    }

    public Long selecionarCliente() {

        this.listarClientes();
        System.out.println("Digite o ID do cliente que deseja acessar: ");
        idSelecionado = input.nextLong();
        if (clienteController.idExistente(idSelecionado) == true) {
            return idSelecionado;
        } else {
            System.out.println("O ID desejado ainda não existe.");
            this.menuCliente();
            return null;
        }

    }



}
