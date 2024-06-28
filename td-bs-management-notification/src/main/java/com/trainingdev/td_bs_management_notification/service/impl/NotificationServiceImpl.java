package com.trainingdev.td_bs_management_notification.service.impl;

import com.trainingdev.td_bs_management_notification.dto.input.NotificationDetail;
import com.trainingdev.td_bs_management_notification.dto.input.NotificationRequest;
import com.trainingdev.td_bs_management_notification.entities.NotificationEntity;
import com.trainingdev.td_bs_management_notification.repository.NotificationRepository;
import com.trainingdev.td_bs_management_notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final ModelMapper modelMapper;

    @Override
    public NotificationDetail createNotification(NotificationRequest notificationRequest) {
        NotificationEntity notificationEntity = modelMapper.map(notificationRequest, NotificationEntity.class);
        NotificationEntity notificationEntitySaved = notificationRepository.save(notificationEntity);
        return modelMapper.map(notificationEntitySaved, NotificationDetail.class);
    }
}
