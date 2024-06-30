package com.trainingdev.td_bs_management_notification.mapper;

import com.trainingdev.td_bs_management_notification.dto.input.NotificationRequest;
import com.trainingdev.td_bs_management_notification.entities.NotificationEntity;
import com.trainingdev.td_bs_management_notification.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

@Mapper(componentModel = "spring")
public interface NotificationMapper {
/* mio borrar
    public NotificationEntity notificationRequestToNotificationEntity (NotificationRequest notificationRequest,
                                                                       UserEntity senderUser, UserEntity receptorUser){
        ModelMapper mapper = new ModelMapper();
        TypeMap<NotificationRequest, NotificationEntity> propertyMapper = mapper.createTypeMap(NotificationRequest.class, NotificationEntity.class);
        NotificationEntity NotificationEntityResponse = propertyMapper.map(notificationRequest);
        NotificationEntityResponse.setSenderUser(senderUser);
        NotificationEntityResponse.setReceptorUser(receptorUser);
        return  NotificationEntityResponse;
    } */

    @Mapping(target = "senderUser", ignore = true)
    @Mapping(target = "receptorUser", ignore = true)
    NotificationEntity notificationRequestToNotificationEntity(NotificationRequest notificationRequest);

}
