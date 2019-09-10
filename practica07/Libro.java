/**
 * Clase que crea un libro con un titulo, un autor y un año de publicacion
 * @author Rodrigo Galeana Vidaurri
 * @version 10/09/2019
 */
public class Libro {

    private String titulo;
    private String autor;
    private String añoPublicacion;

    /**
     * Constructor default, crea un libro con valores arbitrarios
     */
    public Libro() {
      titulo = "";
      autor = "Desconocido";
      añoPublicacion = "0";
    }
    /**
     * Constructor de un libro a partir de los datos indicados
     * @param titulo titulo indicado
     * @param autor autor indicado
     * @param añoPublicacion año de publicaacion indicado
     */
    public Libro(String titulo, String autor, String añoPublicacion) {
      this.titulo = titulo;
      this.autor = autor;
      this.añoPublicacion = añoPublicacion;
    }
    /**
     * Metodo para asignarle un titulo al libro
     * @param titulo el nuevo titulo
     */
    public void asignarTitulo(String titulo) {
      this.titulo = titulo;
    }
    /**
     * Metodo para asignarle un autor al libro
     * @param autor el nuevo autor
     */
    public void asignarAutor(String autor) {
      this.autor = autor;
    }
    /**
     * Metodo para asignarle un año de publicacion al libro
     * @param añoPublicacion el nuevo año de publicacion
     */
    public void asignarAñoPublicacion(String añoPublicacion) {
      this.añoPublicacion = añoPublicacion;
    }
    /**
     * Metodo para obtener el titulo del libro
     * @return el titulo del libro
     */
    public String obtenerTitulo() {
      return titulo;
    }
    /**
     * Metodo para obtener el autor del libro
     * @return el autor del libro
     */
     public String obtenerAutor() {
       return autor;
     }
     /**
      * Metodo para obtener el año de publicacion del libro
      * @return el año de publicacion del libro
      */
      public String obtenerAñoPublicacion() {
        return añoPublicacion;
      }
    }
