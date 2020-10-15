package estructuras_de_datos;

public interface TablaSimbolosOrdenada <K extends Comparable<K>, V extends Comparable<V>> 
{
	/**
	 * Retornar el n�mero de parejas [Llave,Valor] del �rbol
	 * @return n�mero de parejas [Llave,Valor] del �rbol.
	 */
	int size();

	/**
	 * Informa si el �rbol es vac�o
	 * @return true si esta vacio, false de lo contrario.
	 */
	boolean isEmpty();

	/**
	 * Retorna el valor V asociado a la llave key dada.
	 * @param key llave del valor V a buscar.
	 * @return Retorna el valor V asociado a la llave key dada. Si la llave no se encuentra se retorna el valor null
	 */
	V get(K key);

	/**
	 * Retorna la altura del camino desde la raiz para llegar a la llave key (si la llave existe). 
	 * @param key de la llave a obtener la altura.
	 * @return La altura del camino desde la raiz para llegar a la llave key. -1 si la llave no existe.
	 */
	int getHeight(K key);

	/**
	 * Indica si la llave key se encuentra en el �rbol
	 * @param key de la llave a buscar
	 * @return True si la llave esta en el arbol, false de lo contrario.
	 */
	boolean contains(K key);

	/**
	 * Inserta la pareja [key, val] en el �rbol. Si la llave ya existe se reemplaza el valor. 
	 * @param key de la llave a meter.
	 * @param Value valor a introducir al arbol.
	 */
	void put(K pKey, V pValue);

	/**
	 *  Retorna la altura del �rbol definida como la altura de la rama m�s alta.
	 * @return la altura del �rbol.
	 */

	int height();

	/**
	 * Llave m�s peque�a del �rbol.
	 * @return Retorna la llave m�s peque�a del �rbol. null si el �rbol esta vac�o.
	 */
	K min();

	/**
	 * Llave m�s grande del �rbol.
	 * @return Retorna la llave m�s grande del �rbol. null si el �rbol esta vac�o.
	 */
	K max();

	/**
	 * Retorna una lista de las llaves en el arbol.
	 * @return Lista de las llaves en el arbol.
	 */
	Lista<K> keySet();

	/**
	 * Retorna las llaves en el rango dado.
	 * @param init llave del rango inicial.
	 * @param end llave del rango final.
	 * @return las llaves en el rango dado.
	 */
	Lista<K> keysInRange(K init, K end);

	/**
	 * Retorna las llaves en el valor dado.
	 * @param init valor del rango inicial.
	 * @param end valor del rango final.
	 * @return las valor en el rango dado.
	 */
	Lista<V> valuesInRange(K init, K end);

}
