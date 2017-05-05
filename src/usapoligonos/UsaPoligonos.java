/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapoligonos;

import java.util.Scanner;

/**
 *
 * @author Guibson Krause
 */
public class UsaPoligonos
  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma Opção:");
        System.out.println(" --------------------------");
        System.out.println("| 1 - Quadrado             |");
        System.out.println("| 2 - Retangulo            |");
        System.out.println("| 3 - Trapezío             |");
        System.out.println(" --------------------------");

        int op = ler.nextInt();
        System.out.println("");        
        
        Quadrado qua1 = new Quadrado();
        Retangulo retan1 = new Retangulo();
        Trapezio trape1 = new Trapezio();

        do
          {
            switch (op)
              {
                case 1:
                    System.out.print("Insira o Tamanho do Lado: ");
                    qua1.setLado(ler.nextDouble());
                    System.out.println("");
                    qua1.area();
                    qua1.perimetro();
                    qua1.diagonal();
                    break;
                case 2:
                    System.out.print("Insira o Tamanho do Lado: ");
                    retan1.setLado(ler.nextDouble());
                    System.out.print("Insira o Tamanho da Altura: ");
                    retan1.setAltura(ler.nextDouble());
                    System.out.println("");
                    retan1.area();
                    retan1.perimetro();
                    retan1.diagonal();
                    break;
                case 3:
                    System.out.print("Insira o Tamanho do Primeiro Lado: ");
                    trape1.setPrimeiroLado(ler.nextDouble());
                    System.out.print("Insira o Tamanho do Segundo Lado: ");
                    trape1.setSegundoLado(ler.nextDouble());
                    System.out.print("Insira o Tamanho da Altura: ");
                    trape1.setAltura(ler.nextDouble());
                    System.out.print("Insira o Tamanho da Base Maior: ");
                    double aux1 = ler.nextDouble();
                    System.out.print("Insira o Tamanho da Base Menor: ");
                    double aux2 = ler.nextDouble();
                    
                    if (aux1 < aux2)
                      {
                        double aux3 = aux1;
                        aux1 = aux2;
                        aux2 = aux3;
                      }
                    
                    trape1.setBaseMai(aux1);
                    trape1.setBaseMe(aux2);
                    System.out.println("");
                    trape1.area();
                    trape1.perimetro();
                    trape1.diagonal();
                    break;
                default:
                    System.out.println("Sorry");
                    System.out.println("Opção Invalida");
                    System.out.println("Digite a Opção Novamente");
                    op = ler.nextInt();
                    break;
              }
          } while (op != 1 || op != 2 || op != 3);
      }

  }
