package com.trainingdev.td_bs_management_notification.mapper;

import com.trainingdev.td_bs_management_notification.dto.input.NotificationRequest;
import com.trainingdev.td_bs_management_notification.entities.NotificationEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T17:21:23-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public NotificationEntity notificationRequestToNotificationEntity(NotificationRequest notificationRequest) {
        if ( notificationRequest == null ) {
            return null;
        }

        NotificationEntity notificationEntity = new NotificationEntity();

        notificationEntity.setId( notificationRequest.getId() );
        notificationEntity.setDescription( notificationRequest.getDescription() );
        notificationEntity.setType( notificationRequest.getType() );

        return notificationEntity;
    }
}
