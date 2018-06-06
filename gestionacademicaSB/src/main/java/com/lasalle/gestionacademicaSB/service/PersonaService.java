/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.service;

import com.lasalle.gestionacademicaSB.dto.PersonaDto;
import com.lasalle.gestionacademicaSB.entity.Persona;
import com.lasalle.gestionacademicaSB.repository.PersonaRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Alexis Herrera
 */
@Service
public class PersonaService {
   
   private static final Logger LOGGER = LoggerFactory.getLogger(PersonaService.class);

    private PersonaRepository personaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public PersonaDto create(PersonaDto personaToCreateDto) {
        LOGGER.debug("Inicia creación: personaToCreateDto={}", personaToCreateDto);

        Persona personaToCreate = modelMapper.map(personaToCreateDto, Persona.class);
        Persona result = personaRepository.save(personaToCreate);
        PersonaDto resultDTO = modelMapper.map(result, PersonaDto.class);

        LOGGER.debug("Finaiza creación: resultDTO={}", resultDTO);
        return resultDTO;
    }

    public List<PersonaDto> findAll() {
        List<Persona> listPeople = (List<Persona>) personaRepository.findAll();
        return listPeople.stream()
                .map(persona -> modelMapper.map(persona, PersonaDto.class))
                .collect(Collectors.toList());
    }

    public PersonaDto findById(Long id) {
        Optional<Persona> findPersonaOptional = personaRepository.findById(id);
        Persona findPersona = findPersonaOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findPersona, PersonaDto.class);
    }

    public void delete(Long id) {
        PersonaDto personaInDb = findById(id);
        Persona personaToDelete = modelMapper.map(personaInDb, Persona.class);
        personaRepository.delete(personaToDelete);
    }

    public PersonaDto update(PersonaDto personaDto) {
        findById(personaDto.getId());
        return create(personaDto);
    }
}
