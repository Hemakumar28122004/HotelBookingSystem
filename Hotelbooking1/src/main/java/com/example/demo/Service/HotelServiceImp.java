package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entity.Hotel;

import com.example.demo.repositary.HotelRepository;

public class HotelServiceImp implements HotelService {
@Autowired
private HotelRepository hoRep;
	@Override
	public Hotel createHotel(Hotel hotel) {
		
		return hoRep.save(hotel);
	}

	@Override
	public Hotel getHotelById(Long id) {
		// TODO Auto-generated method stub
		Optional<Hotel> optionaluser= hoRep.findById(id);
		return optionaluser.get();
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hoRep.findAll();
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hoRep.save(hotel);
	}

	@Override
	public void deleteHotel(Long id) {
		hoRep.deleteById(id);
		
	}

}
