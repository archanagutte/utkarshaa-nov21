public class Constr {
	
		Constr(){
			System.out.println("default");
		}
		Constr(int i){
			System.out.println("parameterized con" +i);
			
		}
		Constr(String s,int i){
			System.out.println(s+i);
		}}

public class constr2  extends constr{
	constr2(){
		System.out.println("constr2");
	}
	public static void main(String[] args) {
		constr c=new constr();
		constr c1=new constr(10);
		constr c2=new constr("test",20);
		
		
	}
	

}


	
			
	
		

	

