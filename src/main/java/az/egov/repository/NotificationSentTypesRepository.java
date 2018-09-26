package az.egov.repository;

import az.egov.entity.NotificationSentTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 26.09.2018.
 */
@Repository
@Transactional
public interface NotificationSentTypesRepository extends JpaRepository<NotificationSentTypes,Integer> {
}
