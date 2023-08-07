package fyvuranokk.business.dto;

import fyvuranokk.audit.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class BtwDto extends AuditingAwareBaseDto implements Serializable {
    public static final Long serialVersionUID=1L;

    @NotEmpty(message = "{btw.topic.validation.constraints.NotNull.message}")
    @Size(min = 4, message = "{btw.topic.least.validation.constraints.NotNull.message}")
    private String topic;
    @NotEmpty(message = "{btw.explanation.validation.constraints.NotNull.message}")
    @Size(max = 75, message = "{btw.explanation.least.validation.constraints.NotNull.message}")
    private String explanation;
}
