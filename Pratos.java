public class Pratos {
    private String nomePrato;
    private String descricaoPrato;
    private double precoPrato;

    public Pratos(String nomePrato, String descricaoPrato, double precoPrato) {
        this.nomePrato = nomePrato;
        this.descricaoPrato = descricaoPrato;
        this.precoPrato = precoPrato;
    }

    public String getNomePrato() {
        return this.nomePrato;
    }
    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescricaoPrato() {
        return this.descricaoPrato;
    }
    public void setDescricaoPrato(String descricaoPrato) {
        this.descricaoPrato = descricaoPrato;
    }

    public double getPrecoPrato() {
        return this.precoPrato;
    }
    public void setPrecoPrato(double precoPrato) {
        this.precoPrato = precoPrato;
    }
}
