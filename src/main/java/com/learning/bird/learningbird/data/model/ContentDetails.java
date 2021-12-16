package com.learning.bird.learningbird.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "contentdetails_id_seq", sequenceName = "contentdetails_id_seq", allocationSize = 1)
@Table(name = "learn_content_details")
public class ContentDetails {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contentdetails_id_seq")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "brief")
    private String brief;

    @Column(name = "content_type_id")
    private Long contentTypeId;

    @Column(name = "course_subject_chapter_topic_subtopic_id")
    private Long subTopicId;

    @Column(name = "course_subject_chapter_topic_id")
    private Long topicId;

    @Column(name = "course_subject_chapter_id")
    private Long chapterId;

    @Column(name = "course_subject_id")
    private Long subjectId;

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "content_url")
    private String cotentUrl;
}
