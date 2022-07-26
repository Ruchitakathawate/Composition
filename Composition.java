class TissueBox
{
	public void print()
	{
	System.out.println("This is Tissue box");
	}
}

class  Tissue
{
	private int no_of_tissues;

	Tissue(int t)
	{
	no_of_tissues=t;
	}

	public int get()
	{
	return no_of_tissues;
	}
}

public class Composition
{
	public static void main(String[] args) 
	{
	TissueBox t1=new TissueBox();
	t1.print();
	Tissue t=new Tissue(10);

	System.out.println("TissueBox has a "+t.get()+" Tissues");
	}
}
