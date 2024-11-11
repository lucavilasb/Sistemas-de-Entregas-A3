import java.util.Scanner;
public class Entregas {
    private int idUsuario;
    private String nomeUsuario;
    private String cpf;
    private String telefone;
    private String endereco;

    Scanner entrada = new Scanner(System.in);

    public Entregas(int idUsuario, String nomeUsuario, String cpf, String telefone, String endereco) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return this.nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // public void registrarUsuário() {

    // }
}