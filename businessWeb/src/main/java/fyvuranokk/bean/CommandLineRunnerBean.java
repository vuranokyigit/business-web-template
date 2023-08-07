package fyvuranokk.bean;

import fyvuranokk.business.dto.BwtDto;
import fyvuranokk.business.service.impl.BwtServiceImpl;
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

    private final BwtServiceImpl bwtService;

    @Bean
    public CommandLineRunner commandLineRunnerMethod(){
        return args -> {
            List<BwtDto> list = new ArrayList<>();
        };
    }

}
