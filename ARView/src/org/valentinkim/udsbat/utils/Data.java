package org.valentinkim.udsbat.utils;

public class Data {
	

	private static String[] places = new String[] {"SF Art Commission", "SF Dept. of Public Health", "SF Ethics Comm", "SF Conservatory of Music", "All Star Cafe", 
			"Magic Curry Cart", "SF SEO Marketing", " SF Honda", "SF Mun Transport Agency", "SF Parking Citation", "Mayors Office of Housing", "SF Redev Agency", "Catario Patrice", "Bank of America", 
			"SF Retirement System", "Bank of America Mortage", "Writers Corp.", "Van Nes Keno Mkt."};
	
	private static double[] latitudes = new double[] {37.775672, 37.775729, 37.775578, 37.77546, 37.775199, 37.774887, 37.774637, 
			37.774614, 37.774406, 37.774754, 37.774813, 37.774961, 37.774957, 37.775171, 37.775996, 37.775818, 37.775691, 37.775909};
	private static double[] longitudes = new double[] {-122.419992, -122.419601, -122.419719, -122.42026, -122.419646, -122.419405, -122.42037, 
			-122.41934, -122.41886, -122.418785, -122.418581, -122.418868, -122.418064, -122.418884, -122.418898, -122.418305, -122.418895, -122.419161};
	
	//Aim get these data from remote server
	public static String[] getPlaces(){
		return places;
	}
	
	public static double[] getLatitudes(){
		return latitudes;
	}
	
	public static double[] getLongitudes(){
		return longitudes;
	}
}
