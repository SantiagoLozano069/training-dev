package com.trainingdev.td_bs_management_notification.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDetail extends Notification {

    private Integer id;

    private LocalDateTime creationDate;
}
