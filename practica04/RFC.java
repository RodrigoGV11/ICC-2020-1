import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto = new String();
                String fechaNacimiento = new String();

                System.out.println("Escribe tu nombre completo");
                nombreCompleto = scanner.nextLine();
                System.out.println("Escribe tu fecha de nacimiento en formato dd/mm/aaaa");
                fechaNacimiento = scanner.nextLine();

                int x = nombreCompleto.indexOf(' ');
                int y = nombreCompleto.lastIndexOf(' ');
                int w = fechaNacimiento.indexOf('/');
                int z = fechaNacimiento.lastIndexOf('/');

                System.out.println( nombreCompleto.substring(x+1,x+3).toUpperCase() + nombreCompleto.charAt(y+1) + nombreCompleto.charAt(0) + fechaNacimiento.substring(z+3,z+5) + fechaNacimiento.substring(w+1,w+3) + fechaNacimiento.substring(0,2) );

	}

}
