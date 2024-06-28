package com.trainingdev.td_bs_management_notification.service;

import com.trainingdev.td_bs_management_notification.dto.input.NotificationDetail;
import com.trainingdev.td_bs_management_notification.dto.input.NotificationRequest;

public interface NotificationService {

    NotificationDetail createNotification (NotificationRequest notificationRequest);
}
