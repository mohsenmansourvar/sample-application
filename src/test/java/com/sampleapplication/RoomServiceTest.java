package com.sampleapplication;

import com.sampleapplication.domain.Room;
import com.sampleapplication.service.RoomService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, value = "/sql/cleanup.sql")
public class RoomServiceTest {
    @Autowired
    private RoomService roomService;

    @Test
    public void save() {
        Room room = Room.builder()
                .classNumber("125")
                .capacity(45)
                .build();
        roomService.save(room);

        Room roomById = roomService.getById(room.getId());

        assertEquals("125", roomById.getClassNumber());
        assertEquals(45, roomById.getCapacity());
    }

    @Test
    public void delete() {
        Room room = Room.builder()
                .classNumber("125")
                .capacity(45)
                .build();
        roomService.save(room);

        roomService.delete(room.getId());

        assertThrows(IllegalArgumentException.class, () -> roomService.getById(room.getId()));
    }

    @Test
    public void update() {
        Room room = Room.builder()
                .classNumber("125")
                .capacity(45)
                .build();
        roomService.save(room);

        Room updatedRoom = Room.builder()
                .classNumber("126")
                .build();
        roomService.update(room.getId(), updatedRoom);

        Room roomById = roomService.getById(room.getId());

        assertNotNull(roomById);
        assertEquals("126", roomById.getClassNumber());
        assertEquals(45, roomById.getCapacity());
    }

    @Test
    public void getAllRooms() {
        Room room1 = Room.builder()
                .classNumber("125")
                .capacity(45)
                .build();
        roomService.save(room1);

        Room room2 = Room.builder()
                .classNumber("120")
                .capacity(40)
                .build();
        roomService.save(room2);

        List<Room> allRooms = roomService.getAllRooms();

        assertNotNull(allRooms);
        assertEquals(2, allRooms.size());
    }
}
