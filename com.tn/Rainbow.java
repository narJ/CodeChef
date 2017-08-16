import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = 0;
		System.out.println("entrez le nombre d'essais");

		t = sc.nextInt();

		int i = 0;

		while (i < t) {
			System.out.println("entrez la taille du tableau");

			int j = sc.nextInt();

			int[] tab = new int[j];
			System.out.println("Entrez les élément du tableau");
			for (int k = 0; k < tab.length; k++) {
				do {
					tab[k] = sc.nextInt();

				} while (tab[k] >= 10);
			}
			boolean b = true;
			int k = 0;
			while (k < (tab.length / 2) + 1 && b) {
				if (tab[k] != tab[tab.length - 1 - k]) {
					b = false;
				}
				k++;
			}

			if (b) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			i++;
		}

	}

}
