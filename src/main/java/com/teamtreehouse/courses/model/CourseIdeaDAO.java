package com.teamtreehouse.courses.model;

import java.util.List;

/**
 * Created by Daniel on 6/12/2017.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
