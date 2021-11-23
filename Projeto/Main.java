package Projeto;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setNome("Retângulo");
        retangulo.setBase(10);
        retangulo.setAltura(5);
        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triangulo");
        triangulo.setAltura(4);
        triangulo.setBase(3);
        Circulo circulo = new Circulo();
        circulo.setNome("Circulo");
        circulo.setRaio(4);

    List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;
    listaFigurasGeometricas.add(retangulo);   
    listaFigurasGeometricas.add(triangulo);
    listaFigurasGeometricas.add(circulo);
        
     // Mostra dados das figuras geometricas
     for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
        System.out.println( figuraGeometrica.getDescricao() );
        System.out.printf( "Area da figura: %.2f  ", figuraGeometrica.getArea() );
    }
    }
  }



    
    






