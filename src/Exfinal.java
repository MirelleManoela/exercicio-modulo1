import java.util.Scanner;

public class Exfinal {
    public static void main(String[] args) {


        Scanner digitar = new Scanner(System.in);


        double valor = 10;
        double desc1 = (valor * 70) / 100;


        System.out.println("Qual o produto escolhido?");
        String nome = digitar.nextLine();
        System.out.println(nome + " custa R$10,00.");
        System.out.println("Qual a quantidade?");
        int quantidade = digitar.nextInt();
        System.out.println("Valor sem descontos: " + (valor * quantidade));
        double finaldec1 = (desc1 * quantidade);
        double semdesc = quantidade * valor;


        if (quantidade > 5) {
            System.out.println("Total com desconto para compras acima 5: " + finaldec1);
        } else {
            System.out.println("Valor total: " + semdesc);

        }

        System.out.println("Escolha a forma de pagamento: ( 1 - dinheiro/ 2 - cartão)");
        int forma = digitar.nextInt();

        switch (forma) {
            case 1:
                if (quantidade > 5) {
                    System.out.println("Valor com desconto de 60%: " + (finaldec1 * 40) / 100);
                } else {
                    System.out.println("Valor com desconto de 60%: " + (semdesc * 40 / 100));
                }
                break;

            case 2:
                if (quantidade > 5) {
                    System.out.println("Valor com desconto de 50%: " + (finaldec1 * 50) / 100);
                } else {
                    System.out.println("Valor com desconto de 50%: " + (semdesc * 50) / 100);
                }


        }


    }
}










