package exception;

import exception.MyException;

public class Main {
	public static void init(String a) throws MyException{
		if(a.contains("不行")){
			throw new MyException("话不能乱说啊！！！");
		}
		System.out.println(a);
	}

	public static void main(String[] args){
		try {
			init("安浩武不行啊！");
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
