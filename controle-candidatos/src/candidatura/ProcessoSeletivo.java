package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900.00);
        analisarCandidato(2200.00);
        analisarCandidato(2000.00);
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
