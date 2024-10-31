import java.util.List;

public class Aluno {
    private String nome;
    private List<Float> notas;
    private float frequencia;

    public Aluno(String nome, List<Float> notas, float frequencia) {
        this.nome = nome;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    public float calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public boolean frequenciaAbaixo75() {
        return this.frequencia < 75;
    }

    public String getNome() {
        return nome;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public float getFrequencia() {
        return frequencia;
    }
}
