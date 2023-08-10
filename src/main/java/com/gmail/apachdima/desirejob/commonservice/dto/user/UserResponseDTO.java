package com.gmail.apachdima.desirejob.commonservice.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserResponseDTO {

    private String userId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private boolean enabled;
    private LocalDateTime createdAt;
    private Set<String> roles;
}
