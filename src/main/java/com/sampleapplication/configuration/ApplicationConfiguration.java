package com.sampleapplication.configuration;

import com.sampleapplication.repository.RoomRepository;
import com.sampleapplication.repository.StudentRepository;
import com.sampleapplication.repository.TeacherRepository;
import com.sampleapplication.service.RoomServiceImpl;
import com.sampleapplication.service.StudentServiceImpl;
import com.sampleapplication.service.TeacherServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    /*@Bean(name = "entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource, Properties properties) {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setPackagesToScan("com.education.domain");
        localSessionFactoryBean.setHibernateProperties(properties);
        return localSessionFactoryBean;
    }*/
}


