import java.util.Iterator;
import java.util.NoSuchElementException;

public class TheSubsequences {
	public static void main(String[] args) {
		
		//test primer
		System.out.println(count(100, 650, 65));
		
		
	}
	
public static int count(int A, int B, int C){
	
		
		int start=A;
		int end=B;
		int num=C;
		
		boolean subnumber=false;
		
		int digit=0;
		
		int finalCount=0;
		
		SLL<Integer> listA = new SLL<Integer>();
		SLL<Integer> listC = new SLL<Integer>();
		SLL<Integer> finalList= new SLL<Integer>();
		
		
		String word2=String.valueOf(num);
		
		
		//sekoj broj vo opsegot treba da se odeluva cifra po cifra 
		for (int y=start;y<=end;y++){
			
		String word1=String.valueOf(y);
		
		
		//odeluvanje na cifrite i vnesuvanje vo lista
		for (int i=0;i<word1.length();i++)
		{
		digit=word1.charAt(i)-'0';
		listA.insertLast(digit);
		}
		
		for (int i=0;i<word2.length();i++)
		{
		digit=word2.charAt(i)-'0';
		listC.insertLast(digit);
		}
		
			
		SLLNode<Integer> firstA = listA.getFirst();
		SLLNode<Integer> firstC= listC.getFirst();
		
		//brojot sto se proveruva mora da ima poveke cifri od podbrojot
		if (listA.length()>=listC.length()){
		while(firstA!=null)
		{
			//ako ne se isti cifrite se proveruva narednata
			if (firstA.element!=firstC.element)
			{
				firstA=firstA.succ;
			}
			
			//ako e najdena ista cifra
			else if (firstA.element==firstC.element){

				subnumber=true;
			
			if (firstC.succ!=null){
			//treba da se izminat cifrite na podbrojot, ako site gi sodrzi prviot broj togas e tocen uslovot
			while(firstC!=null)
			{
					//ako nema veke cifri vo prvata lista, a ima vo vtorata, togas nemoze da e podbroj
					if (firstA==null){
						subnumber=false;
						break;
					}
					
					if (firstC.element==firstA.element)
					{
						subnumber=true;
					}
					
					//ako ne se isti treba da se proveri narednata cifra
					if (firstC.element!=firstA.element){
						subnumber=false;
						break;
					}
										
					
					firstC=firstC.succ;					
					firstA=firstA.succ;				
					
					
			}}
			
			
			if (subnumber)
			{
				//finalList.insertLast(y);
				System.out.println(y);
				finalCount++;
				 break;				
			}
			
			
			if (!subnumber && firstA!=null)
			{
				firstA=firstA.succ;
			}
			
			}		
		}
	
	
		listA.deleteList();
		listC.deleteList();
	
		}}
		
		
		// ova e otstraneto za da se zabrza zadacata, inaku e tocen kod
		/*SLLNode<Integer> firstFinal = finalList.getFirst();
		
		while (firstFinal!=null)
		{
			finalCount++;
			firstFinal=firstFinal.succ;
		}*/
		
		return finalCount;
		
	}	
	
}





 class SLL<E> {
	private SLLNode<E> first;

	public SLL() {
		// Construct an empty SLL
		this.first = null;
	}

	public void deleteList() {
		first = null;
	}

	public int length() {
		int ret;
		if (first != null) {
			SLLNode<E> tmp = first;
			ret = 1;
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret++;
			}
			return ret;
		} else
			return 0;

	}

	@Override
	public String toString() {
		String ret = new String();
		if (first != null) {
			SLLNode<E> tmp = first;
			ret += tmp + "->";
			while (tmp.succ != null) {
				tmp = tmp.succ;
				ret += tmp + "->";
			}
		} else
			ret = "Prazna lista!!!";
		return ret;
	}

	public void insertFirst(E o) {
		SLLNode<E> ins = new SLLNode<E>(o, first);
		first = ins;
	}

	public void insertAfter(E o, SLLNode<E> node) {
		if (node != null) {
			SLLNode<E> ins = new SLLNode<E>(o, node.succ);
			node.succ = ins;
		} else {
			System.out.println("Dadenot jazol e null");
		}
	}

	public void insertBefore(E o, SLLNode<E> before) {
		
		if (first != null) {
			SLLNode<E> tmp = first;
			if(first==before){
				this.insertFirst(o);
				return;
			}
			//ako first!=before
			while (tmp.succ != before)
				tmp = tmp.succ;
			if (tmp.succ == before) {
				SLLNode<E> ins = new SLLNode<E>(o, before);
				tmp.succ = ins;
			} else {
				System.out.println("Elementot ne postoi vo listata");
			}
		} else {
			System.out.println("Listata e prazna");
		}
	}

	public void insertLast(E o) {
		if (first != null) {
			SLLNode<E> tmp = first;
			while (tmp.succ != null)
				tmp = tmp.succ;
			SLLNode<E> ins = new SLLNode<E>(o, null);
			tmp.succ = ins;
		} else {
			insertFirst(o);
		}
	}

	public E deleteFirst() {
		if (first != null) {
			SLLNode<E> tmp = first;
			first = first.succ;
			return tmp.element;
		} else {
			System.out.println("Listata e prazna");
			return null;
		}
	}

	public E delete(SLLNode<E> node) {
		if (first != null) {
			SLLNode<E> tmp = first;
			if(first ==node){
				return this.deleteFirst();
			}
			while (tmp.succ != node && tmp.succ.succ != null)
				tmp = tmp.succ;
			if (tmp.succ == node) {
				tmp.succ = tmp.succ.succ;
				return node.element;
			} else {
				System.out.println("Elementot ne postoi vo listata");
				return null;
			}
		} else {
			System.out.println("Listata e prazna");
			return null;
		}

	}

	public SLLNode<E> getFirst() {
		return first;
	}
	
	public SLLNode<E> find(E o) {
		if (first != null) {
			SLLNode<E> tmp = first;
			while (tmp.element != o && tmp.succ != null)
				tmp = tmp.succ;
			if (tmp.element == o) {
				return tmp;
			} else {
				System.out.println("Elementot ne postoi vo listata");
			}
		} else {
			System.out.println("Listata e prazna");
		}
		return first;
	}
	
    public Iterator<E> iterator () {
    // Return an iterator that visits all elements of this list, in left-to-right order.
        return new LRIterator<E>();
    }

	// //////////Inner class ////////////

	private class LRIterator<E> implements Iterator<E> {

		private SLLNode<E> place, curr;

		private LRIterator() {
			place = (SLLNode<E>) first;
			curr = null;
		}

		public boolean hasNext() {
			return (place != null);
		}

		public E next() {
			if (place == null)
				throw new NoSuchElementException();
			E nextElem = place.element;
			curr = place;
			place = place.succ;
			return nextElem;
		}

		public void remove() {
			//Not implemented
		}
	}
	
	public void mirror(){
		if (first != null) {
			//m=nextsucc, p=tmp,q=next
			SLLNode<E> tmp = first;
			SLLNode<E> newsucc = null;
			SLLNode<E> next;
			
			while(tmp != null){
				next = tmp.succ;
				tmp.succ = newsucc;
				newsucc = tmp;
				tmp = next;
			}
			first = newsucc;
		}
		
	}
	
	public void merge (SLL<E> in){
		if (first != null) {
			SLLNode<E> tmp = first;
			while(tmp.succ != null)
				tmp = tmp.succ;
			tmp.succ = in.getFirst();
		}
		else{
			first = in.getFirst();
		}
	}
}

  class SLLNode<E> {
		protected E element;
		protected SLLNode<E> succ;

		public SLLNode(E elem, SLLNode<E> succ) {
			this.element = elem;
			this.succ = succ;
		}

		@Override
		public String toString() {
			return element.toString();
		}
	}


