package com.studentinformation.Student.ElasticRepository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.studentinformation.Student.ESentity.Student;

@Repository
public interface ESRepo extends ElasticsearchRepository<Student, Long> {

}
