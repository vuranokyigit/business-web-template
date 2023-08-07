package fyvuranokk.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@MappedSuperclass
@JsonIgnoreProperties(value = {"created_date"}, allowGetters = true)
abstract public class AuditingAwareBaseEntity {
    //Who added?
    @CreatedBy
    @Column(name = "created_user")
    protected String createdUser;
    //Who added when?
    @CreatedDate
    @Column(name = "created_date")
    protected Date createdDate;

}
