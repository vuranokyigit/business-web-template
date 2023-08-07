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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public BtwDto EntityToDto(BwtEntity bwtEntity) {
        return null;
    }

    @Override
    public BwtEntity DtoToEntity(BtwDto btwDto) {
        return null;
    }

    @Override
    public BtwDto btwServiceCreate(BtwDto btwDto) {
        return null;
    }

    @Override
    public List<BtwDto> btwServiceList() {
        return null;
    }

    @Override
    public BtwDto btwServiceFindById(Long id) {
        return null;
    }

    @Override
    public BtwDto btwServiceDeleteById(Long id) {
        return null;
    }

    @Override
    public BtwDto btwServiceUpdateById(Long id, BtwDto btwDto) {
        return null;
    }

    @Override
    public List<BtwDto> btwServiceAllList() {
        return null;
    }

    @Override
    public Page<BwtEntity> btwServicePagination(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Page<BwtEntity> btwServicePagination(Pageable pageable, BtwDto btwDto) {
        return null;
    }
}
