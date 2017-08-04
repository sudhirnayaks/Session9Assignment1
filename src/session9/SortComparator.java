package session9;

import java.util.Comparator;

public class SortComparator implements Comparator<HDTV>{

	@Override
	public int compare(HDTV o1, HDTV o2) {
		if(o1.getSize()>o2.getSize()){
			return 1;
		}
		else{
			return -1;
		}
	}

}
