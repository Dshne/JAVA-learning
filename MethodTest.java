public class MEthodTest
{
	public static void main(String[] args)
	{ 
		// 自上而下执行
		sumInt(100,200);//方法调用
		sumInt(666,888);
	}

	//定义方法,方法定义在类体中
	public static void sumInt(int x, int y)
	{
		int z = x + y;
		System.out.println(z);
	}
}