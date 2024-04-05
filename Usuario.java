public class Usuario {
    private int id_usuario;
    private String nome;
    private String endereco;
    private String telefone;
    public Usuario(int id_usuario, String nome, String endereco, String telefone) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}