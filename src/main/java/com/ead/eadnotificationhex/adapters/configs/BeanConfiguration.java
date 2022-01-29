package com.ead.eadnotificationhex.adapters.configs;

import com.ead.eadnotificationhex.EadNotificationHexApplication;
import com.ead.eadnotificationhex.core.ports.NotificationServicePort;
import com.ead.eadnotificationhex.services.NotificationServicePortImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = EadNotificationHexApplication.class)
public class BeanConfiguration {

    @Bean
    NotificationServicePortImpl notificationServicePortImpl(NotificationServicePort persistence){
        return new NotificationServicePortImpl(persistence);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
