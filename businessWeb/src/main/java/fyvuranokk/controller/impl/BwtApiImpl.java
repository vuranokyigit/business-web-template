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
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Log4j2

@RestController
@CrossOrigin(origins = ReactURL.REACT_URL)
@RequestMapping("/bwt/api/v1")
@SpringBootApplication
public class BwtApiImpl implements IBwtGenericApi<AuditingAwareBaseDto> {
    //injection

    private final IBwtGenericService<AuditingAwareBaseDto, BaseEntity> iBwtGenericService;

    private ApiResult apiResult;
    //PAGEABLE AND PAGE
    @Override
    @GetMapping("/")
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("index");//pageable for index.html
    }
    //CRUD

    @Override
    @PostMapping("/create")
    //localhost:3333/bwt/api/v1/create
    public ResponseEntity<?> bwtServiceCreate(@RequestBody AuditingAwareBaseDto bwtDto) {
        return ResponseEntity.ok(iBwtGenericService.bwtServiceCreate(bwtDto));
    }


    @Override
    @GetMapping("/list")
    //localhost:3333/bwt/api/v1/list
    public ResponseEntity<List<AuditingAwareBaseDto>> bwtServiceList() {
        return ResponseEntity.ok(iBwtGenericService.bwtServiceList());
    }

    @Override
    @GetMapping({"/find", "/find/{id}" })
    public ResponseEntity<?> bwtServiceFindById(@PathVariable(name = "id", required = false)Long id) {
        if (id==null){
            log.error("Bwt api null pointer exception(id==null)");
            throw new NullPointerException(id+"Null data comes from Bwt Api");
        }if (id==0){
            log.error("Bwt api 0 comes bad request");
            apiResult = new ApiResult(400, "bad request", "bad request", "/bwt/api/v1/find/0");
            return ResponseEntity.ok(apiResult);
        }
        return ResponseEntity.ok((BwtDto) iBwtGenericService.bwtServiceFindById(id));
    }

    @Override
    @DeleteMapping({"/delete", "/delete/{id}"})
    public ResponseEntity<?> bwtServiceDeleteById(@PathVariable (name = "id", required = false) Long id) {
        return ResponseEntity.ok(iBwtGenericService.bwtServiceDeleteById(id));
    }

    public IBwtGenericService<AuditingAwareBaseDto, BaseEntity> getiBwtGenericService() {
        return iBwtGenericService;
    }
}
