import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int A[] = { 10, 20, 20, 10, 10, 20, 5, 20, 30, 50, 20, 50,50,50,70 };
		int sayac = 1;
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (i < A.length - 1) {
				if (A[i] == A[i + 1]) {
					sayac++;
				} else {
					System.out.print(A[i] + " den " + sayac + " tane var");
					sayac = 1;

				}

			}else {
				if (A[i] == A[i - 1]) {
					sayac++;
					System.out.println(A[i] + " den " + (sayac - 1) + " adet vardir");
				} else {
					System.out.println(A[i] + " den 1 adet vardır");
				}

			}
		}

	}
}
