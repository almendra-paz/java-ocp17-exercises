public class Varargs{

	public static void main(String args[]){
		System.out.println(average(1,2,3,4));//9
		System.out.println(average(1));			//0
		System.out.println(average(1, null)); 
	}

	public static double average(int x, int... values){
		double sum = 0;
		for(int i=0; i<values.length; i++)
			sum += values[i];

		System.out.println(x);		
		return sum;		
	}
		
}