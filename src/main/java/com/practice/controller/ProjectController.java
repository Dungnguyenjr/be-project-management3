package com.practice.controller;
import com.practice.dto.ProjectDTO;
import com.practice.entity.Project;
import com.practice.repository.ProjectRepository;
import com.practice.req.ProjectCreateReq;
import com.practice.service.ProjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Project Controller")
@Slf4j
@RestController
@RequestMapping("api/project")
@CrossOrigin("*")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createTopic(@RequestBody ProjectCreateReq projectCreateReq) {
        Project project = new Project();
        project.setProjectName(projectCreateReq.getProjectName());
        project.setDescription(projectCreateReq.getDescription());
        project.setStatus(projectCreateReq.getStatus());
        project.setCreateDate(projectCreateReq.getCreateDate());
        Project savedProject = projectRepository.save(project);
        return new ResponseEntity<>(savedProject, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ProjectDTO deleteProject(@PathVariable Integer id){
        return  projectService.deleteProject(id);
    }

}
