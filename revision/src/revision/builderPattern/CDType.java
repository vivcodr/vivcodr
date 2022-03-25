package revision.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {

	private List<Packaging> items = new ArrayList<Packaging>(); 

	public void addItem(Packaging packs) {    
		items.add(packs);  
	}  
	public void getCost(){  
		for (Packaging packs : items) {  
			packs.price();  
		}   
	}  
	public void showItems(){  
		for (Packaging packing : items){  
			System.out.print("CD name : "+packing.pack());  
			System.out.println(", Price : "+packing.price());  
		}       
	} 

}
