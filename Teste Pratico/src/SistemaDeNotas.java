import java.util.List;
import java.util.ArrayList;

public class SistemaDeNotas {
    private List<Aluno> alunos = new ArrayList<>();

    public void addAlunos(String nome, List<Float> notas, float frequencia) {
        alunos.add(new Aluno(nome, notas, frequencia));
    }

    public void checarInformacoes() {
        int quantDisciplinas = 5;
        float[] mediaDisciplina = new float[quantDisciplinas];

        for (int i = 0; i < quantDisciplinas; i++) {
            float soma = 0;
            for (Aluno aluno : alunos) {
                soma += aluno.getNotas().get(i);
            }
            mediaDisciplina[i] = soma / alunos.size();
        }

        List<Aluno> acimaMediaTurma = new ArrayList<>();
        List<Aluno> frequenciaBaixa = new ArrayList<>();

        float mediaGeralTurma = 0;
        for (float media : mediaDisciplina) {
            mediaGeralTurma += media;
        }
        mediaGeralTurma /= quantDisciplinas;

        for (Aluno aluno : alunos) {
            float mediaAluno = aluno.calcularMedia();

            if (mediaAluno > mediaGeralTurma) {
                acimaMediaTurma.add(aluno);
            }

            if (aluno.frequenciaAbaixo75()) {
                frequenciaBaixa.add(aluno);
            }

            System.out.println(aluno.getNome() + " " + mediaAluno + " " + aluno.getFrequencia());
        }

        System.out.println("Média da turma em cada disciplina:");
        for (float media : mediaDisciplina) {
            System.out.print("%.2f ", media);
        }
        System.out.println();

        System.out.println("Alunos com média acima da média da turma:");
        if (acimaMediaTurma.isEmpty()) {
            System.out.println();
        } else {
            for (Aluno aluno : acimaMediaTurma) {
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("Alunos com frequência abaixo de 75%:");
        if (frequenciaBaixa.isEmpty()) {
            System.out.println();
        } else {
            for (Aluno aluno : frequenciaBaixa) {
                System.out.println(aluno.getNome());
            }
        }
    }
}
