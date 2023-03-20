import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String args[]) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("POO com java");
        curso1.setCargaHoraria(4);
        System.out.println(curso1);

        Mentoria m = new Mentoria();
    }

}
