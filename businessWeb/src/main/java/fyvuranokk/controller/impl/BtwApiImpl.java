package fyvuranokk.controller.impl;

import fyvuranokk.audit.AuditingAwareBaseDto;
import fyvuranokk.business.dto.BtwDto;
import fyvuranokk.controller.api.IBtwGenericApi;
import fyvuranokk.business.service.IBtwGenericService;
import fyvuranokk.data.entity.BaseEntity;
import fyvuranokk.error.ApiResult;
import fyvuranokk.util.ReactURL;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Log4j2

@RestController
@CrossOrigin(origins = ReactURL.REACT_URL)
@RequestMapping("/btw/api/v1")
public class BtwApiImpl implements IBtwGenericApi<BtwDto> {
    //injection
    private final IBtwGenericService<AuditingAwareBaseDto, BaseEntity> iBtwGenericService;

    private ApiResult apiResult;
    //PAGEABLE AND PAGE
    @Override
    @GetMapping("/")
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("index");//pageable for index.html
    }

    @Override
    public ResponseEntity<?> btwServiceCreate(BtwDto btwDto) {
        return null;
    }


    @Override
    public ResponseEntity<List<BtwDto>> btwServiceList() {
        return null;
    }

    @Override
    public ResponseEntity<?> btwServiceFindById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> btwServiceDeleteById(Long id) {
        return null;
    }
}
