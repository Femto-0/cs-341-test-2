

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// open the file - using scanner
		

		Scanner scn = new Scanner(new File("bsttree.txt"));
		
		// insert the items from this file into a tree - using bstinsert
		// test if the items are all inserted properly!
		
		Tree tr = new Tree();		
		String value;
		
		while (scn.hasNext())
		{
			value = scn.next();
			
			tr.bstinsert(value);
		
		}
			
		tr.display();
		


		//COMPLETE THE NECESSARY CODE IN Tree AND Node CLASSES SO THE FOLLOWING WORKS CORRECTLY
 
		int height = tr.height();
		System.out.println("height of given tree is: "+height);
		for (int i = 0; i <= height; i++)
		{
			System.out.println("number of nodes in level " + i + " is " + tr.getnodesbylevel(i));
		}
		
		
		//You should check for different input data (modify bsttree.txt and test)

		

	}

}
