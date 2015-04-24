package _11;

import java.util.ArrayList;
import java.util.List;

public class TestGerbil {

	public static void main(String[] args) {
		List<Gerbil> gerbils = new ArrayList<Gerbil>();
		gerbils.add(new Gerbil(0));
		gerbils.add(new Gerbil(1));
		gerbils.add(new Gerbil(2));
		for(int i=0; i< gerbils.size(); i++){
			gerbils.get(i).hop();
		}
	}

}
