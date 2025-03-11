package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Room;

@Service
public interface RoomService {
	Room createHotel(Room room);
	Room getHotelById(Long id);
	List <Room> getAllRoom();
	Room updateRoom(Room room);
	void deleteRoom(Long id);
}
