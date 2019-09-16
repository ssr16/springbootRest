package com.example.bootrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource 
{
	@Autowired
	ActorRepository repo;
	
	
	@RequestMapping("actors")
	public List<Actor> getActors()
	{
		List<Actor> actorList = (List<Actor>) repo.findAll();
		
		
		
		
		
		return actorList;
		
	}
	
	@RequestMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> alList = new ArrayList<Alien>();
		
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("Rup");
		a1.setPoints(90);
		
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setName("Chiks");
		a2.setPoints(91);
		
		alList.add(a1);
		alList.add(a2);
		
		
		
		return alList;
		
	}
	

}
