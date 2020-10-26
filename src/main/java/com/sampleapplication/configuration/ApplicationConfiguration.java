package com.sampleapplication.configuration;

import com.sampleapplication.repository.RoomRepository;
import com.sampleapplication.repository.StudentRepository;
import com.sampleapplication.repository.TeacherRepository;
import com.sampleapplication.service.RoomServiceImpl;
import com.sampleapplication.service.StudentServiceImpl;
import com.sampleapplication.service.TeacherServiceImpl;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public RoomServiceImpl classService(RoomRepository roomRepository) {
        return new RoomServiceImpl(roomRepository);
    }

    @Bean
    public StudentServiceImpl studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public TeacherServiceImpl teacherService(TeacherRepository teacherRepository) {
        return new TeacherServiceImpl(teacherRepository);
    }

    @Bean
    public RestHighLevelClient client() {
        ClientConfiguration clientConfiguration
                = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchRestTemplate(client());
    }
}
