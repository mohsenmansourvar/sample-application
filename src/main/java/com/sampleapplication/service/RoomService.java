package com.sampleapplication.service;

import com.sampleapplication.domain.Room;

import java.util.Iterator;

public interface RoomService {

    void save(Room room);

    void update(long id, Room newRoom);

    void delete(long id);

    Room getById(long id);

    Iterable<Room> getAllRooms();
}
