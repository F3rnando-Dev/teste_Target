import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        /*Questão 1
         *
         */

        int INDICE = 13,
                SOMA =0,
                K=0;

        for(INDICE = 13; K < INDICE; K++){
            SOMA = SOMA + K;

        }
        System.out.println(SOMA);

        System.out.println();
        /* Questão 2
         *
         */

        Scanner teclado = new Scanner(System.in);

        int valorAtual = 1;
        int valorAnterior = 0;

        System.out.println("Digite o valor para conferir a sequencia de Fibonacci: ");
        int valorParaConferir = teclado.nextInt();

        for(int i = 0; valorAtual < valorParaConferir; i++){
            valorAtual = valorAtual + valorAnterior;
            valorAnterior = valorAtual - valorAnterior;
            System.out.println(valorAtual);

            if(valorAtual == valorParaConferir){
                System.out.println("Numero encontrado na sequencia de Fibonacci!");
            }
        }
        teclado.close();

        /* Questão 3
         *
         */

        // a) 9
        // b) 128
        // c) 64
        // d) 100
        // e) 13
        // f) 200

        /* Questão 4
          O carro e o caminhão estão à mesma distância de Ribeirão Preto ao eles se cruzarem, eles se encontram a 60,9 km de Ribeirão Preto.
          Como se determinar o local de cruzamento?
          Para determinar o local em que o carro e o caminhão se cruzam podemos colocar o ponto de referência em Ribeirão Preto, então, a equação horária do carro é:
          x1 = v1.t

          Como o caminhão sai de um local 100 km distante do ponto de referência e se aproxima dele, sua equação horária é:
          x2 = 100km - v2.t

          Como o caminhão tem 2 pedágios como obstáculo e perde 5 minutos em cada um deles, podemos calcular o tempo de viagem sem os obstáculos:
          tso = (100km/(80km/h)) = 1,25h

          Porém, como perde 10 minutos (ou 0,17 horas) nos pedágios, o tempo de viagem para o caminhão será de 1,25h+0,17h=1,42h. Sua velocidade média é:
          v2 = 100km/1,42h = 70,6km/h

          Nas equações horárias podemos limpar o tempo e igualar ambas para achar o ponto em que o carro e o caminhão se cruzam:
          t = x1/v1
          t = (x2 - 100km)/ -v2
          x1 = x2 == (x/v1) = (x-100km)/-v2
          -v2.x = (v1.x) - (v1.100km)
          x = (v1.100km)/ (v1+v2) = (110km/h . 100km)/ (110km/h) + (70.6km/h)
          x = 60,9km

          Essa é a distância da cidade de Ribeirão Preto em que o carro e o caminhão se cruzam, ambos estão à mesma distância.
         */


        /*
         *Questão 5
         */

        String frase = "Target Sistemas";
        System.out.println(frase);
        char []let = frase.toCharArray();
        int inicio = 0;
        int fim = let.length-1;
        char temp;
        while(fim>inicio){
            temp = let[inicio];
            let[inicio] = let[fim];
            let[fim] = temp;
            fim--;
            inicio++;
        }
        frase = new String(let);
        System.out.println(frase);

    }

}
