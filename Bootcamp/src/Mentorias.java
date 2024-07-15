import java.time.LocalDate;

public class Mentorias extends Conteudos {
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentorias [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }
    @Override
    public double calcularxp() {
        return 0;
    }

    

}
