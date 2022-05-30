/*
	1.方法的定义，语法机制

	[修饰符列表] 返回值类型 方法名(形式参数// int x)
	{
		方法体
	}
	[]内的内容不是必须的，是可选的
	返回值类可以是任何类型 返回值指一个方法执行结束后的结果
	若无返回值则放回值类型必须写上void关键字
*/
public class MethodTest2
{
	public static void main(String[] args)
	{
		MethodTest2.divide(4,2);
	}
	public static int divide(int x, int y)
	{
		return x/y;
	}
}