package com.switchfully.petinderminimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller", "services", "configure"}) // This is what you need
@EntityScan("com.switchfully.petinderminimal")
public class PetinderMinimalApplication {

  public static void main(String[] args) {
    SpringApplication.run(PetinderMinimalApplication.class, args);
  }
// in postman use https://keycloak.switchfully.com/auth/realms/<YourRealmName>/protocol/openid-connect/token
}
