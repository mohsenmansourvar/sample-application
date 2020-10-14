package com.sampleapplication.service;

import com.sampleapplication.domain.Room;

import java.util.List;

public interface RoomService {

    void save(Room room);

    void update(long id, Room newRoom);

    void delete(long id);

    Room getById(long id);

    List<Room> getAllRooms();
}
