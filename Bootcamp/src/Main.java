public class Main {
    public static void main(String[] args) throws Exception {
        
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java iniciante");
        curso1.setCargaHoraria(40);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python do básico ao avançado");
        curso2.setCargaHoraria(60);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Essa é a mentoria criada para o curso de Java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Esse é o bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs devLeonardo = new Devs();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leonardo/n" + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("Conteudos Inscritos Leonardo/n" + devLeonardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Leonardo/n" + devLeonardo.getConteudosfinalizados());
        System.out.println("XP: " + devLeonardo.calcularTotalXP());
        
        System.out.println("--------------------------------------");
        
        Devs devRebeca = new Devs();
        devRebeca.setNome("Rebeca");
        devRebeca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rebeca/n" + devRebeca.getConteudosInscritos());
        devRebeca.progredir();
        devRebeca.progredir();
        devRebeca.inscreverBootcamp(bootcamp);
        devRebeca.progredir();
        devRebeca.progredir();
        devRebeca.progredir();
        System.out.println("Conteúdos inscritos Rebeca/n" + devRebeca.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rebeca/n" + devRebeca.getConteudosfinalizados());
        System.out.println("XP: " + devRebeca.calcularTotalXP());
        
        
        
    }
}
