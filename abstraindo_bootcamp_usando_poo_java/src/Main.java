import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Back-End Java");
        curso1.setDescricao("Especialista Back-End Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Front-End JavaScript");
        curso2.setDescricao("Front-End JS");
        curso2.setCargaHoraria(8);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Especialista em Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}