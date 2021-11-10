package Model;

public class Mensagem {

    private Long idMensagem;
    private String feedback;
    private Long idCliente;

    public Mensagem() {}

    public Mensagem(String feedback, Long idCliente) {
        this.feedback = feedback;
        this.idCliente = idCliente;
    }

    public Long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(Long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return feedback;
    }
}
