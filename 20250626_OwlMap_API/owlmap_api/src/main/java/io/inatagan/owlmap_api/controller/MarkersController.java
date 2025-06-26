package io.inatagan.owlmap_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.inatagan.owlmap_api.model.Markers;
import io.inatagan.owlmap_api.repository.MarkersRepository;
import jakarta.validation.Valid;

@RestController
public class MarkersController {

    @Autowired
    MarkersRepository markersRepository;

    @GetMapping("/markers")
    List<Markers> getAllMarkers() {
        return markersRepository.findAll();
    }
    
    @GetMapping("/markers/{id}")
    public Optional<Markers> getMarkerById(@PathVariable Long id) {
        return markersRepository.findById(id);
    }
    
    @PostMapping("/markers")
    public Markers postNewMarker(@Valid @RequestBody Markers entity) {
        return markersRepository.save(entity);
    }
    
    @DeleteMapping("/markers/{id}")
    public void deleteMarker(@PathVariable Long id) {
        markersRepository.deleteById(id);
    }

    @PutMapping("/markers/{id}")
    public Markers putMarker(@PathVariable Long id, @RequestBody Markers entity) {
        return markersRepository.findById(id).map(markers -> {
            markers.setName(entity.getName());
            return markersRepository.save(markers);
        }).orElseGet(() -> {
            entity.setId(id);
            return markersRepository.save(entity);
        });
    }
}
