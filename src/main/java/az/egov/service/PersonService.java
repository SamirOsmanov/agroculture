package az.egov.service;

import az.egov.entity.Persons;
import az.egov.service.common.CRUDService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 03.09.2018.
 */


public interface PersonService extends CRUDService<Persons> {

    List<Persons> getPersonList(int offset , int fetch) ;

    long totalPersonCount() ;

    public Persons findByPin(String pin) ;

    public List<Persons>   extendedSearch(String personId,
                                          String pin,
                                          String name,
                                          String surname,
                                          String fathername) ;

    public Integer savePersonActivity( String personId,
                                       Integer activityId,
                                       Integer areaId) ;

    public void deletePersonActivity(@Param("personId")   String personId) ;

    public void savePersonContacts(  String personId,
                                     Integer contactTypeId,
                                     String  contactInfo) ;

    public void savePersonAddress(  String personId,
                                    Integer addressTypeId,
                                    String address) ;
}
