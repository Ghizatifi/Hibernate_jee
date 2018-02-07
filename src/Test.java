import dao.Produit;

import java.util.ArrayList;

import dao.*;
public class Test {

	public static void main(String[] args) {
	Service serv= new Service();	
	ArrayList<Produit> list= (ArrayList<Produit>)serv.getAllProduit();

//	Produit prd1 = new Produit(3,"clavier", 6000);
//	//serv.addProduit(prd1);	
//	serv.deleteProduit(prd1);
//	System.out.println("Check database");
	System.out.println("Le Produit ********Num 2****************");
	Produit p =serv.getProduit(2);
		System.out.println("Le produit : "+p.toString());
//serv.getProduit(2);
		System.out.println("Liste de Produits******************************");
		for(Produit p2: list){
			System.out.println("Le produit : "+p2.toString());

		}
		System.out.println("double criteria Produit ********tele****************");
		ArrayList<Produit> list2= (ArrayList<Produit>)serv.getbykeys("tele",100,80000);
		for(Produit p3: list2){
			System.out.println("Le produit : "+p3.toString());

		}

	}

}
