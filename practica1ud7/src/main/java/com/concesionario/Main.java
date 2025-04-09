// Aplicacion de concesionario de coches en el que se venden, alquilan y se dande alta en el stock los coches.
// Se crea una clase abstracta Coche que tiene los atributos comunes a todos los coches.
// Se crean las clases CocheKm0, CocheSegundaMano y Nuevo que heredan de Coche y que implementan los metodos de la interfaz Vendible y Alquilable.
// Se crea un metodo main que crea varios coches, muestra el stock de coches y se venden, alquilan y se actualiza el stock de los coches.

package com.concesionario;

public class Main {

    // Metodo main que crea varios coches y muestra el stock de coches y se venden, alquilan y se actualiza el stock de los coches.
    public static void main(String[] args) {

        // Se crea un coche de km0 y se muestra el stock de coches.
        CocheKm0 coche1 = new CocheKm0("2345MXL", "ROJO", "TOYOTA YARIS", 20000.0, 7000);
        System.out.println(coche1.toString() + ", se ha inventariado");
        System.out.println("Stock de coches: " + coche1.getNumCochesStock());
        System.out.println("--------------------------------");

        // Se crea un coche de km0 y se muestra el stock de coches.
        CocheKm0 coche2 = new CocheKm0("4512MFG", "NEGRO", "TOYOTA COROLLA", 15000.0, 10000);
        System.out.println(coche2.toString() + ", se ha inventariado");
        System.out.println("Stock de coches: " + coche2.getNumCochesStock());
        System.out.println("--------------------------------");

        // Se crea un coche de segunda mano y se muestra el stock de coches.
        CocheSegundaMano coche3 = new CocheSegundaMano("2200GHS", "GRIS", "RENAULT CLIO", 9000.0, 10000, "Juan Perez Gonzalez");
        System.out.println(coche3.toString() + ", se ha inventariado");
        System.out.println("Stock de coches: " + coche3.getNumCochesStock());
        System.out.println("--------------------------------");

        // Se crea un coche de segunda mano y se muestra el stock de coches.
        CocheSegundaMano coche4 = new CocheSegundaMano("7493FFF", "BLANCO", "SEAT LEON", 5000.0, 180000, "Luis García López");
        System.out.println(coche4.toString() + ", se ha inventariado");
        System.out.println("Stock de coches: " + coche4.getNumCochesStock());
        System.out.println("--------------------------------");

        // Se crea un coche nuevo y se muestra el stock de coches.
        Nuevo coche5 = new Nuevo("3369MZS", "BLANCO", "FIAT 500", 19000.0, 10, 5);
        System.out.println(coche5.toString() + ", se ha inventariado");
        System.out.println("Stock de coches: " + coche5.getNumCochesStock());
        System.out.println("--------------------------------");

        // Se crea un coche nuevo y se muestra el stock de coches.
        Nuevo coche6 = new Nuevo("1022MZR", "VERDE", "OPEL CORSA", 22000.0, 15, 5);
        System.out.println(coche6.toString() + ", se ha inventariado");
        System.out.println("Stock de coches: " + coche6.getNumCochesStock());
        System.out.println("--------------------------------");

        // Se vende un coche de km0 y se actualiza el stock de coches.
        coche1.vender();

        // Se alquila un coche de km0 y se actualiza el stock de coches.
        coche2.alquilar();

        // Se vende un coche de segunda mano y se actualiza el stock de coches.
        coche3.vender();

        // Se vende un coche de segunda mano y se actualiza el stock de coches.
        coche4.vender();

        // Se vende un coche nuevo y se actualiza el stock de coches.
        coche5.vender();

        // Se vende un coche nuevo y se actualiza el stock de coches.
        coche6.vender();
    }
    

    // Clase abstracta Coche que tiene los atributos comunes a todos los tipos coches.
    static abstract class Coche {

        private String matricula;
        private String color;
        private String modelo;
        private Double precio;
        private int kilometros;
        public static int numCochesStock = 0;

        // Constructor de la clase Coche.
        public Coche(String matricula, String color, String modelo, Double precio, int kilometros) {
            this.matricula = matricula;
            this.color = color;
            this.modelo = modelo;
            this.precio = precio;
            this.kilometros = kilometros;
            numCochesStock ++;
        }

        // Getters y setters de la clase Coche.
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public Double getPrecio() {
            return precio;
        }

        public void setPrecio(Double precio) {
            this.precio = precio;
        }

        public int getKilometros() {
            return kilometros;
        }

