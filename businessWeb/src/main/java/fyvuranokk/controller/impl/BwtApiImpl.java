package fyvuranokk.controller.impl;

import fyvuranokk.business.dto.BwtDto;
import fyvuranokk.controller.api.IBwtGenericApi;
import fyvuranokk.business.service.IBwtGenericService;
import fyvuranokk.error.ApiResult;
import fyvuranokk.util.ReactURL;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Log4j2

@RestController
@CrossOrigin(origins = ReactURL.REACT_URL)
@RequestMapping("/bwt/api/v1")

public class BwtApiImpl implements IBwtGenericApi<BwtDto> {
    //injection
    private final IBwtGenericService iBwtGenericService;

    private ApiResult apiResult;
    //PAGEABLE AND PAGE
    @Override
    @GetMapping("/")
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("index");//pageable for index.html
    }
    //Speed & delete all
    @Override
    @GetMapping("/speed/data")
    public  ResponseEntity<List<BwtDto>> speedDataService(){
        return ResponseEntity.ok(iBwtGenericService.speedDataService());
    }

    @Override
    @GetMapping("/all/delete")
    public ResponseEntity<String> allDeleteService() {
        return ResponseEntity.ok(iBwtGenericService.allDeleteService());
    }

    @Override
    @GetMapping("/app/information")
    public ResponseEntity<String> appInformationService(HttpServletRequest request, HttpServletResponse response) {
        return ResponseEntity.ok( iBwtGenericService.appInformationService(request, response));
    }

    @Override
    public ResponseEntity<List> bwtServiceAllList() {
        return null;
    }

    @Override
    public ResponseEntity<Page> bwtServicePagination(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public ResponseEntity<Page> bwtServicePagination(Pageable pageable, Object o) {
        return null;
    }

    @Override
    @PostMapping("/create")
    //localhost:3333/bwt/api/v1/create
    public ResponseEntity<?> bwtServiceCreate(@Valid @RequestBody  BwtDto bwtDto) {
        return ResponseEntity.ok(iBwtGenericService.bwtServiceCreate(bwtDto));
    }
    //CRUD

    @Override
    @GetMapping("/list")
    //localhost:3333/bwt/api/v1/list
    public ResponseEntity<List<BwtDto>> bwtServiceList() {
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
}
