package com.switchfully.petinderminimal.service;

import com.switchfully.petinderminimal.model.PetDTO;
import com.switchfully.petinderminimal.model.PetMapper;
import com.switchfully.petinderminimal.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
  private PetMapper petMapper;
  private PetRepository petRepository;

  public PetService(PetMapper petMapper, PetRepository petRepository) {
    this.petMapper = petMapper;
    this.petRepository = petRepository;
  }

  public List<PetDTO> getAllPets() {
    return petMapper.toDTO(petRepository.getAllPets());
  }
}
