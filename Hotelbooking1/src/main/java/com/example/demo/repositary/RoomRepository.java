package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Room;

public interface RoomRepository extends JpaRepository<Room,Long> {

}
