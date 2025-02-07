package com.kyawgyi.gradle_test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@NoArgsConstructor
@Getter
@Data

public class Student {
    
    @Id
    private Long id;
    private String name;
    private String email;
}
