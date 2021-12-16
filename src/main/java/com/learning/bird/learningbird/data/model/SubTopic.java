package com.learning.bird.learningbird.data.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "subtopic_id_seq", sequenceName = "subtopic_id_seq", allocationSize = 1)
@Table(name = "course_subject_chapter_topic_subtopic")
public class SubTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subtopic_id_seq")
    private Long id;

    @Column(name = "course_chapter_topic")
    private Long chapterTopic;

    @Column(name = "title")
    private String title;
}
