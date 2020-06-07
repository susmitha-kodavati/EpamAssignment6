
import java.util.Arrays;

public class Collections<T> {
	private static final int INITIAL_CAPACITY = 10 ;
	private int size = 0 ;
	private Object listElements[] ;
	public Collections() {
		listElements = new Object[INITIAL_CAPACITY] ;
	}
	public void add(T e) {
		// TODO Auto-generated method stub
		if(size == listElements.length) {
			listElements = Arrays.copyOf(listElements, listElements.length*2) ;
		}
		listElements[size++] = e ;
	}
	public void display() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < size ; i++) {
			System.out.println(listElements[i]+" ") ;
		}
	}
	@SuppressWarnings("unchecked")
	public T get(int x) {
		// TODO Auto-generated method stub
		if(x < 0 || x >= size) {
			throw new IndexOutOfBoundsException("Invalid index with array list") ;
		}
		return (T)listElements[x];
	}
	@SuppressWarnings("unchecked")
	public T remove(int y) {
		// TODO Auto-generated method stub
		if(y < 0 || y >= size) {
			throw new IndexOutOfBoundsException("Invalid index with array list") ;
		}
		Object removedElement = listElements[y] ;
		for(int i = y ; i < size-1 ; i++) {
			listElements[i] = listElements[i+1] ;
		}
		size-- ;
		return (T)removedElement;
	}
	
	
}