package io.github.jojodevelops.resumebuilder.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ContactData implements Serializable {
    String email;
    String firstName;
    String lastName;
    String phoneNo;
}
