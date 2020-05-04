/*
nama : ilfah sahra
tanggal : 5 april 2020
waktu : 16.00
*/

public class Test
{ public static int counter = 0;
public Test()
{ counter += 1; }
public int getCounter()
{ return counter; }
public void addCounter()
{ counter+=1; }
}

public class MainInside
{
public static void main(String[] args)
{
Test obj1 = new Test();
Test obj2 = new Test();
Test obj3 = new Test();
obj1.addCounter();
System.out.println("Counter milik obj1 = " + obj1.getCounter());
System.out.println("Counter milik obj2 = " + obj2.getCounter());
System.out.println("Counter milik obj3 = " + obj3.getCounter());