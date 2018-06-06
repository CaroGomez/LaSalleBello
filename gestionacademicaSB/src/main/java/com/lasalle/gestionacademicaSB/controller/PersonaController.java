/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.controller;

/**
 *
 * @author Alexis Herrera
 */
import com.lasalle.gestionacademicaSB.dto.PersonaDto;
import com.lasalle.gestionacademicaSB.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/gestionacademica/")
@Validated
public class PersonaController {
   private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/persona/")
    public ResponseEntity<PersonaDto> create(@RequestBody @Valid PersonaDto personaDTO) throws Exception {
        PersonaDto personaCreate = personaService.create(personaDTO);
        return new ResponseEntity<PersonaDto>(personaCreate, null, HttpStatus.CREATED);
    }

    @PutMapping("/persona/{id}")
    public PersonaDto update(@RequestBody @Valid PersonaDto personaDTO) {
        return personaService.update(personaDTO);
    }

    @GetMapping("/personas/")
    public List<PersonaDto> findAll() {
        return personaService.findAll();
    }

    @Validated
    @GetMapping("/persona/{id}")
    public PersonaDto findById(
            @PathVariable @NotNull @Valid Long id) {
        return personaService.findById(id);
    }

    @DeleteMapping("/persona/{id}")
    public void delete(@PathVariable Long id) {
        personaService.delete(id);
    }
}
