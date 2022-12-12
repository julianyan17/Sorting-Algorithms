package com.cse.ds;

/**
 * 
 * @param <E>
 * 
 */
public interface Comparator<E> {
	
	public boolean comparison(E x, E y, boolean ascending);

}
