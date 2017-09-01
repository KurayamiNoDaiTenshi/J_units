package fr.diginamic;

import java.util.ArrayList;

public class Pile<T>{
	private ArrayList<T> contenue;
	private int size;

	public Pile() {
		contenue = new ArrayList<T>();
		size = Integer.MAX_VALUE;
	}

	public Pile(int size) {
		contenue = new ArrayList<T>();
		this.size = size;
	}

	public ArrayList<T> getContenue() {
		return contenue;
	}

	public void setContenue(ArrayList<T> contenue) {
		this.contenue = contenue;
	}

	public void push(T element) throws ArrayIndexOutOfBoundsException {
		if (contenue.size() == size)
			throw new ArrayIndexOutOfBoundsException();
		contenue.add(element);
	}
	public int size() {
		return contenue.size();
	}
	public int find(T object) {
		return contenue.indexOf(object);
	}
	public void pop() {
		contenue.remove(contenue.size()-1);
	}
	public void popAll() {
		contenue.clear();
	}
	public T peek(){
		return contenue.get(contenue.size()-1);
	}
}
