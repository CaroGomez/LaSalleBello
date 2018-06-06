/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasalle.gestionacademicaSB.controller;

import com.lasalle.gestionacademicaSB.dto.NotaDto;
import com.lasalle.gestionacademicaSB.service.NotaService;
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
public class NotaController {
   private NotaService notaService;

    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @PostMapping("/nota/")
    public ResponseEntity<NotaDto> create(@RequestBody @Valid NotaDto notaDTO) throws Exception {
        NotaDto notaCreate = notaService.create(notaDTO);
        return new ResponseEntity<NotaDto>(notaCreate, null, HttpStatus.CREATED);
    }

    @PutMapping("/nota/{id}")
    public NotaDto update(@RequestBody @Valid NotaDto notaDTO) {
        return notaService.update(notaDTO);
    }

    @GetMapping("/nota/")
    public List<NotaDto> findAll() {
        return notaService.findAll();
    }

    @Validated
    @GetMapping("/nota/{id}")
    public NotaDto findById(
            @PathVariable @NotNull @Valid Long id) {
        return notaService.findById(id);
    }

    @DeleteMapping("/nota/{id}")
    public void delete(@PathVariable Long id) {
        notaService.delete(id);
    }
}