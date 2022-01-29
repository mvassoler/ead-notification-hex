package com.ead.eadnotificationhex.services;


import com.ead.eadnotificationhex.core.domain.NotificationDomain;
import com.ead.eadnotificationhex.core.domain.PageInfo;
import com.ead.eadnotificationhex.core.ports.NotificationServicePort;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class NotificationServicePortImpl implements NotificationServicePort {

    private final NotificationServicePort notificationServicePort;

    public NotificationServicePortImpl(NotificationServicePort notificationServicePort) {
        this.notificationServicePort = notificationServicePort;
    }

    @Override
    public NotificationDomain save(NotificationDomain notificationModel) {
        return notificationServicePort.save(notificationModel);
    }

    @Override
    public List<NotificationDomain> findAllNotificationsByYser(UUID userId, PageInfo pageinfo) {
        return this.findAllNotificationsByYser(userId, pageinfo);
    }

    @Override
    public Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId) {
        return this.findByNotificationIdAndUserId(notificationId, userId);
    }
}
