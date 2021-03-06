package az.egov.repository;


import az.egov.entity.Persons;
import az.egov.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 12.09.2018.
 */
@Repository
public interface UserRepository extends JpaRepository<Users,String> {

    public Users findByUserNameAndPassword(String username,String password) ;

    @Query("select count(u) from Users as u where u.statusId != 3")
    public Long totalCount() ;

    Users findByPerson(Persons person) ;
}
