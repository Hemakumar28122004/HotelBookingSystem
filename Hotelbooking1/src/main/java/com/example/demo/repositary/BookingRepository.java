package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
