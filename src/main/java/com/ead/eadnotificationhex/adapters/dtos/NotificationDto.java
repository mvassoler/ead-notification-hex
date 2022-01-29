package com.ead.eadnotificationhex.adapters.dtos;

import com.ead.eadnotificationhex.core.domain.enums.NotificationStatus;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class NotificationDto {

    @NotNull
    private NotificationStatus notificationStatus;
}
