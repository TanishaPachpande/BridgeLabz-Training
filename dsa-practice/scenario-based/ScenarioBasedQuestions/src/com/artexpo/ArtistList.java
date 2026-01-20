package com.artexpo;

import java.util.ArrayList;

public class ArtistList {
	ArrayList<Artist> artists =  new ArrayList<>();
	

	public void addArtist(Artist a) {
		artists.add(a);
		
		int i = artists.size()-1;
		Artist key = artists.get(i);
		
		int j=i-1;
		while(j>=0 && (artists.get(j).time > key.time)) {
			artists.set(j+1, artists.get(j));
			j--;
		}
		
		artists.set(j+1, key);
		System.out.println("Artist added");
	}
	
	public void display() {
		for(Artist i: artists) {
			System.out.println(i.name +" registered at "+ i.time);
		}
	}
}
