package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Landmark;

public interface LandmarkDAO {
	
	List<Landmark> allLandmarks();
		
	Landmark findLandmarkByName (String name);
	
	Landmark findLandmarkByVenueType (String venueType);
	
	int findIdByLandmarkName (String name);

	List<Landmark> searchLandmarks(String day, String location, String venueType, String currentTime);

	List<String> allCities();

	List<Landmark> getLandmarkByCity(String location);
	
	

}
