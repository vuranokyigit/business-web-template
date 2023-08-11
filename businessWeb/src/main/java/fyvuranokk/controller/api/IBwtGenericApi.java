package fyvuranokk.controller.api;

import org.springframework.http.ResponseEntity;


import java.util.List;

public interface IBwtGenericApi<D> extends IPageableAndProfileApi {
    //####ROOT######
    //Spring MVC(Thymleaf)>this is  the web page extension
    public ResponseEntity<String> getRoot();
    //CRUD
    //Create
    public ResponseEntity<?> bwtServiceCreate(D d);
    //List
    public ResponseEntity<List<D>> bwtServiceList();
    //Find (ben sana bi id veriyim o id ye gore bilgileri bul)
    public ResponseEntity<?> bwtServiceFindById(Long id);
    //Delete
    public ResponseEntity<?> bwtServiceDeleteById(Long id);
}
