/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.service;

import com.lasalle.gestionacademicaSB.dto.NotaDto;
import com.lasalle.gestionacademicaSB.entity.Nota;
import com.lasalle.gestionacademicaSB.repository.NotaRepository;
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
public class NotaService {
   
   private static final Logger LOGGER = LoggerFactory.getLogger(NotaService.class);
   
   private NotaRepository notaRepository;
   
   @Autowired
   private ModelMapper modelMapper;
   
   public NotaService(NotaRepository notaRepository){
	  this.notaRepository = notaRepository;
   }
   
   public NotaDto create(NotaDto notaToCreateDto) {
	  LOGGER.debug("Inicia creación: notaToCreateDto={}", notaToCreateDto);

	  Nota notaToCreate = modelMapper.map(notaToCreateDto, Nota.class);
	  Nota result = notaRepository.save(notaToCreate);
	  NotaDto resultDTO = modelMapper.map(result, NotaDto.class);

	  LOGGER.debug("Finaiza creación: resultDTO={}", resultDTO);
	  return resultDTO;
   }
   
   public List<NotaDto> findAll() {
        List<Nota> listNotes = (List<Nota>) notaRepository.findAll();
        return listNotes.stream()
                .map(nota -> modelMapper.map(nota, NotaDto.class))
                .collect(Collectors.toList());
    }

   public NotaDto findById(Long id) {
	   Optional<Nota> findNotaOptional = notaRepository.findById(id);
	   Nota findNota = findNotaOptional.orElseThrow(EntityNotFoundException::new);
	   return modelMapper.map(findNota, NotaDto.class);
   }

   public void delete(Long id) {
	   NotaDto notaInDb = findById(id);
	   Nota notaToDelete = modelMapper.map(notaInDb, Nota.class);
	   notaRepository.delete(notaToDelete);
   }

   public NotaDto update(NotaDto notaDto) {
	   findById(notaDto.getId());
	   return create(notaDto);
   }
   
   
}
