package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;
import ajedrez.Tablero;

public class Dama extends Pieza {

	Tablero tab = Tablero.obtenerInstancia();

	public Dama(Color color, Posicion posicion) {
		super(color, posicion);
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
			columna = obtenerPosicion().obtenerColumna();
		if (color == Color.BLANCO) {
			for (int i = fila - 1; i >= 0; i--) {
				Pieza p = tab.obtenerPieza(i, columna);
				if (p == null) {
					jugadas.add(new Posicion(i, columna));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, columna));
					}
					break;
				}
			}
			for (int i = fila + 1; i <= 7; i++) {
				Pieza p = tab.obtenerPieza(i, columna);
				if (p == null) {
					jugadas.add(new Posicion(i, columna));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, columna));
					}
					break;
				}
			}
			for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = fila + 1, j = columna + 1; i >= 0 && j <= 7; i--, j++) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = fila + 1, j = columna - 1; i <= 7 && j >= 0; i++, j--) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = fila + 1, j = columna + 1; i <= 7 && j <= 7 ; i++, j++) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = columna + 1; i <= 7; i++) {
				Pieza p = tab.obtenerPieza(fila, i);
				if (p == null) {
					jugadas.add(new Posicion(fila, i));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(fila, i));
					}
					break;
				}
			}
			for (int i = columna - 1; i >= 0; i--) {
				Pieza p = tab.obtenerPieza(fila, i);
				if (p == null) {
					jugadas.add(new Posicion(fila, i));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(fila, i));
					}
					break;
				}
			}
		}
		if (color == Color.NEGRO) {
			for (int i = fila - 1; i >= 0; i--) {
				Pieza p = tab.obtenerPieza(i, columna);
				if (p == null) {
					jugadas.add(new Posicion(i, columna));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, columna));
					}
					break;
				}
			}
			for (int i = fila + 1; i <= 7; i++) {
				Pieza p = tab.obtenerPieza(i, columna);
				if (p == null) {
					jugadas.add(new Posicion(i, columna));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, columna));
					}
					break;
				}
			}
			for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = fila + 1, j = columna + 1; i >= 0 && j <= 7; i--, j++) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = fila + 1, j = columna - 1; i <= 7 && j >= 0; i++, j--) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = fila + 1, j = columna + 1; i <= 7 && j <= 7 ; i++, j++) {
				Pieza p = tab.obtenerPieza(i, j);
				if (p == null) {
					jugadas.add(new Posicion(i, j));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(i, j));
					}
					break;
				}
			}
			for (int i = columna + 1; i <= 7; i++) {
				Pieza p = tab.obtenerPieza(fila, i);
				if (p == null) {
					jugadas.add(new Posicion(fila, i));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(fila, i));
					}
					break;
				}
			}
			for (int i = columna - 1; i >= 0; i--) {
				Pieza p = tab.obtenerPieza(fila, i);
				if (p == null) {
					jugadas.add(new Posicion(fila, i));
				}
				if (p != null) {
					if (obtenerColor() != p.obtenerColor()) {
					jugadas.add(new Posicion(fila, i));
					}
					break;
				}
			}
		}
		return jugadas;
	}
}