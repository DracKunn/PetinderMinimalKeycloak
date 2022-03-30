package com.switchfully.petinderminimal.api;

import com.switchfully.petinderminimal.model.PetDTO;
import com.switchfully.petinderminimal.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pets")
public class PetController {
  private PetService petService;

  public PetController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping(path = "hello", produces = "application/json")
  public String helloWorld() {
    return "Hello world 3!";
  }
}
