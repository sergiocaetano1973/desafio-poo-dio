import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("descricao curso java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("curso js");
       curso2.setDescricao("descricao curso js");
       curso2.setCargaHoraria(8);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de java");
       mentoria.setDescricao("descricao mentoria de java");
       mentoria.setData(LocalDate.now());


       /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/

       Bootcamp bootcamp =new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descicao Bootcamp Java Developer");
       bootcamp.getConteudosInscritos().add(curso1);
       bootcamp.getConteudosInscritos().add(curso2);
       bootcamp.getConteudosInscritos().add(mentoria);

       Dev devSergio = new Dev();
       devSergio.setNome("Sergio");
       devSergio.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscrios Sergio" + devSergio.getConteudosInscritos());
       devSergio.progredir();
       devSergio.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscrios Sergio" + devSergio.getConteudosInscritos());
       System.out.println("Conteudos Concluidos Sergio" + devSergio.getConteudosConcluidos());
       System.out.println("XP" + devSergio.calcularTotalXp());

       System.out.println("--------------------------");


       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscrios Camila" + devCamila.getConteudosInscritos());
       devCamila.progredir();
       devCamila.progredir();
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscrios Camila" + devCamila.getConteudosInscritos());
       System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
       System.out.println("XP" + devCamila.calcularTotalXp());


    }
}
