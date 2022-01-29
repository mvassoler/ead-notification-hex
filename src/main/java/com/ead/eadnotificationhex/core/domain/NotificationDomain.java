package com.ead.eadnotificationhex.core.domain;

import com.ead.eadnotificationhex.core.domain.enums.NotificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationDomain implements Serializable {


    private UUID notificationId;
    private UUID userId;
    private String title;
    private String message;
    private LocalDateTime creationDate;
    private NotificationStatus notificationStatus;

}
