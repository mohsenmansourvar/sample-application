package com.sampleapplication.service;

import com.sampleapplication.domain.Room;
import com.sampleapplication.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    @Transactional
    public void save(Room room) {
        roomRepository.save(room);
    }

    @Override
    @Transactional
    public void update(long id, Room newRoom) {
        Room room = getById(id);

        if (newRoom.getClassNumber() != null) {
            room.setClassNumber(newRoom.getClassNumber());
        }
        if (newRoom.getCapacity() != 0) {
            room.setCapacity(newRoom.getCapacity());
        }
        roomRepository.save(room);
    }

    @Override
    @Transactional
    public void delete(long id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room getById(long id) {
        return roomRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("no room found by id"));
    }

    @Override
    public Iterable<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public static void main(String[] args) {
        String name = "M";
        Calendar.getInstance().getTime();
        String a = "200";
        int i = Integer.parseInt(a);
        Integer integer = Integer.valueOf(a);
        Optional<String> opt = Optional.of(name);
        if (opt.isPresent()){
            System.out.println(opt);
        }else {
            System.out.println("empty");
        }

    }
}
