package com.gmail.apachdima.desirejob.commonservice.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequestDTO {

    @Size(min = 2, max = 50)
    private String firstName;

    @Size(min = 2, max = 50)
    private String lastName;
}
