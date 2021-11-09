// Create a base class Fruit which has name, taste and size as its attributes. A method called eat() is created which describes the name of the fruit and its taste.
//   Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

class specs
{
	String name, taste,size;
	specs(String n,String t,String s){
		this.name = n;
		this.taste = t;
		this.size = s;
	}

	public void eat()
	{
		System.out.println(name + " tastes " + taste);
	}
}
class Apple extends specs
{
	Apple(String n,String t,String s)
	{
		super(n,t,s);
	}
	public void print()
	{
		super.eat();
	}
}
class Orange extends specs
{
	Orange(String n,String t,String s)
	{
			super(n,t,s);
	}
	public void print()
	{
		super.eat();
	}
}
public class Fruit
{
	public static void main(String args[])
	{
		Apple obj1 = new Apple("Apple", "sweet", "big");
		Orange obj2 = new Orange("Orange", "bitter", "small");
		obj1.print();
		obj2.print();
	}
}