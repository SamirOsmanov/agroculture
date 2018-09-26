package az.egov.service;

import az.egov.entity.Notification;
import az.egov.entity.NotificationDetails;
import az.egov.service.common.CRUDService;

import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by admin on 26.09.2018.
 */

public interface NotificationService extends CRUDService<Notification> {

    Notification saveNotification(HashMap<String,Object> request) throws ParseException;

    public Long totalCount() ;

    NotificationDetails findByNotificationId(Object id) ;
}
