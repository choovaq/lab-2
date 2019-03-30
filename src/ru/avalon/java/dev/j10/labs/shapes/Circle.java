package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse, Shape {
   private final float r;
   
   public Circle() {
        r = (float) (10 * Math.random());
                  
    }
   
    public float getLength() {
        return (float) (2 * Math.PI * r);//To change body of generated methods, choose Tools | Templates.
    }

    
    public float getArea() {
       return (float) (Math.PI * r * r);//To change body of generated methods, choose Tools | Templates.
    }

    
    public int getRotation() {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        return "Circle";
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
}