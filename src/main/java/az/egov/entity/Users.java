package az.egov.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by admin on 12.09.2018.
 */
@Entity
@Table(name = "users" , schema = "List")
public class Users {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column( columnDefinition="uniqueidentifier")
    private String id ;

    @Transient
    private String pin ;
    @Column(name = "username")
    private String userName ;
    @Column
    private String password ;

    @Column
    private Integer statusId ;


    public Users() {
    }

    public Users(String id)
    {
        this.id = id ;
    }



    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "person_id")
    private Persons person ;

    @Column
    private String deviceId ;

    @Column
    private String firebaseId ;

    /*@Column(name = "registration_date")
    private Date registerDate;*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }*/

    public Integer getStatusId() {
        return statusId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getFirebaseId() {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Persons getPerson() {
        return person;
    }

    public void setPerson(Persons person) {
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", pin='" + pin + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                '}';
    }
}
