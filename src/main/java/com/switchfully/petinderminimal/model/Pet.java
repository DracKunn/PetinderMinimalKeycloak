package com.switchfully.petinderminimal.model;

public class Pet {
  private Long id;
  private String name;
  private Kind kind;
  private String profileText;

  public Pet(Long id, String name, Kind kind, String profileText) {
    this.id = id;
    this.name = name;
    this.kind = kind;
    this.profileText = profileText;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Kind getKind() {
    return kind;
  }

  public String getProfileText() {
    return profileText;
  }
}
