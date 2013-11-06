package task2;

import java.util.Arrays;
/**
 * Stores array of numbers. Allows for some manipulations with stored numbers.
 * @author Mykhailo Lisevych
 *
 */
public class ArrayManipulator {
	
	private int[] data;
	
	public ArrayManipulator(final int[] _data) {
		this.data=Arrays.copyOf(_data, _data.length);
	}
	
	
	public int getEvenPositionsMultiplication() {
		int result = 1;
		for(int i=0; i<data.length; i+=2) {
			result*=data[i];
		}
		return result;
	}
	
	public int getSumBetweenZeroes() {
		int result = 0;
		for(int partsum=0, i=0, in=0; i<this.data.length; i++) {
			if(in==1) {
				if(this.data[i]==0) {
					result+=partsum;
					partsum=0;
				} else {
					partsum+=this.data[i];
				}
			}else {
				if(this.data[i]==0) {
					in=1;
				}
			}
		}
		return result;
	}
	
	public int[] getPositiveElementsAtStart(){
		int[] result = Arrays.copyOf(this.data, data.length);
		for(int positive=0, i=0; i<this.data.length; i++) {
			if(result[i]>=0) {
				int tmp = result[positive];
				result[positive]=result[i];
				result[i]=tmp;
				positive++;
			}
		}
		return result;
	}
	
	@Override
	public String toString(){
		String result = "[ ";
		for (int i =0; i < data.length; i++)
			result += data[i] + " ";
		return result+"]";
	}
}
