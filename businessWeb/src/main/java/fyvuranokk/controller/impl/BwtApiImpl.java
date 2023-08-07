package fyvuranokk.controller.impl;

import fyvuranokk.audit.AuditingAwareBaseDto;
import fyvuranokk.business.dto.BwtDto;
import fyvuranokk.controller.api.IBwtGenericApi;
import fyvuranokk.business.service.IBwtGenericService;
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
@RequestMapping("/bwt/api/v1")
public class BwtApiImpl implements IBwtGenericApi<BwtDto> {
    //injection
    private final IBwtGenericService<AuditingAwareBaseDto, BaseEntity> iBwtGenericService;

    private ApiResult apiResult;
    //PAGEABLE AND PAGE
    @Override
    @GetMapping("/")
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("index");//pageable for index.html
    }

    @Override
    public ResponseEntity<?> bwtServiceCreate(BwtDto bwtDto) {
        return null;
    }


    @Override
    public ResponseEntity<List<BwtDto>> bwtServiceList() {
        return null;
    }

    @Override
    public ResponseEntity<?> bwtServiceFindById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> bwtServiceDeleteById(Long id) {
        return null;
    }
}
