package com.gmail.apachdima.desirejob.commonservice.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SignInRequestDTO {
    @NotBlank
    private String grantType;
    @NotBlank
    private String clientId;
    @NotBlank
    private String clientSecret;
    @NotBlank
    private String scope;
    @NotBlank
    @Size(min = 2, max = 50)
    private String userName;
    @Size(min = 2, max = 50)
    private String password;
}
