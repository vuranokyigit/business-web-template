package fyvuranokk.controller.api;

import fyvuranokk.business.dto.BwtDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IPageableAndProfileApi<D> {
    // Add all data
    public ResponseEntity<List<BwtDto>> speedDataService();
    //Delete all data
    public ResponseEntity<String> allDeleteService();
    //App info
    public ResponseEntity<String> appInformationService(HttpServletRequest request, HttpServletResponse response);
    //Pageable
    //list pageable structure
    public ResponseEntity<List<D>> bwtServiceAllList();
    //list page and page size
    public ResponseEntity <Page<D>> bwtServicePagination(int currentPage, int pageSize);
    //List page and pageable
    public  ResponseEntity <Page<D>> bwtServicePagination(Pageable pageable, D d);
}
