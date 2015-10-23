class Test {
	public static void main (String[] args) {
		
		Sorting sort = new Sorting(3);
		sort.getValue(0,"Jan Michael", "Agamin", 27, "Apalit, Pampanga");
		sort.getValue(1,"Jeff Vincent", "Pecana", 16, "Antipolo, Rizal");
		sort.getValue(2,"Bryan Frank", "Agamin", 17, "Calamba, Laguna");

		System.out.println("\n**** ORIGINAL ****");
		sort.display();

		System.out.println("\n **** Sorted By AGE ****");
		sort.bubbleSort();
		sort.display();
	}
}

