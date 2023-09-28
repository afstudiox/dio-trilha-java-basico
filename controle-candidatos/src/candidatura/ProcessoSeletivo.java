package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"João", "Maria", "José", "Ana", "Pedro"};
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } 

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("O candidato " + candidato + " atendeu o telefone na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("O candidato " + candidato + " não atendeu o telefone, numero máximo de tentativas esgotadas");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }


    static void imprimirSelecioandos() {
        String [] candidatos = 
            {"João", "Maria", "José", "Ana", "Pedro"}; 
        System.out.println("Imprimindo a lista de candadidatos");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("Número do candidato: " + indice + 1 + " Candidato: " + candidatos[indice]);
        }
    }

    static void selecionarCandidatos() {
        String [] candidatos = 
            {"João", "Maria", "José", "Ana", "Pedro", "Paulo", "Lucas", "Marcos", "Mateus", "Tiago", "Julia", "Patricia", "Carla" }; 
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while ( candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solictou este valor salarial -> " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            } 
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static void analisarCandidato(double SalarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > SalarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == SalarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
