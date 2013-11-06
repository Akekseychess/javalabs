package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Stores set of strings and performs ordering operations on them.
 * 
 * @author Mykhailo Lisevych
 * 
 */
public class OrderedStringStorage {

	private ArrayList<String> data;

	public OrderedStringStorage() {
		this.data = new ArrayList<String>();
	}

	public OrderedStringStorage(final String[] initData) {
		this();
		if (initData != null) {
			for (String s : initData) {
				this.data.add(s);
			}
		}
	}

	public void add(String s) {
		this.data.add(s);
	}

	public void remove(String s) {
		this.data.remove(s);
	}

	public void clear() {
		this.data.clear();
	}

	/**
	 * Returns stored strings unordered.
	 * @return stored strings unordered.
	 */
	public String[] getUnordered() {
		String[] result = new String[this.data.size()];
		this.data.toArray(result);
		return result;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(String s : this.data) {
			result+=" "+s;
		}
		result+=" ]";
		return result;
	}

	/**
	 * Returns strings ordered by lengths ascending.
	 * @return strings ordered by lengths ascending.
	 */
	public String[] getOrderedByLength() {
		String[] result = new String[this.data.size()];
		this.data.toArray(result);
		Arrays.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return 0;
				}
				if(o1.length()<o2.length()) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		return result;
	}

	/**
	 * Returns strings ordered by lengths descending.
	 * @return strings ordered by lengths descending.
	 */
	public String[] getOrderedByLengthDesc() {
		String[] result = new String[this.data.size()];
		this.data.toArray(result);
		Arrays.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return 0;
				}
				if(o1.length()>o2.length()) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		return result;
	}
}
