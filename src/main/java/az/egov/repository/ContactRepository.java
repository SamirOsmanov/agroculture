package az.egov.repository;

import az.egov.entity.ContactTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 26.09.2018.
 */
@Repository
@Transactional
public interface ContactRepository extends JpaRepository<ContactTypes,Integer> {
}
