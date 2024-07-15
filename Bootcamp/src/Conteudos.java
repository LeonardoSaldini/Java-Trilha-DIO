public abstract class Conteudos {
    
    protected static final double XP_PADRAO = 10;

    protected String titulo;
    protected String descricao;
    
    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public abstract double calcularxp();

}
