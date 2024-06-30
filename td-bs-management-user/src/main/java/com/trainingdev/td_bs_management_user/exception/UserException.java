package com.trainingdev.td_bs_management_user.exception;

import lombok.Getter;

@Getter
public class UserException extends RuntimeException  {

    private String code;

    public UserException(String code, String message) {
        super(message);
        this.code = code;
    }
}
