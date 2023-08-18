package fyvuranokk.business.service.impl;

import fyvuranokk.bean.ModalMapperBean;
import fyvuranokk.data.repository.IBwtRepository;
import fyvuranokk.business.dto.BwtDto;
import fyvuranokk.business.service.IBwtGenericService;
import fyvuranokk.data.entity.BwtEntity;
import fyvuranokk.exception.BadRequestException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor // Injection
@Log4j2
@Service
public class BwtServiceImpl implements IBwtGenericService<BwtDto, BwtEntity> {
    private final ModalMapperBean modalMapperBean; // Dependency Injection
    private final IBwtRepository iBwtRepository;//database

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
            System.out.println(bwtDto.getName() + "giris");
            try {
                BwtEntity bwtEntity = iBwtRepository.save(DtoToEntity(bwtDto));
                System.out.println(bwtEntity.getName() + "cikis");
                bwtDto.setId(bwtEntity.getId());
                bwtDto.setSystemDate(bwtDto.getSystemDate());
            } catch (Exception e) {
                System.out.println("Error while saving entity: " + e.getMessage());
                e.printStackTrace();
                System.out.println(bwtDto.getName() + "cikis");
            }
        } else if (bwtDto==null) {
            throw new NotFoundException("Bwt does not found");//throw exception method
        }
        return bwtDto;
    }

    @Override
    public List<BwtDto> bwtServiceList() {
        Iterable<BwtEntity> bwtEntityIterable = iBwtRepository.findAll();
        List<BwtDto> list = new ArrayList<>();
         for (BwtEntity entity : bwtEntityIterable) {
             BwtDto bwtDto = EntityToDto(entity);
             list.add(bwtDto);
         }
        return list;
    }

    @Override
    public BwtDto bwtServiceFindById(Long id) {
        BwtEntity bwtEntity = null;
        if (id!=null){
            bwtEntity = iBwtRepository.findById(id).orElseThrow(()->
            new BadRequestException(id+ "no id does not found")
            );
        } else if (id==null) {
            throw new BadRequestException("BwtDto is null");
        }
        return EntityToDto(bwtEntity);
    }

    @Override
    public BwtDto bwtServiceDeleteById(Long id) {
        BwtDto bwtDtoFindForDelete = bwtServiceFindById(id);
        BwtEntity bwtEntity = DtoToEntity(bwtDtoFindForDelete);
        iBwtRepository.delete(bwtEntity);
        return bwtDtoFindForDelete;
    }

    @Override
    public List<BwtDto> bwtServiceAllList() {
        Iterable<BwtEntity> bwtEntityPage = iBwtRepository.findAll();
        List<BwtDto> list = new ArrayList<>();

        for (BwtEntity entity : bwtEntityPage) {
            BwtDto bwtDto = EntityToDto(entity);
            list.add(bwtDto);
        }
        return list;
    }

    @Override
    public Page<BwtEntity> bwtServicePagination(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public Page<BwtEntity> bwtServicePagination(Pageable pageable, BwtDto bwtDto) {
        return null;
    }
    @Override
    public List<BwtDto> speedDataService() {
        List<BwtDto> list = new ArrayList<>();
        for (int i=1; i<=5; i++){
            BwtDto bwtDto =BwtDto.builder()
                    .name("name&surname" + i)
                    .mail("mail" + i)
                    .topic("topic" + i)
                    .explanation("explanation"+ i)
                    .build();
            bwtServiceCreate(bwtDto);
            list.add(bwtDto);
        }
        return list;
    }

    @Override
    public String allDeleteService() {
        iBwtRepository.deleteAll();
        log.info("Deleted");//For analyzing
        return "Deleted";
    }

    @Override
    public String appInformationService(HttpServletRequest request, HttpServletResponse response) {
        String URIInfo = request.getRequestURI();
        String localhostInfo = request.getLocalAddr();
        String sessionInfo = request.getSession().toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(URIInfo).append(" ").append(localhostInfo).append(" ").append(sessionInfo);
        return stringBuilder.toString();
    }
}