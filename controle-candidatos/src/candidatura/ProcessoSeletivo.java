package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = 
            {"João", "Maria", "José", "Ana", "Pedro", "Paulo", "Lucas", "Marcos", "Mateus", "Tiago", "Julia", "Patricia", "Carla" }; 
        System.out.println("Processo Seletivo");
        String [] candidatosSelecionados = selecionarCandidatos(candidatos);
        for (String candidato : candidatosSelecionados) {
            if (candidato != null){
                entrarEmContato(candidato);
            }
        }
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        do {
            atendeu = atender();
            if (!atendeu) {
                tentativasRealizadas++;
            } 

        } while (!atendeu && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("O candidato " + candidato + " atendeu o telefone na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("O candidato " + candidato + " não atendeu o telefone, numero máximo de tentativas esgotadas");
        }

    }

    static String[] selecionarCandidatos(String[] candidatos) {
        String[] candidatosSelecionados = new String[5];
        double salarioBase = 2000.00;
        int selecionados = 0;
        for ( int i = 0; i < candidatos.length; i++){
            double salarioPretendido = valorPretendido();
            if (salarioBase >= salarioPretendido && selecionados < 5) {
                candidatosSelecionados[selecionados]=candidatos[i];
                selecionados++;
            } 
        }
        return candidatosSelecionados;
    }


    // Métodos randômicos para simulação

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

}
