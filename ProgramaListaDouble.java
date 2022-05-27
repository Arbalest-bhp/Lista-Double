public class ProgramaListaDouble {
	

	public static void main(String[] args){
		ListaDouble miLista = new ListaDouble();

       if (miLista.insertaPrimerNodo("A")){
           System.out.println("Se ha insertado el primer nodo de la lista");
       }
       else{
           System.out.println("No se pudo insertar el primer nodo de la lista");
       }

       miLista.imprimir();
       System.out.println(miLista); //miLista.toString

        miLista.insertaAntesPrimerNodo("B");
	    miLista.imprimir();

        miLista.insertaAntesPrimerNodo("C");
	    miLista.imprimir();
        System.out.println(miLista); //miLista.toString

        miLista.insertaAlFinal("D");
		System.out.println(miLista); //miLista.toString

        miLista.insertaAlFinal("E");
		System.out.println(miLista); //miLista.toString

        boolean result = miLista.insertaEntreNodos("F", "A");
		if (result){
			System.out.println("Se inserto el nodo F");
		}
		else System.out.println("No se encontró el nodo Z");

		System.out.println(miLista); // miLista.toString();

/*

		miLista.insertarAlFinal("D");
		System.out.println(miLista); //miLista.toString

		miLista.insertarAlFinal("E");
		System.out.println(miLista); //miLista.toString*/
	}
}