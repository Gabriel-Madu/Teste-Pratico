import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaDeNotas sistema = new SistemaDeNotas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados dos alunos no formato: <Nome> <Nota1> <Nota2> <Nota3> <Nota4> <Nota5> <Frequência>");

        while (true) {
            String linha = scanner.nextLine();
            if (linha.isEmpty()) break;

            String[] partes = linha.split(" ");
            String nome = partes[0];
            List<Float> notas = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                notas.add(Float.parseFloat(partes[i]));
            }
            float frequencia = Float.parseFloat(partes[6].replace("%", ""));

            sistema.addAlunos(nome, notas, frequencia);
        }

        sistema.checarInformacoes();
        scanner.close();
    }
}
