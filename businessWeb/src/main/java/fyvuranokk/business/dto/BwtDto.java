package fyvuranokk.business.dto;

import fyvuranokk.audit.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
//LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public final class BwtDto extends AuditingAwareBaseDto implements Serializable {
    public static final Long serialVersionUID=1L;
    @NotEmpty(message = "{bwt.name.validation.constraints.NotNull.message}")
    @Size(min = 3, message = "{bwt.name.least.validation.constraints.NotNull.message}")
    private  String name;
    @NotEmpty(message = "{bwt.mail.validation.constraints.NotNull.message}")
    @Size(min = 10, message = "{bwt.mail.least.validation.constraints.NotNull.message}")
    private String mail;
    @NotEmpty(message = "{bwt.topic.validation.constraints.NotNull.message}")
    @Size(min = 2, message = "{bwt.topic.least.validation.constraints.NotNull.message}")
    private String topic;
    @NotEmpty(message = "{bwt.explanation.validation.constraints.NotNull.message}")
    @Size(max = 500, message = "{bwt.explanation.least.validation.constraints.NotNull.message}")
    private String explanation;
}
