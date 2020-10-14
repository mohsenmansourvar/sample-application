package com.sampleapplication.service;

import com.sampleapplication.domain.Room;

import java.util.List;

public interface RoomService {
    void save(Room room);

    Room getById(long id);

    void delete(long id);

    void update(long id, Room newRoom);

    List<Room> getAllRooms();
}
