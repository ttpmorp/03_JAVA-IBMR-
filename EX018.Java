package Entrada_e_Saída;
    
import java.util.Scanner;

public class EX018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download em MB: ");
        double tamanhoArquivo = sc.nextDouble();

        System.out.print("Digite a velocidade do link de Internet em Mbps: ");
        double velocidadeInternet = sc.nextDouble();

        double tempoDownloadSegundos = (tamanhoArquivo * 8) / velocidadeInternet;
        double tempoDownloadMinutos = tempoDownloadSegundos / 60;

        System.out.printf("O tempo aproximado de download do arquivo é de %.2f minutos.", tempoDownloadMinutos);

        sc.close();
    }
}
