package net.javaguides.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotEmpty(message = "User First name cannot be empty or null")
    private String firstName;

    @NotEmpty(message = "User Last name cannot be empty or null")
    private String lastName;

    @NotEmpty(message = "User email cannot be empty or null and must be well formed")
    @Email(message = "User email must be well formed")
    private String email;
}
