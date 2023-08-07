package fyvuranokk.controller.api;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBtwGenericApi<D> extends IPageableAndProfileApi {
    //####ROOT######
    //Spring MVC(Thymleaf)>this is  the web page extension
    public ResponseEntity<String> getRoot();
    //CRUD
    //Create
    public ResponseEntity<?> btwServiceCreate(D d);
    //List
    public ResponseEntity<List<D>> btwServiceList();
    //Find (ben sana bi id veriyim o id ye gore bilgileri bul)
    public ResponseEntity<?> btwServiceFindById(Long id);
    //Delete
    public ResponseEntity<?> btwServiceDeleteById(Long id);
}
