package defaultpackage;

public class SantasList <T extends Child>{

	private Node<T> firstNaughty;
	private Node<T> firstNice;
	
	
	public SantasList() {}
	
	
	private void remove (Node<T> node ){
		Node<T> previous = findPrevious(node);
		if (previous != null){ }
		previous.nextItem = node.nextItem;
		
	}
	
	private Node<T> findPrevious(Node<T> node){
		if(node.item.isNice){
			Node<T> tmp = firstNice;
			if (firstNice != null){
				if (firstNice.equals(node)) return null;	
				while (tmp.nextItem != null && tmp.nextItem != node) tmp = tmp.nextItem;
					
				}
			}
		}
		
	}
	
	
	
	class Node<T> {
		T item = null;
		Node<T> nextItem = null;
		
		public Node (T item){
			
			this.item = item;
		}
	}
}
