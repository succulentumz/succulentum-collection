package com.example.demo.api.controller;

import com.example.demo.api.dto.AckResponse;
import com.example.demo.api.dto.CreatePlantRequest;
import com.example.demo.api.dto.PlantResponse;
import com.example.demo.api.dto.UpdatePlantRequest;
import com.example.demo.api.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/plant")
public class CollectionController {
    private final PlantService plantService = null;  //temp initialization

    //public CollectionController(PlantService plantService) {  //need to create beans
    //    this.plantService = plantService;
    //}

    @PostMapping
    public AckResponse createPlant(@RequestBody CreatePlantRequest createPlantRequest) {
        return plantService.createPlant(createPlantRequest);
    }

    @GetMapping
    public PlantResponse getPlant(@PathVariable Long id) {
        return plantService.getPlant(id);
    }

    @DeleteMapping("/{id}")
    public AckResponse deletePlant(@PathVariable Long id) {
        return plantService.deletePlant(id);
    }

    @PatchMapping("/{id}")
    public AckResponse editPlant(@RequestBody UpdatePlantRequest updatePlantRequest) {
        return plantService.editPlant(updatePlantRequest);
    }
}
