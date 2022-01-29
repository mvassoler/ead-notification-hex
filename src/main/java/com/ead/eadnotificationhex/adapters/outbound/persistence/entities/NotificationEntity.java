package com.ead.eadnotificationhex.adapters.outbound.persistence.entities;

import com.ead.eadnotificationhex.core.domain.enums.NotificationStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_NOTIFICATIONS")
public class NotificationEntity implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private UUID notificationId;

    @Column(name = "USER_ID", nullable = false)
    private UUID userId;

    @Column(name = "TITLE", nullable = false, length = 150)
    private String title;

    @Column(name = "MESSAGE", nullable = false)
    private String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private NotificationStatus notificationStatus;
}
