package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Room;

import com.example.demo.repositary.RoomRepository;

public class RoomServiceImp implements RoomService{
	@Autowired
	private RoomRepository roRep;
	@Override
	public Room createHotel(Room room) {
		// TODO Auto-generated method stub
		return roRep.save(room);
	}

	@Override
	public Room getHotelById(Long id) {
		Optional<Room> optionaluser= roRep.findById(id);
		return optionaluser.get();
	}

	@Override
	public List<Room> getAllRoom() {
		// TODO Auto-generated method stub
		return roRep.findAll();
	}

	@Override
	public Room updateRoom(Room room) {
		// TODO Auto-generated method stub
		return roRep.save(room);
	}

	@Override
	public void deleteRoom(Long id) {
		// TODO Auto-generated method stub
		roRep.deleteById(id);	
	}
	

}
