package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entity.Booking;
import com.example.demo.repositary.BookingRepository;

public class BookingServiceImp implements BookingService{
	@Autowired
private BookingRepository Br;
	@Override
	public Booking createBooking(Booking booking) {
		
		return Br.save(booking);
	}

	@Override
	public Booking getBookingById(Long id) {
		// TODO Auto-generated method stub
		Optional<Booking> op=Br.findById(id);
		return op.get(); 
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return Br.findAll();
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return Br.save(booking);
	}

	@Override
	public void deleteBooking(Long id) {
		// TODO Auto-generated method stub
		Br.deleteById(id);
	}

}
