import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Conteudo curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("POO com Java");
        ((Curso)curso1).setCargaHoraria(4);

        Conteudo curso2 = new Curso();
        curso2.setTitulo("Java8");
        curso2.setDescricao("Java Streams");
        ((Curso)curso2).setCargaHoraria(4);

        Conteudo mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria POO com Java");
        ((Mentoria)mentoria1).setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        //System.out.println(bootcamp.getDataInicio() + " - " + bootcamp.getDataFinal());
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java zero2hero");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Tiago");
        System.out.println(dev1.getNome() + ", Conteudos inscritos " + dev1.getConteudosInscrito());
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome() + ", Conteudos inscritos " + dev1.getConteudosInscrito());
        System.out.println(dev1.getNome() + ", Conteudos concluidos " + dev1.getConteudosConcluidos());
        dev1.progredirBootcamp();
        System.out.println("progredirBootcamp()");
        System.out.println(dev1.getNome() + ", Conteudos inscritos " + dev1.getConteudosInscrito());
        System.out.println(dev1.getNome() + ", Conteudos concluidos " + dev1.getConteudosConcluidos());

        dev1.progredirBootcamp();
        System.out.println("progredirBootcamp()");
        System.out.println(dev1.getNome() + ", Conteudos inscritos " + dev1.getConteudosInscrito());
        System.out.println(dev1.getNome() + ", Conteudos concluidos " + dev1.getConteudosConcluidos());

        dev1.progredirBootcamp();
        System.out.println("progredirBootcamp()");
        System.out.println(dev1.getNome() + ", Conteudos inscritos " + dev1.getConteudosInscrito());
        System.out.println(dev1.getNome() + ", Conteudos concluidos " + dev1.getConteudosConcluidos());

        dev1.progredirBootcamp();
        System.out.println("progredirBootcamp()");
        System.out.println(dev1.getNome() + ", Conteudos inscritos " + dev1.getConteudosInscrito());
        System.out.println(dev1.getNome() + ", Conteudos concluidos " + dev1.getConteudosConcluidos());

        System.out.println(dev1.getNome() + ", XP " + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);



    }

}
