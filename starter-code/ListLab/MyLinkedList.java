package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> {
	
	private Node<T> head;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	public void add(T obj) {
		//todo
		Node<T> newNode= new Node<T>(obj);
		if(head==null){
			head=newNode;
		}else {

			Node<T> currentNode= head;
			while (currentNode.getNext() !=null){
				currentNode= currentNode.getNext();
			}
			if (currentNode.getNext() ==null){
				currentNode.setNext(newNode);
			}
		}

		size++;
	}
	
	public boolean remove(int index) {
		//todo
		if(index <0 || index >size){
			return false;
		}
		Node<T> currentNode= head;
		for(int i =0; i<index; i++){
			currentNode= currentNode.getNext();
			if(currentNode.getNext().getNext() !=null){
				currentNode.setNext(currentNode.getNext().getNext());

			}else {
				currentNode.setNext(null);
			}

		}
		size--;
		return true;
	}
	
	public T get(int index) {
		//todo
		if(index <0 || index >size) {

			return null;
		}else{
			Node<T> currentNode= head;
			while(currentNode.getNext() !=null){
				currentNode= currentNode.getNext();

			}
			return currentNode.getData();
		}

	}

//	@Override
//	public Iterator<T> iterator() {
//		// TODO Auto-generated method stub
//		return new MyIterator<T>(head);
//	}
//
//	private class MyIterator<T> implements Iterator<T> {
//
//		private Node<T> node;
//
//		public MyIterator(Node<T> node) {
//			//todo
//		}
//		@Override
//		public boolean hasNext() {
//			//todo
//		}
//
//		@Override
//		public T next() {
//			//todo
//		}
//
//		@Override
//		public void remove() {
//			// TODO Auto-generated method stub
//
//		}
//
	}

