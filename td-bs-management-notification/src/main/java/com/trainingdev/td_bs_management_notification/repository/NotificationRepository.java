package com.trainingdev.td_bs_management_notification.repository;

import com.trainingdev.td_bs_management_notification.entities.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, Integer> {
}
