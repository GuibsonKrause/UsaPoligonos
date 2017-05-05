/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usapoligonos;

/**
 *
 * @author Guibson Krause
 */
public class Retangulo implements Poligonos
  {
// Atributos  
    private double lado;
    private double altura;
    private double area;
    private double perimetro;
    private double diagonal;
    

// Gets & Sets

    public double getLado()
      {
        return lado;
      }

    public void setLado(double lado)
      {
        this.lado = lado;
      }

    public double getAltura()
      {
        return altura;
      }

    public void setAltura(double altura)
      {
        this.altura = altura;
      }

    public double getArea()
      {
        return area;
      }

    public void setArea(double area)
      {
        this.area = area;
      }

    public double getPerimetro()
      {
        return perimetro;
      }

    public void setPerimetro(double perimetro)
      {
        this.perimetro = perimetro;
      }

    public double getDiagonal()
      {
        return diagonal;
      }

    public void setDiagonal(double diagonal)
      {
        this.diagonal = diagonal;
      }
    
    
// Metodos da Interface
    @Override
    public void area()
      {
        area = lado * altura;
        System.out.println("A area é de: " + area);
      }

    @Override
    public void perimetro()
      {
        perimetro = lado + lado + altura + altura;
        System.out.println("O perimetro é de: " + perimetro);
      }

    @Override
    public void diagonal()
      {
        diagonal = Math.pow(lado, 2) + Math.pow(altura, 2);
        diagonal = Math.sqrt(diagonal);
        System.out.printf("A diagonal é de: %.2f \n", diagonal);
      }
    
  }
