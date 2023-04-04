import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do arquivo em Megas: ");
        double tamanho = entrada.nextDouble();
        
        System.out.print("Digite a velocidade do link de Internet em Mbps: ");
        double velocidade = entrada.nextDouble();
        
        double velocidadeBytes = velocidade / 8.0;
        
        double tempoSegundos = tamanho / velocidadeBytes;
        
        double tempoMinutos = tempoSegundos / 60.0;
        
        System.out.printf("Tempo aproximado de download: %.2f minutos\n", tempoMinutos);
        entrada.close();
    }
}