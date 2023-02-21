public class FlowScoping{
	
	public static void main(String arg[]){
		Object saludo = "hello";
		
		if(saludo instanceof String str){
			System.out.println(str.length());
		}
		//System.out.println(str.length());
		
		
		if(! (saludo instanceof String str )){
			
		}else{
			System.out.println(str.length());
		}		
		
		if(! (saludo instanceof String str ))return;
		System.out.println(str.length());
		
	}
	
}