package risk.main;

import risk.home.Homecontroller;
import risk.home.Homemodel;
import risk.home.Homeview;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homeview theView = new Homeview();
		Homemodel theModel = new Homemodel();
		Homecontroller theController = new Homecontroller(theView, theModel);
	}

}

