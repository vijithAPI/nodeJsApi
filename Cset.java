

import java.util.ArrayList;
import java.util.List;

public class Cset {
	
	public static void main(String[] args)
	{
			List <Compos> group = new ArrayList <Compos>();
Compos c =new Compos("tarun",10);
Compos c1 =new Compos("kiran",20);
Compos c2 =new Compos("arun",30);
group.add(c);
group.add(c1);
group.add(c2);
System.out.println("");
int sum=0;
for(Compos  p : group) {
	System.out.println(p.getComptname());	
sum+=p.comptprice;
		
}
System.out.println(sum);


}
}
