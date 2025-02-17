package org.renuka.sample.myapp.controller;

import org.renuka.sample.myapp.rest.api.v1.PetApi;
import org.renuka.sample.myapp.rest.api.v1.dto.PetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
public class PetController implements PetApi {
    @Autowired
    NativeWebRequest request;

    @Override
    public ResponseEntity<PetDTO> getPetById(Long petId) {
        PetDTO petDTO = new PetDTO();
        petDTO.setId(petId);
        petDTO.setName("Tommy");
        return ResponseEntity.ok(petDTO);
    }
}
