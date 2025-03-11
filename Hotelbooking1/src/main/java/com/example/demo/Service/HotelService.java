package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;


@Service
public interface HotelService {
	Hotel createHotel(Hotel hotel);
	Hotel getHotelById(Long id);
	List <Hotel> getAllHotel();
	Hotel updateHotel(Hotel hotel);
	void deleteHotel(Long id);

}