        public void setKilometros(int kilometros) {
            this.kilometros = kilometros;
        }

        public int getNumCochesStock() {
            return numCochesStock;
        }

        public void setNumCochesStock(int numCochesStock) {
            this.numCochesStock = numCochesStock;
        }

        // Metodo toString de la clase Coche.
        @Override
        public String toString() {
            return " Matricula: " + matricula + ", Color: " + color + ", Modelo: " + modelo + ", Precio: " + precio + ", Kilometros: " + kilometros;
        }
 

    }

    // Interfaz Vendible que tiene el metodo vender.
    public interface Vendible {
        public void vender();
    }

    // Interfaz Alquilable que tiene el metodo alquilar.
    public interface Alquilable {
        public void alquilar();
    }

    // Clase CocheKm0 que hereda de Coche y que implementa las interfaces Vendible y Alquilable.
    static class CocheKm0 extends Coche implements Vendible, Alquilable {

        // Constructor de la clase CocheKm0 que también llama al constructor de la clase padre Coche.
        public CocheKm0(String matricula, String color, String modelo, Double precio, int kilometros) {
            super(matricula, color, modelo, precio, kilometros);
        }

        // Metodo vender de la clase CocheKm0 que implementa el metodo vender de la interfaz Vendible.
        public void vender(){
            System.out.println("El coche " + this.toString() + ", se ha vendido");
            numCochesStock --;
            System.out.println("Stock de coches: " + numCochesStock);
            System.out.println("--------------------------------");
        }

        // Metodo alquilar de la clase CocheKm0 que implementa el metodo alquilar de la interfaz Alquilable.
        public void alquilar(){
            System.out.println("El coche " + this.toString() + ", se ha alquilado");
            System.out.println("--------------------------------");
        }

        // Metodo toString de la clase CocheKm0 que sobreescribe parcialmente el metodo toString de la clase padre Coche.            
        @Override
        public String toString() {
            return "Coche de Km0 -> " + super.toString();
        }

    
    }

    // Clase CocheSegundaMano que hereda de Coche y que implementa la interfaz Vendible.
    static class CocheSegundaMano extends Coche implements Vendible{
        private String antiguoPropietario;

        // Constructor de la clase CocheSegundaMano.
        public CocheSegundaMano(String matricula, String color, String modelo, Double precio, int kilometros, String antiguoPropietario) {
            super(matricula, color, modelo, precio, kilometros);
            this.antiguoPropietario = antiguoPropietario;
        }

        // Getters y setters de la clase CocheSegundaMano.
        public String getAntiguoPropietario() {
            return antiguoPropietario;
        }

        public void setAntiguoPropietario(String antiguoPropietario) {
            this.antiguoPropietario = antiguoPropietario;
        }

        //Metodo vender de la clase CocheSegundaMano que implementa el metodo vender de la interfaz Vendible.
        public void vender(){
            System.out.println("El coche " + this.toString() + ", se ha vendido");
            numCochesStock --;
            System.out.println("Stock de coches: " + numCochesStock);
            System.out.println("--------------------------------");
        }

        // Metodo toString de la clase CocheSegundaMano que sobreescribe parcialmente el metodo toString de la clase padre Coche.
        @Override
        public String toString() {
            return "Coche de SegundaMano -> " + super.toString() + ", Antiguo Propietario: " + antiguoPropietario;
        }

    }

    // Clase Nuevo que hereda de Coche y que implementa la interfaz Vendible.
    static class Nuevo extends Coche implements Vendible{
        private int garantia;

        // Constructor de la clase Nuevo.
        public Nuevo(String matricula, String color, String modelo, Double precio, int kilometros, int garantia) {
            super(matricula, color, modelo, precio, kilometros);
            this.garantia = garantia;
        }

        // Getters y setters de la clase Nuevo.
        public int getGarantia() {
            return garantia;
        }


        public void setGarantia(int garantia) {
            this.garantia = garantia;
        }

        // Metodo vender de la clase Nuevo que implementa el metodo vender de la interfaz Vendible.
        public void vender(){
            System.out.println("El coche " + this.toString() + ", se ha vendido");
            numCochesStock --;
            System.out.println("Stock de coches: " + numCochesStock);
            System.out.println("--------------------------------");
        }

        // Metodo toString de la clase Nuevo.
        @Override
        public String toString() {
            return "Coche Nuevo -> " + super.toString() + ", Años de Garantia: " + garantia;
        }

    }

}