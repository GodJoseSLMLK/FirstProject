public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor vacío
    public Libro() {
        this.disponible = true;
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Constructor completo
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
        System.out.println("-------------------------");
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro ha sido devuelto.");
    }
}

}
