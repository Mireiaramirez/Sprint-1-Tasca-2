package t2n1exercici1;

import java.util.ArrayList;

public class Venda {

	// Atributos

	private ArrayList<Producte> colProductes;
	private int preuTotal;

	public Venda(ArrayList<Producte> colProductes) {
		this.colProductes = new ArrayList<>();

	}

	// Método

	public void calcularTotal(ArrayList<Producte> colProductes) throws VendaBuidaException {

		int i = 0;
		int sumaTotal = 0;
		int suma;
		while (i < colProductes.size()) {

			suma = colProductes.get(i).getPreu();
			sumaTotal += suma;

			if (i == colProductes.size() - 1) {
				System.out.println("La suma total de los productos es de: " + sumaTotal);

			}

			i++;

		}
		if (colProductes == null || colProductes.size() == 0) {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		}

	}

	public ArrayList<Producte> getColProductes() {
		return colProductes;
	}

	public void setColProductes(ArrayList<Producte> colProductes) {
		colProductes = colProductes;
	}

	public int getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(int preuTotal) {
		preuTotal = preuTotal;
	}

}
