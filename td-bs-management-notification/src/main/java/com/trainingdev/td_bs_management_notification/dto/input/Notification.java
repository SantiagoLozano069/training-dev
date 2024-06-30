package com.trainingdev.td_bs_management_notification.dto.input;

import com.trainingdev.td_bs_management_notification.enums.NotificationTypeEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    @NotNull(message = "Sender user ID cannot be null")
    private Integer senderUserId;

    @NotNull(message = "Receptor user ID cannot be null")
    private Integer receptorUserId;

    @NotNull(message = "type cannot be null")
    private NotificationTypeEnum type;

    @NotBlank(message = "Description cannot be blank")
    private String description;
}