package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
        datos = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                datos[i][j] = 0;
            }
        }
        this.m = m;
        this.n = n;
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        return datos[i][j];
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
        datos[i][j] = dato;
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
        if (m != otra.m || n != otra.n) {
            return null;
        }
        Matriz nueva = new Matriz(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nueva.datos[i][j] = (datos[i][j] + otra.datos[i][j]);
            }
        }
        return nueva;
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
        Matriz nueva = new Matriz(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nueva.datos[i][j] = (datos[i][j] * c);
            }
        }
        return nueva;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        Matriz nueva = new Matriz(m - 1, n);
        int l = 0;
        for (int i = 0; i < nueva.m; i++) {
            for (int j = 0; j < n; j++) {
                if (l == k) {
                    l++;
                    nueva.datos[i][j] = datos[l][j];
                } else {
                    nueva.datos[i][j] = datos[l][j];
                }
            }
            l++;
        }
        return nueva;
    }

    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
        Matriz nueva = new Matriz(m, n - 1);
        for (int i = 0; i < m; i++) {
            int l = 0;
            for (int j = 0; j < nueva.n; j++) {
                if (l == k) {
                    l++;
                    nueva.datos[i][j] = datos[i][l];
                } else {
                    nueva.datos[i][j] = datos[i][l];
                }
                l++;
            }
        }
        return nueva;
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
        double det = 0;
        if (m == 1 && n == 1) {
            det = datos[0][0];
        }
        if (m == 2 && n == 2) {
            det = (datos[0][0] * datos[1][1]) - (datos[1][0] * datos[0][1]);
        }
        if (m > 2 && n > 2) {
            for (int i = 0; i < m; i++) {
                int j = 0;
                if ((i + j) % 2 == 0) {
                    det += (datos[i][j]) * (this.eliminarColumna(j).eliminarFila(i).determinante());
                } else {
                    det += -(datos[i][j]) * (this.eliminarColumna(j).eliminarFila(i).determinante());
                }
            }
        }
        return det;
    }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1) {
                    s += datos[i][j] + " ";
                } else {
                    s += datos[i][j];
                }
            }
            if (i < m - 1) {
                s += "\n";
            }
        }
        return s;
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de 
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matriz otra = (Matriz) obj;
        if (m != otra.m || n != otra.n) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (datos[i][j] != otra.datos[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}