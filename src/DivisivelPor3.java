
public class DivisivelPor3 {

	public static void main(String[] args) {
    
	Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	String NUMEROS_IMPARES = " ";
	for(int i=0 ; i<numeros.length ; i++) {
		
		if(numeros[i]%3==0) {
			NUMEROS_IMPARES = NUMEROS_IMPARES + numeros[i] +" ";
		}
	}
	
	System.out.println("Os numeros divis�veis por 3 desta lista s�o: " + NUMEROS_IMPARES);

	}

}
