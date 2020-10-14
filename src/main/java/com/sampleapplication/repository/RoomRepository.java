package com.sampleapplication.repository;

import com.sampleapplication.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
