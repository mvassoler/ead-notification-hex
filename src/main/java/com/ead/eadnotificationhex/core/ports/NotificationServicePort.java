package com.ead.eadnotificationhex.core.ports;

import com.ead.eadnotificationhex.core.domain.NotificationDomain;
import com.ead.eadnotificationhex.core.domain.PageInfo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotificationServicePort {

    NotificationDomain save(NotificationDomain notificationModel);

    List<NotificationDomain> findAllNotificationsByYser(UUID userId, PageInfo pageable);

    Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
