package fyvuranokk.business.dto;

import fyvuranokk.audit.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class BwtDto extends AuditingAwareBaseDto implements Serializable {
    public static final Long serialVersionUID=1L;

    @NotEmpty(message = "{bwt.topic.validation.constraints.NotNull.message}")
    @Size(min = 4, message = "{bwt.topic.least.validation.constraints.NotNull.message}")
    private String topic;
    @NotEmpty(message = "{bwt.explanation.validation.constraints.NotNull.message}")
    @Size(max = 75, message = "{bwt.explanation.least.validation.constraints.NotNull.message}")
    private String explanation;
}
