package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDTO model information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @Schema(
            description = "User First Name"
    )
    @NotEmpty(message = "User First name cannot be empty or null")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    @NotEmpty(message = "User Last name cannot be empty or null")
    private String lastName;

    @Schema(
            description = "User Email"
    )
    @NotEmpty(message = "User email cannot be empty or null and must be well formed")
    @Email(message = "User email must be well formed")
    private String email;
}
