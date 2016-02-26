package base;
//paul jureidini

public class MyInteger 
{
	private int iValue;
	
	public MyInteger(int MyInteger)
	{
		this.iValue = MyInteger;
	}
	
	
	public int get()
	{
		return iValue;
	}
	
	
	public boolean isEven()
	{
		if (iValue % 2 == 0)
		{
			return true;
		}
		return false;
	}
	public boolean isOdd()
	{
		if (iValue % 2 == 1)
		{
			return true;
		}
		return false;
	}
	public boolean isPrime()
	{
		for(int n = 2; n < iValue; n++)
		{
			if (iValue%n == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public static boolean isEven(int iValue)
	{
		return isEven(iValue);
	}
	public static boolean isOdd(int iValue)
	{
		return isOdd(iValue);
	}
	public static boolean isPrime(int iValue)
	{
		return isPrime(iValue);
	}

	//static methods
	public static boolean isEven(MyInteger myinteger){
		return myinteger.isEven(myinteger.get());
	}
	public static boolean isOdd(MyInteger myinteger){
		return myinteger.isOdd(myinteger.get());
	}
	public static boolean isPrime(MyInteger myinteger){
		return myinteger.isPrime(myinteger.get());
	}
	
	// equals methods
	public boolean isEqual(int kValue){
		return iValue == kValue;
	}
	public boolean isEqual(MyInteger myinteger){
		return isEqual(myinteger.get());
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
