package com.example.demo.api.controller;

import com.example.demo.api.dto.CreatePlantRequest;
import com.example.demo.api.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/plant")
public class CollectionController {
    private final PlantService plantService;

    public CollectionController(PlantService plantService) {  //need to create beans
        this.plantService = plantService;
    }

    @PostMapping
    public CreatePlantRequest createPlant(@RequestBody CreatePlantRequest createPlantRequest) {
        return plantService.createPlant(createPlantRequest);
    }

    @GetMapping
    public CreatePlantRequest getPlant(@PathVariable String id) {
        return plantService.getPlant(id);
    }

    @DeleteMapping("/{id}")
    public String deletePlant(@PathVariable Long id) {
        return plantService.deletePlant(id);
    }

    @PatchMapping("/{id}")
    public CreatePlantRequest editPlant(@PathVariable Long id, @RequestBody CreatePlantRequest editPlantRequest) {
        return plantService.editPlant(id, editPlantRequest);
    }
}
