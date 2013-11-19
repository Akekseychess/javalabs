package task7;

public class MaxDivider {
	public static void main(String[] args) {
		System.out.print(maxDevider(50, 20));
	}
	public static int maxDevider(int a, int b){
		int devider;
		for(devider = Math.min(a, b); devider >0 ;devider--)
			if(a % devider == 0 && b %devider == 0)
				break;
		return devider;
	}
}
