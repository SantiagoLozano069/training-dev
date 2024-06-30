package com.trainingdev.td_bs_management_user.dto.input;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {

    @NotNull
    private Integer id;

    private String name;

    private String birthday;

    private String email;

    private String password;

    private String gender;

    private String profilePhoto;

    private String coverPhoto;

    private LocalDateTime creationDate;

    private LocalDateTime modificationDate;
}
