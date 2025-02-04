package com.practice.service;
import com.practice.dto.ProjectDTO;
import com.practice.entity.Project;
import com.practice.repository.ProjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private  ModelMapper modelMapper;

    @Override
    public ProjectDTO deleteProject(Integer id) {

        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + id));

        projectRepository.delete(project);
        return modelMapper.map(project, ProjectDTO.class);

    }


}




