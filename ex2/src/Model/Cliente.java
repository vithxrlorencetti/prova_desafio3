package Model;

public class Cliente {

    private long idCLiente;
    private String nomeCliente;

    public Cliente() {
    }

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public long getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(long idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return nomeCliente + " | ID: " + idCLiente;
    }
}
