import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        /*
        int primeiro, segundo, resultado ;


        System.out.println("Exercicio 1 \n");
        System.out.println("Exercicio a  \n");
        primeiro = leia.nextInt();
        segundo = leia.nextInt();;
        resultado = primeiro + segundo;
        System.out.println(resultado);

        System.out.println("Exercicio b \n");

        primeiro = leia.nextInt();
        segundo = leia.nextInt();
        resultado = primeiro + segundo;
        System.out.println(resultado);

        System.out.println("Exercicio c \n");

        primeiro = leia.nextInt();
        segundo = leia.nextInt();
        resultado = primeiro + segundo;
        System.out.println(resultado);


        System.out.println("Exercicio 02\n");
        double raio, pi, valoRaio;

        raio = leia.nextDouble();
        pi = 3.14159;
        valoRaio = pi * (raio * raio);
        System.out.printf("%.4f %n", valoRaio); // Saída formatada com 4 casas decimais

    }


        System.out.println("Exercicio 3");

        int a, b, c, d, diferen;
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();
        diferen = (a * b) - (c * d);

        System.out.println("Diferença = "+ diferen);



       System.out.println("Exercicio 4");

        int numFun, horasTrab;
        double valorHora, salaBruto;

        numFun = leia.nextInt();
        horasTrab = leia.nextInt();
        valorHora = leia.nextDouble();

        salaBruto = horasTrab * valorHora;

        System.out.println("Number= " + numFun);
        System.out.printf("Salary = U$ %.2f %n", salaBruto);





        System.out.println("Exercicio  5");
        int numPc1, numPc2, qntPc1, qntPc2 ;
        double valorPc1, valorPc2, total;

        numPc1 = leia.nextInt();
        qntPc1 = leia.nextInt();
        valorPc1 = leia.nextDouble();

        numPc2 = leia.nextInt();;
        qntPc2 = leia.nextInt();
        valorPc2 = leia.nextDouble();

        total = (qntPc1 * valorPc1) + (qntPc2 * valorPc2);
        System.out.printf("Valor a pagar : R$ %.2f %n ", total);
    */
        System.out.println("Exercicio 6 ");

        double ent1, ent2, ent3;
        int op;



        do {
            System.out.println("------------------");
            System.out.println("Selecione uma opção");
            System.out.println("1 - Calcular area do triangulo");
            System.out.println("2 - Calcular area do círculo");
            System.out.println("3 - Calcular area do trapézio");
            System.out.println("4 - Calcular area do quadrado");
            System.out.println("5 - Calcular area do retangulo");
            System.out.println("0 - Para sair ");
            op = leia.nextInt();

            switch (op){
                case 1:

                    System.out.println("O valor da area do Triangulo é " + formataTresCasas(calculaTriangulo()) );
                    break;

                case 2 :
                    System.out.println(" O valor da area do circulo é : " + formataTresCasas(calculaRaio()) );
                    break;

                case 3:
                    System.out.println("O valor da area do Trapézio é" + formataTresCasas(calculaAreaTrapezio()));
                    break;


                case 4:
                    System.out.println("A  area do quadrado é " + formataTresCasas(calculaAreaQuadradoB()));
                    break;
                case 5:
                    System.out.println("A area do retangulo é " + formataTresCasas(calculaAreaRetanguloAB()));
                    break;
                case 0:
                    System.out.println("Até Mais ! ");
                    break;
                default:
                    System.out.println("Valor incorreto !");

            }
        } while (op != 0);


    }

    public static double calculaTriangulo (){
    Scanner leia = new Scanner(System.in);
        double a, c, areaTriangulo;
        System.out.println("Digite o valor de a");
        a = leia.nextDouble();

        System.out.println("Digite o valor de c");
        c = leia.nextDouble();

        areaTriangulo = (a * c) / 2 ;

        return areaTriangulo;
    }

    public static double calculaRaio() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        double raio = leia.nextDouble();

        return raio;

    }

    public static double calculaAreaTrapezio() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da base A");
        double baseA = leia.nextDouble();

        System.out.println("Digite o valor da base B");
        double baseB = leia.nextDouble();

        System.out.println("Digite o valor da altura ");
        double altura = leia.nextDouble();

        double area = ((baseA + baseB) / 2) *  altura;

        return area;
    }

    public static double calculaAreaQuadradoB() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do lado B do quadrado");
        double ladoBe = leia.nextDouble();

        double areaLadoB = ladoBe * ladoBe ;

        return areaLadoB;

    }

    public static double calculaAreaRetanguloAB() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        double a = leia.nextDouble();

        System.out.println("Digite o valor de B");
        double b = leia.nextDouble();

        double areaRetangulo = a * b ;

        return areaRetangulo;
    }

    public static String formataTresCasas( double valor) {
        DecimalFormat formatar = new DecimalFormat("#.000");
        return  formatar.format(valor);
    }





}
