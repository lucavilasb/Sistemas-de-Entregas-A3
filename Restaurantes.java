import java.util.ArrayList;

public class Restaurantes {
    private int idRestaurante;
    private String nomeRestaurante;
    private String cnpj;
    private String enderecoRestaurante;
    private String telefoneRestaurante;
    private ArrayList<Pratos> listaPratos = new ArrayList<Pratos>();

    public Restaurantes(int idRestaurante, String nomeRestaurante, String cnpj, String enderecoRestaurante, String telefoneRestaurante) {
        this.idRestaurante = idRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.cnpj = cnpj;
        this.enderecoRestaurante = enderecoRestaurante;
        this.telefoneRestaurante = telefoneRestaurante;
    }

    public int getIdRestaurante() {
        return this.idRestaurante;
    }
    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNomeRestaurante() {
        return this.nomeRestaurante;
    }
    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderecoRestaurante() {
        return this.enderecoRestaurante;
    }
    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public String getTelefoneRestaurante() {
        return this.telefoneRestaurante;
    }
    public void setTelefoneRestaurante(String telefoneRestaurante) {
        this.telefoneRestaurante = telefoneRestaurante;
    }

    public ArrayList<Pratos> getListaPratos() {
        return this.listaPratos;
    }
    public void setListaPratos(ArrayList<Pratos> listaPratos) {
        this.listaPratos = listaPratos;
    }

    public void adicionarPrato(Pratos prato) {
        this.listaPratos.add(prato);
    }
}
