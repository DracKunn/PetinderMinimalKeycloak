package com.switchfully.petinderminimal.repository;

import com.switchfully.petinderminimal.model.Kind;
import com.switchfully.petinderminimal.model.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetRepository {
  public List<Pet> getAllPets() {
    return List.of(new Pet(1L, "Kamiel", Kind.CAT, "I'm a floofball"), new Pet(2L, "Oscar", Kind.CAT, "King of the castle"));
  }
}
