package az.egov.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by admin on 24.09.2018.
 */

@Entity
@Table(schema = "List")
@Data
public class Positions {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;


    @Column
    private String name ;

    public Positions(Integer id)
    {
        this.id = id ;
    }
}
