package fyvuranokk.bean;

import fyvuranokk.business.dto.BtwDto;
import fyvuranokk.business.service.impl.BtwServiceImpl;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Configuration
@Builder
@Data
public class CommandLineRunnerBean {

    private final BtwServiceImpl btwService;

    @Bean
    public CommandLineRunner commandLineRunnerMethod(){
        return args -> {
            List<BtwDto> list = new ArrayList<>();
        };
    }

}
