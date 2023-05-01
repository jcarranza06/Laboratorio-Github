package logic;

public class fibonacci {

	public static int fibo(Int x) {
		if(x > 1){
			return fibo(x-1)+fibo(x-2);
		}else{
			if(x == 1){
				return 1;
			}else{
				return 0;
			}
		}
	}
}
