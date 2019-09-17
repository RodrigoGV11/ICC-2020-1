package geometria;

/**
 * Representa un polígono de tres lados.
 * Está definido por tres puntos en el plano cartesiano.
 */
public class Triangulo { 

	private Punto a;
	private Punto b;
	private Punto c;

    /**
     * Triángulo con todos sus lados de la misma longitud.
     */
	public static final int EQUILATERO = 0;
	/**
	 * Triángulo con todos sus lados de longitud distinta.
	 */
	public static final int ESCALENO = 2;
	/**
	 * Triángulo con exactamente dos lados de la misma longitud.
	 */
	public static final int ISOCELES = 1;

    /**
     * Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
     */
	public Triangulo() {
		a = new Punto(0, 0);
	    b = new Punto(1, 0);
		c = new Punto(0.5, Math.sin(Math.PI / 3));
	}

	/**
	 * Crea un triángulo con los tres puntos dados.
	 * @param a - primer punto
	 * @param b - segundo punto
	 * @param c - tercer punto
     */
	public Triangulo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Determina si los vértices de este triángulo están alineados.
	 * @return true si los vértices están alineados
	 */
	public boolean tieneVerticesAlineados() {
		return a.estanAlineados(b, c);
	}

	/**
	 * Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
	 * @return el tipo de este triángulo
	 */
	public int tipo() {
		if (a.distancia(b) == b.distancia(c) == c.distancia(a)) {
			return EQUILATERO;
		}
		if (a.distancia(b) == b.distancia(c) != c.distancia(a) || a.distancia(b) != b.distancia(c) == c.distancia(a) || a.distancia(b) == c.distancia(a) != b.distancia(c)) {
			return ISOCELES;
		}
		if (a.distancia(b) != b.distancia(c) != c.distancia(a)) {
			return ESCALENO;
		}
	}
}