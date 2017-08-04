package session9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HDTV> list = new ArrayList<>();
		
		list.add(new HDTV("HAIER", 21));
		list.add(new HDTV("SAMSUNG",25));
		list.add(new HDTV("SONY", 30));
		
		Collections.sort(list, new SortComparator());
		
		for(HDTV hdtv:list){
			System.out.println(hdtv);
		}
		

	}

}
