//Nisa Nur Yümlü 150201008 
package pro2;

public class SortedLinkedList<E extends Comparable<? super E>> implements SortedListInterface<E>{

	/* node object that references the first node in the list */
	private Node<E> head;
	/* number of nodes in the list */
	private int numItems;
	
	/**
	 * Default constructor initializes 
	 * the head of the list and the number of items
	 * */
	public SortedLinkedList() {
		head = null;
		numItems = 0;
	}
	
	/**
	 * Constructor accepting an item as parameter
	 * the linked list variables are initialized 
	 * by calling the default constructor
	 * and the item is added in the list
	 * */
	public SortedLinkedList(E item) {
		this();
		add(item);
	}

        public void add(E item)
        {

		if (head == null)
		{
			Node<E> newNode = new Node<E>(item);
			head = newNode;
			
		}
		else if (item.compareTo(head.item) < 0)
		{
			
			newNode.next = head;
			head = newNode;
		}
		else
		{
			Node after = head.next;
			Node before = head;
			while (after != null)
			{
				if (item.compareTo(after.item) < 0)
					break;
				before = after;
				after = after.next;
			}
			newNode.next = before.next;
			before.next = newNode;
			
		}

	}
        
	public E get(int index)  throws ListIndexOutOfBoundsException {
	          Node<E> temp = head;
                  for(int i=0; i<index; i++){
                           temp = temp.next;
                  }
                  return temp.item;
        }
                  
	
	public void remove(int index) throws ListIndexOutOfBoundsException{
	         Node<E> temp = head;
                 if (index == 0) {
			
                      head = head.next;

		} else if(index == size()-1) {
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		} else {
			for(int i=0; i<index-1; i++){
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		numItems--;
	}
       
	
	public void removeAll(){
               
                head = null;
                numItems=0;
           
        
        }

	public void delete(E item){
	 
                  remove(contains(item));
        }
	
	public int contains(E item){
                
                Node<E>  temp = head;
                int i=0;
                int rt=0;
                while(temp.next != null){
                    
                    if(item.compareTo(temp.item) == 0){
                            rt=i;
                            break;
                    } i++;
                      temp=temp.next;
                }
                return rt;
        }
	
	
	public int size(){
              
               int i=0;
               while( head.next !=null){
                   i++;
               } 
                return i;
        }
	
	
	public boolean isEmpty(){
        
              if(head == null){
                    return true;
              }
              else
               return false;
        } 

	
	public void display(){
           
              System.out.print("{");
              Node<E> cr = head;
              while(cr != null){
                    
                    System.out.println(cr.item + ",");
                    cr = cr.next;
              }
              System.out.println("}");
        }


	

}
