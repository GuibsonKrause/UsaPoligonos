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
public class Quadrado implements Poligonos
  {
// Atributos    
    private double lado;
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
        this.area = this.lado * this.lado;
        System.out.println("Area: "+ this.area);
      }

    @Override
    public void perimetro()
      {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

    @Override
    public void diagonal()
      {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
    
  }
