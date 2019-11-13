package interfaces;

import java.util.stream.Stream;
import java.util.List;
import java.util.Comparator;
import java.util.function.Supplier;

public class Interfaz {

	/**
	 * Método que devuelve un Stream<String> con las cadenas ordenadas por su tamaño, del más largo al más corto
	 * @param l lista de Strings que va a ordenar
	 * @return un Stream con las cadenas ordenadas de mayor a menor longitud
	 */
	public Stream<String> ordenar(List<String> l) {
		return l.stream().sorted​(Comparator.reverseOrder());
	}


	/**
	 * Método que devuelve un Stream<String> infinito donde el primer elemento es "", el segundo es s, el tercero es s + s, el cuarto es s + s + s...
	 * @param s String que se va a repetir
 	 * @return un Stream infinito de la cadena
	 */
	public static Stream<String> f(String s) {
		return Stream.generate(new Supplier<String>() {
			int i = 0;
			public String get() {
				return s.repeat(i++);
			}
		});
	}
}