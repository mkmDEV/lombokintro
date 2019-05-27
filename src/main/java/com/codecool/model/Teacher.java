package com.codecool.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

    @NonNull
    private String name;
    @Singular
    @EqualsAndHashCode.Exclude
    private List<Student> students = new ArrayList<>();
}
