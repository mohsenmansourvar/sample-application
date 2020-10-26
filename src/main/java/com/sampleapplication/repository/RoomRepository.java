package com.sampleapplication.repository;

import com.sampleapplication.domain.Room;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RoomRepository extends ElasticsearchRepository<Room, Long> {
}
