//Listas Doubles
public class ListaDouble{
	Node topForward;
	Node topBackward;

	//Insertion of nodes
	public boolean insertaPrimerNodo(String dato){
		if (topForward == null) { //La lista no está vacía
			topForward = new Node();
			topForward.name = dato;
			topForward.next = null;
			topForward.previous = null;
			topBackward = topForward;

			return true;
		}
		else {
			return false;
		}
	}

	
	public void imprimir(){
		System.out.print("[X]"); 
		for (Node temp = this.topForward; temp != null; temp = temp.next){
			System.out.print(" <- [ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}


	public String toString(){
		String cadAux = "[X]";
		for (Node temp = this.topForward; temp != null; temp = temp.next){
			cadAux += " <- [ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}


	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.topForward;
		this.topForward.previous = temp;
		this.topForward = temp;
		temp = null;
	}



	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;

		temp.previous = this.topBackward;
		this.topBackward.next = temp;
		this.topBackward = temp;
		temp = null;
	}


	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.topForward;
			

			
		while((temp2 != null)
		      && temp2.name.equals(buscado) == false){
			temp2 = temp2.next;
		}
		if (temp2 != null){ //Node has been found
			temp.next = temp2.next;
			temp2.next = temp;
			
			temp.previous = temp2;
			temp.next.previous = temp;
			
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
		
	}

 /*       
	//Removal of Nodes
	//Removing the first Node
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}
	
	//Removing a node that is not the first
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;
		while((temp != null)
		      && temp.name.equals(buscado) == false){
			temp = temp.next;
		}
		if (temp != null){ //Node has been found
			temp.next = temp.next.next;
			temp = null;
			return true;
		}
		else return false;
		}

	//Eliminating the final node of the list
	//Need to find the second to last node of the list
	public void borrarUltimoNodo(){
	Node temp = top;

			
            //Find the Penultimate node
            while (temp.next.next != null)
				temp = temp.next;
            	//Once found, erase the last node
            	temp.next = null;

		
        }



	/*To remove a node
	top = top.next*/

	//Eliminate the final node
	//Search for a specific node and eliminate it*/
}