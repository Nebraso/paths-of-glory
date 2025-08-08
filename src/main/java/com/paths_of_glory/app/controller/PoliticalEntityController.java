package com.paths_of_glory.app.controller;

import com.paths_of_glory.app.dto.*;
import com.paths_of_glory.app.service.PoliticalEntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/political-entities")
public class PoliticalEntityController {

    private final PoliticalEntityService service;

    public PoliticalEntityController(PoliticalEntityService service) {
        this.service = service;
    }

    @PostMapping
    public PoliticalEntityResponse create(@RequestBody PoliticalEntityCreateRequest request) {
        return service.create(request);
    }

    @PutMapping
    public PoliticalEntityResponse update(@RequestBody PoliticalEntityUpdateRequest request) {
        return service.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/{id}")
    public PoliticalEntityResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<PoliticalEntityResponse> getAll() {
        return service.getAll();
    }
}
