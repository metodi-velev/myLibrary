package com.kaufland.myLibrary.services;

import com.kaufland.myLibrary.dto.StoryDTO;
import com.kaufland.myLibrary.dto.StoryDetailDTO;

import java.util.List;

public interface StoryService {
    List<StoryDTO> allStories();
    StoryDetailDTO findStoryById(Long id);
}
