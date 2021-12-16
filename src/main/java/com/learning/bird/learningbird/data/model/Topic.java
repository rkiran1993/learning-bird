package com.learning.bird.learningbird.data.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "topic_id_seq", sequenceName = "topic_id_seq", allocationSize = 1)
@Table(name = "course_subject_chapter_topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topic_id_seq")
    private Long id;

    @Column(name = "course_chapter_id")
    private Long chapterId;

    @Column(name = "title")
    private String title;
}
