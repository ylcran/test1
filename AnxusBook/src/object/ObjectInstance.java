package object;

public class ObjectInstance extends Object{
	public String toString(){
		return "在"+getClass().getName()+"类中重写toString()方法";
	}
	
	public static void main(String[] args){
		System.out.println(new ObjectInstance());
	}

}
