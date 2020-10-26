package com.sampleapplication.controller;

import com.sampleapplication.domain.Room;
import com.sampleapplication.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@AllArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @PutMapping(value = "/room")
    public void save(@RequestBody Room room) {
        roomService.save(room);
    }

    @GetMapping(value = "/room/{id}")
    public Room getById(@PathVariable("id") long id) {
        return roomService.getById(id);
    }

    @DeleteMapping(value = "/room/{id}")
    public void delete(@PathVariable("id") long id) {
        roomService.delete(id);
    }

    @PostMapping(value = "/room/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Room newRoom) {
        roomService.update(id, newRoom);
    }

    @GetMapping(value = "/rooms")
    public Iterable<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}
