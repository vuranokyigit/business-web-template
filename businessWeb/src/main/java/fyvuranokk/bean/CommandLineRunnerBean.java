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
import java.util.UUID;

@RequiredArgsConstructor
@Configuration


public class CommandLineRunnerBean {

    private final BwtServiceImpl bwtService;

    @Bean
    public CommandLineRunner commandLineRunnerMethod(){
        return args -> {
            List<BwtDto> list = new ArrayList<>();
            //we can provide this area for default coming data to database
            for (int i = 1; i<=10; i++){
                BwtDto bwtDto = BwtDto.builder()
                        .name("name&surname" + UUID.randomUUID().toString())
                        .mail("mail" + UUID.randomUUID().toString())
                        .topic("topic" +UUID.randomUUID().toString())
                        .explanation("explanation"+ UUID.randomUUID().toString())
                        .build();
                bwtService.bwtServiceCreate(bwtDto);
                list.add(bwtDto);
            }
        };
    }

}
