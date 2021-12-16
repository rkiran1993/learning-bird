package com.learning.bird.learningbird.data.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "chapter_id_seq", sequenceName = "chapter_id_seq", allocationSize = 1)
@Table(name = "course_subject_chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chapter_id_seq")
    private Long id;

    @Column(name = "course_subject_id")
    private Long subjectId;

    @Column(name = "title")
    private String title;
}
