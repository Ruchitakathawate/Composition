import java.util.*;
class TissueBox
{
	private int capacity;
	private String color;

	TissueBox(int capacity,String color)
	{
	this.capacity=capacity;
	this.color=color;
	}

	public int getCapacity()
	{
	return this.capacity;
	}
   public String getColor()
		{
		return this.color;
		}
}

class  Tissue
{
	private String color;
	private String material;
	Tissue(String color,String material)
	{
	this.color=color;
	this.material=material;
	}
	public String getColor()
	{
	return this.color;
	}
	public String getMaterial()
	{
	return this.material;
	}
	
}

public class Composition
{
	public static void main(String[] args) 
	{
	TissueBox t1=new TissueBox(20,"Blue");
	System.out.println(t1.getColor()+" TissueBox has a "+t1.getCapacity()+" Tissues");

	Tissue t=new Tissue("White","Paper");
	System.out.println(t1.getColor()+" TissueBox has a "+t1.getCapacity()+" "+t.getColor()+" Tissues "+" and they are made from "+t.getMaterial());
	}
}
