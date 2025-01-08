package defpack;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean condition;
		condition = false;
		boolean condition2 = true;
		boolean result = condition || condition2;
		
		if(condition)
		{
			System.out.println("Die Aussage war wahr.");
		}
		else if(condition2)
			{
				System.out.println("Die Aussage 2(!) war wahr.");
			}
		else
		{
			System.out.println("Die Aussage ist falsch.");
		}
		
	}
	
}