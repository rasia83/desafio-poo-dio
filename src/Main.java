import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Conteudo curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("POO com Java");
        ((Curso)curso1).setCargaHoraria(4);

        Conteudo mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria POO com Java");
        ((Mentoria)mentoria1).setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);

    }

}
