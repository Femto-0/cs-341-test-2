

import java.util.StringTokenizer;

public class Tree {

	Node root;
	
	Node firstleaf;
	
	public Tree()
	{
		root = null;
		firstleaf = null;
	}
	
	public boolean isEmpty()
	{
		if (root == null)
			return true;
		else
			return false;
	}
	

	
	
	
	
	
	
	public void insert(String line)
	{
		String valueatnode, valueatleft, valueatright;
		
		StringTokenizer stk = new StringTokenizer(line);
		
		// get the three(?) strings and print them out separately
		
		valueatnode = stk.nextToken();
		if (stk.hasMoreTokens())
		{
			valueatleft = stk.nextToken();
		}
		else
		{
			valueatleft = null;
			valueatright = null;
		}
		if (stk.hasMoreTokens())
		{
			valueatright = stk.nextToken();
		}
		else
		{
			valueatright = null;
		}
		
		if (isEmpty())
		{
			// create a node with valueatnode and set it to be the root
			
			Node temp = new Node(valueatnode);
			root = temp;
			
		}
		
		Node handle = root.find(valueatnode);
		
		handle.insert(valueatleft, valueatright);
		
	}

	public void preorder() {
		// TODO Auto-generated method stub
		
		if (! isEmpty())
		{
			root.preorder();
		}
		
		
		
	}

	
	public void inorder() {
		// TODO Auto-generated method stub
		
		if (! isEmpty())
		{
			root.inorder();
		}	
	}
	
	public void display()
	{
		if (!isEmpty())
		{
			root.display(0);
		}
		
		
	}
	
	
	
	public boolean bstfind(String s)
	{
		if (root == null)
			return false;
		else
			return root.bstfind(s);
	}
	
	
	
	
	public int numleaves() {
		// TODO Auto-generated method stub
		if (! isEmpty())
		{
			return root.numleaves();
		}
		
		return 0;
	}
	
	public String leavesValues() {
		if(!isEmpty()) {
			return root.leavesValues();
		}
		return "There are no leaves";
	}

	public String getnamesby(char c) {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			return root.getnamesby(c);
		}
		return "There are no leaves";
	}

	public void setupleafIter() {
		// TODO Auto-generated method stub
		if (!isEmpty())
		{
			firstleaf = new Node("");
			
			root.setupleaf(firstleaf);
			firstleaf = firstleaf.nextleaf;
			System.out.println("setup for first" + firstleaf.value);

//			firstleaf = root.setupleaf2(null);
		
		}
		else
			return;
	}
	
	public Node getfirstleaf()
	{
		return firstleaf;
	}
	
	public Node getNextLeaf(Node n)
	{
		if (n.nextleaf == null)
		{
			return null;
		}
		else
		{
			return n.nextleaf;
			
		}
	}
	
	public void bstremove(String s)
	{
		if (root == null)
		{
			System.out.println("Tree is empty");
		}
		else
		{
			if (root.value.equals(s) == true) // value found at root
			{
				if (root.left == null && root.right == null)
				{
					root = null;
				}
				else
				{				
					
					root.bstreplaceandremove(s);
				}
			}
			else
			{
				root.bstremove(s);
			}
		}
			
	}

	public void avlinsert(String s) {
		// TODO Auto-generated method stub
		if (root == null)
		{
			root = new Node(s);
		}
		else
		{
			root.avlinsert(s);
		}
	}
	
	public void bstinsert(String s)
	{
		if (root == null)
		{
			root = new Node(s);
		}
		else
		{
			root.bstinsert(s);
		}
	}

	public int height() {
		if(root==null) {
			return -1;
		}else {
		return root.height(root);
		}
	}

	public int getnodesbylevel(int i) {
		
		return root.getNodesByLeaves(root,i);
	}


		
	
	
}
