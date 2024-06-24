package org.example1;

public class Main {
    public static void main(String[] args) {
        /*Este patrón de diseño contiene una estructura similar al patrón de diseño factory method. Pero contienen
        * propositos diferentes, ya que uno se enfoca en crear clases y el otro es una estructura para cuando hayan
        * 2 abstracciones que una dependa de la otra. En esta caso se ve que tengo mi abstracción Animal y mi abstracción
        * Comida. Y a animal se le inyecta la comida, es decir, animal depende de la comida. Para evitar que 2 clases
        * dependan directamente y que el codigo sea flexible hay que depender de abstracciones (principio SOLID #5).
        * Por eso yo puedo crear mi Clase Leon y que dependa directamente de la comida Carne, pero no es escalable, ni flexible. Pero al manejarlo
        * con abstracciones mis clases son flexibles como en el siguiente ejemplo:*/

        Meal meat = new Meat();
        Meal grass = new Grass();

        Animal leon = new Leon(meat);
        Animal cow = new Cow(grass);

        leon.eat();
        cow.eat();

        /*Ahora puedo hacer combinaciones como la siguiente*/
        Animal carnivorousCow = new Cow(meat);
        carnivorousCow.eat();

    }
}