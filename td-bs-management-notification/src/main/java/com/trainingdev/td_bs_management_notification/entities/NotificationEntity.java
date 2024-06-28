package com.trainingdev.td_bs_management_notification.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notification")
public class NotificationEntity extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "sender_user", nullable = false)
    private Integer senderUserId;

    @Column(name = "receptor_user", nullable = false)
    private Integer receptorUserId;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "type", nullable = false, length = 15)
    private String type;
}
