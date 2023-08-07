package fyvuranokk.business.service.impl;

import fyvuranokk.bean.ModalMapperBean;
import fyvuranokk.data.repository.IBwtRepository;
import fyvuranokk.business.dto.BtwDto;
import fyvuranokk.business.service.IBtwGenericService;
import fyvuranokk.data.entity.BwtEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // Injection
@Log4j2
@Service
public class BtwServiceImpl implements IBtwGenericService<BtwDto, BwtEntity> {
    private final ModalMapperBean modalMapperBean; // Dependency Injection
    private final IBwtRepository iBtwRepository;
    @Override
    public List<BtwDto> speedDataService() {
        return null;
    }

    @Override
    public String allDeleteService() {
        return null;
    }

    @Override
    public String appInformationService(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
