package lacosRepeticao;

public class AulaFor {

	public static void main(String[] args) {
		//Tabuada
		  for (int i=1; i<=10; i++) {
			System.out.print("\n\nTabuada do " + i);
			for(int j=1; j<=10; j++) {
				System.out.printf("\n%d x %d = %d",i,j, i*j);
			}
		}
	}

}
