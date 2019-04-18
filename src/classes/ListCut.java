package classes;

import java.util.ArrayList;
import java.util.List;

public class ListCut {

	
	
	
	public ListCut() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public List<List<Integer>> partition(List<Integer> l, int taille)
	{
		
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		
		int length0 = Math.floorDiv(l.size(), taille);
		int k = 0;
		
		for(int i=0;i<length0;i++)
		{

			List<Integer> LL = new ArrayList<Integer>();
			for(int j=0;j<taille;j++)
			{
				LL.add(l.get(k++));
			}
			L.add(LL);		
		}
		if(l.size()%taille!=0)
		{			
		List<Integer> LLL = new ArrayList<Integer>();
		for(int i=0;i<l.size()%taille;i++)
		{
			LLL.add(l.get(k++));
		}
		L.add(LLL);
			
		}

	
		return L;
	}
	
}
