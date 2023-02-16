public class StringConcatenation{

	public static void main(String args[]){
		String str=""; int a = 3;
		str += a;
		System.out.println(str);

		//error compilación
		Object str2; int b = 3;
		str2 = "name";
		str2 += a;
		System.out.println(str2);
	}

}