package unidad8.tareasU8.tareaReservaEventos;

public class Gradas {

	public static TipoAsiento[][] lateral_A = new TipoAsiento[ConstantesGradas.NUM_FILAS][ConstantesGradas.NUM_COLUMNAS_LATERALES];
	public static TipoAsiento[][] lateral_B = new TipoAsiento[ConstantesGradas.NUM_FILAS][ConstantesGradas.NUM_COLUMNAS_LATERALES];
	public static TipoAsiento[][] fondo_A = new TipoAsiento[ConstantesGradas.NUM_COLUMNAS_FONDOS][ConstantesGradas.NUM_FILAS];
	public static TipoAsiento[][] fondo_B = new TipoAsiento[ConstantesGradas.NUM_COLUMNAS_FONDOS][ConstantesGradas.NUM_FILAS];

	public static void inicializarGrada(TipoAsiento[][] array) {
		if (array.equals(lateral_A) || array.equals(lateral_B)) {
			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < ConstantesGradas.NUM_COLUMNAS_LATERALES; j++) {
					array[i][j] = TipoAsiento.LIBRE;
				}
			}
		} else {
			for (int i = 0; i < ConstantesGradas.NUM_COLUMNAS_FONDOS; i++) {
				for (int j = 0; j < ConstantesGradas.NUM_FILAS; j++) {
					array[i][j] = TipoAsiento.LIBRE;
				}
			}
		}
	}

	public static void mostrarEstadoGrada(TipoAsiento[][] array) {
		if (array.equals(lateral_A) || array.equals(lateral_B)) {
			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < ConstantesGradas.NUM_COLUMNAS_LATERALES; j++) {
					System.out.print("[" + array[i][j].getTipo_Asiento() + "]");
				}
				System.out.println("");
			}
		} else {
			for (int i = 0; i < ConstantesGradas.NUM_COLUMNAS_FONDOS; i++) {
				for (int j = 0; j < ConstantesGradas.NUM_FILAS; j++) {
					System.out.print("[" + array[i][j].getTipo_Asiento() + "]");
				}
				System.out.println("");
			}
		}
	}
	
	
	
	
	public static void main(String [] args) {
		inicializarGrada(fondo_A);
		inicializarGrada(fondo_B);
		inicializarGrada(lateral_A);
		inicializarGrada(lateral_B);
	}

}
