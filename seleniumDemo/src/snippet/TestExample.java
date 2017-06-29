package snippet;

public class TestExample {
	String str=new String("good");
	char[] ch ={'a','b','c'};
	
	/**
	 * @param args形参和实参
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExample ex=new TestExample();
		ex.change(ex.str,ex.ch);
		System.out.print(ex.str+"and");
		System.out.print(ex.ch);
	}

	private void change(String str, char ch[]) {
		// TODO Auto-generated method stub
		str="test";
		ch[0]='g';
	}

}
