package com.sampleapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "blog", type = "room")
public class Room {

    @Id
    private Long id;

    private String classNumber;

    private int capacity;
}
