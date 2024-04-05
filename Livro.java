import java.time.LocalDate;
public class Livro{
    /*título, autor, editora, ano de publicação, e número de exemplares disponíveis. */
    private int id_livro;
    private String titulo;
    private String autor;
    private String editora;
    private String ano_publicacao;
    private  static int qtd_exemplares;
    private LocalDate data_devolucao;



    public Livro(String titulo, String autor, String editora, String ano_publicacao, int qtd_exemplares, int id_livro) {
        this.titulo = titulo;
        this.id_livro = id_livro;
        this.autor = autor;
        this.editora = editora;
        this.ano_publicacao = ano_publicacao;
        this.qtd_exemplares = qtd_exemplares;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getAno_publicacao() {
        return ano_publicacao;
    }
    public void setAno_publicacao(String ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
    public static int getQtd_exemplares() {
        return qtd_exemplares;
    }
    public static void setQtd_exemplares(int qtd_exemplares) {
        Livro.qtd_exemplares = qtd_exemplares;
    }
    public int getid_livro() {
        return id_livro;
    }
    public void setid_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    
    public LocalDate getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public static void diminuirQtd_exemplares(){
        qtd_exemplares --;
    }
    public static void aumentarQtd_exemplares(){
        qtd_exemplares ++;
    }
}