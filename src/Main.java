import  java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
String [] candidatos = {"FELIPE","MÁRCIA","JULIA",
        "PAULO","AUGUSTO","MÔNICA","FABRÍCIO",
        "MIRELA","DANIELA","JORGE"};
String [] candidatosSelecionados = new String[5];
int totalCandidatos = 0, proximocandidato = 0;
while (totalCandidatos < 5 && proximocandidato <candidatos.length) {
    String candidato = candidatos[proximocandidato++];
    double salario = valorPretendido();
    double salarioBase = 2000.0;
   if(salarioBase < salario){
       System.out.printf("Candidato %s foi selecionado\n", candidato);
       candidatosSelecionados[totalCandidatos++] = candidato;
   }else {
       System.out.print("Candidato "+ candidato+ " reprovado \n");
   }
}
System.out.print("total de candidatos avaliados: "+ candidatos.length+" \n");
System.out.print("total de candidatos aprovados: "+ candidatosSelecionados.length +"\n" );
    for (String candidato: candidatosSelecionados){
        if(candidato != null){
            ligacao(candidato);
        }
    }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static  void ligacao(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativas++;
            }else{
                System.out.print("CONSEGUIMOS realizado\n");
            }
        }while (continuarTentando && tentativas < 3);
        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativas + " TENTATIVA");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativas + " REALIZADA");
        }
    }
}
