package paquete;
import processing.core.PApplet;

public class Ajedrez extends PApplet {
	public static void main(String[] args) {
		PApplet.main("paquete.Ajedrez");
	}
	int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

	@Override
	public void settings() {
		size(ancho, alto);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					fill(0);
				} else {
					fill(255);
				}
				rect(j * (ancho / 8), i * (alto / 8), (ancho / 8), (alto / 8));
			}
		}
	}
}
