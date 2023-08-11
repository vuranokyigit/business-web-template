package fyvuranokk.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "bwt")
public class BwtEntity extends BaseEntity implements Serializable {
    public static final Long serialVersionUID = 1L;
    //THIS IS THE PRIVATE PROPERTIES
    //NAME&SURNAME
    @Column(name = "name",columnDefinition = "varchar(255) default 'name&surname CANNOT BE NULL")
    public  String name;
    //EMAIL
    @Column(name = "mail",columnDefinition = "varchar(255) default 'email CANNOT BE NULL")
    private String mail;
    //TOPIC
    @Column(name = "topic",columnDefinition = "varchar(255) default 'topic CANNOT BE NULL'")
    private String topic;
    //EXPLANATION
    @Column(name = "explanation",columnDefinition = "varchar(255) default 'explanation CANNOT BE NULL'")
    private String explanation;



}
