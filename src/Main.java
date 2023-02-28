import br.com.dio.desafio.dominio.Curso;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrecao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("descrecao curso java");
        curso2.setCargaHoraria(8);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}