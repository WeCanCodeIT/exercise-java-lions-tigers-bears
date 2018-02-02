package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {

	private String[] values = { "lions", "tigers", "bears" };
	
	private int currentIndex = 0;
	
	@Override
	public boolean hasNext() {
		return currentIndex < values.length;
	}

	@Override
	public String next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		return values[currentIndex++];
	}
}
