package meu.primeiro.projeto;

import java.util.Scanner;

public class Droids {
    public static void main(String[]args) {
        int droids, pecas, dias, pecasNecessariasParaConstruirODobroDeDroids;
        Scanner entrada = new Scanner (System.in);
        
        final int PECAS_PARA_DROID = 39; // Peças fixas necessárias para construir um droid.
        dias = 0;
            System.out.println("Informe a quantidade de droids");
        droids = entrada.nextInt();
            System.out.println("Informe a quantidade de pecas");
        pecas = entrada.nextInt();

        // Verifica se as peças informadas são compatíveis para a criação de novos droids.  
        while (pecas >= PECAS_PARA_DROID && pecas >= 0 && droids >= 1){
            pecasNecessariasParaConstruirODobroDeDroids = droids * PECAS_PARA_DROID;
            if (pecas >= pecasNecessariasParaConstruirODobroDeDroids){
                pecas = pecas - pecasNecessariasParaConstruirODobroDeDroids;
                droids = droids * 2;
            } else {
                droids = pecas / PECAS_PARA_DROID + droids;
                pecas = pecas % PECAS_PARA_DROID;
            }
            dias++;
        }

        // Verifica se o número de peças e droids é positivo.
        if (pecas < 0 || droids < 0){
            System.out.println("Numero invalido de pecas e/ou droids.");
        } else {
            System.out.println("Sobraram " + pecas + " pecas.");
        }
        if (dias > 0){
            System.out.println("A quantidade final de droids construidos foi de " + droids + ".");
            System.out.println("A quantidade de dias necessarios para construir os droids foi de " + dias + ".");
        } else { // Se não foi possível construir nenhum droid, não foi contabilizado nenhum dia.
            System.out.println("Nao foi possivel construir nenhum droid.");
        } 
    } 
}