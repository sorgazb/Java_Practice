package unidad8.tareasU8.tarea2;

/*
* Una interface para definir el comportamieno del Responsable
*/
public interface I_Responsable {

	/*
	* Retorna rue si la cadena que recibe es una cantidad válida para depositar
	* @param deposito: la cantidad para ser depositada
	*/
	boolean isValidDeposit(double cantidad); 

	void deposit(double cantidad); 

	boolean isValidWithdrawal(double cantidad); 

	void withdraw(double cantidad); 
	
}
