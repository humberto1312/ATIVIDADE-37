import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCliente;
        double alturaCliente, pesoCliente;
        int maisAltoCodigo = 0, maisBaixoCodigo = 0;
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
        int maisGordoCodigo = 0, maisMagroCodigo = 0;
        double pesoMaisGordo = Double.MIN_VALUE, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int quantidadeClientes = 0;

        System.out.println("Digite os dados dos clientes da academia (digite 0 no código para encerrar):");

        do {
            System.out.print("Código do cliente: ");
            codigoCliente = scanner.nextInt();

            if (codigoCliente != 0) {
                System.out.print("Altura (m): ");
                alturaCliente = scanner.nextDouble();

                System.out.print("Peso (kg): ");
                pesoCliente = scanner.nextDouble();

                somaAlturas += alturaCliente;
                somaPesos += pesoCliente;
                quantidadeClientes++;

                if (alturaCliente > alturaMaisAlto) {
                    alturaMaisAlto = alturaCliente;
                    maisAltoCodigo = codigoCliente;
                }

                if (alturaCliente < alturaMaisBaixo) {
                    alturaMaisBaixo = alturaCliente;
                    maisBaixoCodigo = codigoCliente;
                }

                if (pesoCliente > pesoMaisGordo) {
                    pesoMaisGordo = pesoCliente;
                    maisGordoCodigo = codigoCliente;
                }

                if (pesoCliente < pesoMaisMagro) {
                    pesoMaisMagro = pesoCliente;
                    maisMagroCodigo = codigoCliente;
                }
            }
        } while (codigoCliente != 0);

        scanner.close();

        if (quantidadeClientes > 0) {
            double mediaAlturas = somaAlturas / quantidadeClientes;
            double mediaPesos = somaPesos / quantidadeClientes;

            System.out.println("\nCliente mais alto:");
            System.out.println("Código: " + maisAltoCodigo + ", Altura: " + alturaMaisAlto + " m");

            System.out.println("\nCliente mais baixo:");
            System.out.println("Código: " + maisBaixoCodigo + ", Altura: " + alturaMaisBaixo + " m");

            System.out.println("\nCliente mais gordo:");
            System.out.println("Código: " + maisGordoCodigo + ", Peso: " + pesoMaisGordo + " kg");

            System.out.println("\nCliente mais magro:");
            System.out.println("Código: " + maisMagroCodigo + ", Peso: " + pesoMaisMagro + " kg");

            System.out.println("\nMédia das alturas dos clientes: " + mediaAlturas + " m");
            System.out.println("Média dos pesos dos clientes: " + mediaPesos + " kg");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }
    }
}
