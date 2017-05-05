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
public class Trapezio implements Poligonos
  {
// Atributos      
    private double primeiroLado;
    private double segundoLado;
    private double baseMai;
    private double baseMe;
    private double altura;
    private double area;
    private double perimetro;
    private double diagonal;
    
// Gets & Sets

    public double getPrimeiroLado()
      {
        return primeiroLado;
      }

    public void setPrimeiroLado(double primeiroLado)
      {
        this.primeiroLado = primeiroLado;
      }

    public double getSegundoLado()
      {
        return segundoLado;
      }

    public void setSegundoLado(double segundoLado)
      {
        this.segundoLado = segundoLado;
      }

    public double getBaseMai()
      {
        return baseMai;
      }

    public void setBaseMai(double baseMai)
      {
        this.baseMai = baseMai;
      }

    public double getBaseMe()
      {
        return baseMe;
      }

    public void setBaseMe(double baseMe)
      {
        this.baseMe = baseMe;
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
        area = ((baseMai + baseMe)* altura)/2;
        System.out.println("A area é de: " + area);
      }

    @Override
    public void perimetro()
      {
        perimetro = primeiroLado + segundoLado + baseMai + baseMe;
        System.out.println("O perimetro é de: " + perimetro);
      }

    @Override
    public void diagonal()
      {
        diagonal = Math.sqrt((Math.pow(altura, 2)
                + (Math.pow(baseMai, 2)/4)+
                + (baseMai * baseMe)/2)
                +(Math.pow(baseMe, 2)/4));
        System.out.printf("A diagonal é de: %.2f \n", diagonal);
      }
    
  }
