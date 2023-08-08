package fyvuranokk.business.service.impl;

import fyvuranokk.bean.ModalMapperBean;
import fyvuranokk.data.repository.IBwtRepository;
import fyvuranokk.business.dto.BwtDto;
import fyvuranokk.business.service.IBwtGenericService;
import fyvuranokk.data.entity.BwtEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@RequiredArgsConstructor // Injection
@Log4j2
@Service
public class BwtServiceImpl implements IBwtGenericService<BwtDto, BwtEntity> {
    private final ModalMapperBean modalMapperBean; // Dependency Injection
    private final IBwtRepository iBwtRepository;
    @Override
    public List<BwtDto> speedDataService() {
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
    //MODAL MAPPER
    @Override
    public BwtDto EntityToDto(BwtEntity bwtEntity) {
        return modalMapperBean.modelMapperMethod().map(bwtEntity, BwtDto.class);//entity to dto
    }

    @Override
    public BwtEntity DtoToEntity(BwtDto bwtDto) {
        return modalMapperBean.modelMapperMethod().map(bwtDto, BwtEntity.class);//dto to entity
    }
    //CRUD
    @Transactional//create,delete
    @Override
    public BwtDto bwtServiceCreate(BwtDto bwtDto) {
        if (bwtDto!=null){
            //save
            BwtEntity bwtEntityModelSaver = DtoToEntity(bwtDto);
            BwtEntity bwtEntity = iBwtRepository.save(bwtEntityModelSaver);
            //after save
            bwtDto.setId(bwtEntity.getId());
            bwtDto.setSystemDate(bwtDto.getSystemDate());
        } else if (bwtDto==null) {
            throw new NotFoundException("Bwt does not found");
        }
        return bwtDto;
    }

    @Override
    public List<BwtDto> bwtServiceList() {
        return null;
    }

    @Override
    public BwtDto bwtServiceFindById(Long id) {
        return null;
    }

    @Override
    public BwtDto bwtServiceDeleteById(Long id) {
        return null;
    }

    @Override
    public BwtDto bwtServiceUpdateById(Long id, BwtDto bwtDto) {
        return null;
    }

    @Override
    public List<BwtDto> bwtServiceAllList() {
        return null;
    }

    @Override
    public Page<BwtEntity> bwtServicePagination(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Page<BwtEntity> bwtServicePagination(Pageable pageable, BwtDto bwtDto) {
        return null;
    }
}
