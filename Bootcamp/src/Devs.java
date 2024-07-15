import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Devs {

    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosfinalizados = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
       Optional<Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();
       if(conteudo.isPresent()) {
            this.conteudosfinalizados.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
       } else {
            System.out.println("Você não está matriculado em nenhum conteúdo!");
       }
    }

    public double calcularTotalXP() {
        Iterator<Conteudos> iterator = this.conteudosfinalizados.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularxp();
            soma += next;
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudos> getConteudosfinalizados() {
        return conteudosfinalizados;
    }

    public void setConteudosfinalizados(Set<Conteudos> conteudosfinalizados) {
        this.conteudosfinalizados = conteudosfinalizados;
    }
}
