public class MainJerarquico {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("Guitarra Acústica", "Madera", 150);
        guitarra.mostrarAtributos();
        guitarra.tocar();
        guitarra.afinar();
        guitarra.rasguear();
        
        Flauta flauta = new Flauta("Flauta Dulce", "Plástico", 50);
        flauta.mostrarAtributos();
        flauta.tocar();
        flauta.soplar();
        
        Bateria bateria = new Bateria("Batería Electrónica", "Metal", 300);
        bateria.mostrarAtributos();
        bateria.tocar();
        bateria.golpear();
        bateria.golpearDiferentePartes();
    }
}

class Instrumento {
    String nombre;
    String material;
    double precio;

    public Instrumento(String nombre, String material, double precio) {
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
    }

    void tocar() {
        System.out.println("El instrumento está siendo tocado");
    }

    void mostrarAtributos() {
        System.out.println(" ");
        System.out.println("----------HERENCIA JERARQUICA----------");
        System.out.println(" ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Material: " + material);
        System.out.println("Precio: " + precio);
        System.out.println(" ");
    }
}

class Cuerda extends Instrumento {
    public Cuerda(String nombre, String material, double precio) {
        super(nombre, material, precio);
    }

    void afinar() {
        System.out.println("El instrumento de cuerda está siendo afinado");
    }
}

class Viento extends Instrumento {
    public Viento(String nombre, String material, double precio) {
        super(nombre, material, precio);
    }

    void soplar() {
        System.out.println("El instrumento de viento está siendo soplado");
    }
}

class Percusion extends Instrumento {
    public Percusion(String nombre, String material, double precio) {
        super(nombre, material, precio);
    }

    void golpear() {
        System.out.println("El instrumento de percusión está siendo golpeado");
    }
}

class Guitarra extends Cuerda {
    public Guitarra(String nombre, String material, double precio) {
        super(nombre, material, precio);
    }

    void rasguear() {
        System.out.println("La guitarra está siendo rasgueada");
    }
}

class Flauta extends Viento {
    public Flauta(String nombre, String material, double precio) {
        super(nombre, material, precio);
    }

    @Override
    void soplar() {
        System.out.println("La flauta está siendo soplada");
    }
}

class Bateria extends Percusion {
    public Bateria(String nombre, String material, double precio) {
        super(nombre, material, precio);
    }

    void golpearDiferentePartes() {
        System.out.println("La batería está siendo golpeada en diferentes partes");
    }
}
