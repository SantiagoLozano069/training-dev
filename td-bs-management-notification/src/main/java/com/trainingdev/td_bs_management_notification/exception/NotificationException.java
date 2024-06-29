package com.trainingdev.td_bs_management_notification.exception;

import lombok.Getter;

@Getter
public class NotificationException extends RuntimeException  {

    private String code;

    public NotificationException(String code, String message) {
        super(message);
        this.code = code;
    }
}
