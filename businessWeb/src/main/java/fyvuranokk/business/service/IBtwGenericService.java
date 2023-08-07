package fyvuranokk.business.service;

import fyvuranokk.audit.AuditingAwareBaseDto;
import fyvuranokk.business.dto.BtwDto;
import fyvuranokk.data.entity.BaseEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBtwGenericService<D, E> extends IProfileService{
    //#####Model Mapper####
    public D EntityToDto(E e);
    public E DtoToEntity(D d);
    //#######CRUD#########
    //Create
    public D btwServiceCreate(D d);
    //List
    public List<D> btwServiceList();
    //Find (ben sana bi id veriyim o id ye gore bilgileri bul)
    public D btwServiceFindById(Long id);
    //Delete
    public D btwServiceDeleteById(Long id);
    // Update
    public D btwServiceUpdateById(Long id,  BtwDto btwDto);

    @Transactional

    //######Pageable#######
    //list pageable structure
    public  List<D> btwServiceAllList();
    //list page and page size
    public Page<E> btwServicePagination(int currentPage, int pageSize);
    //List page and pageable
    public  Page<E> btwServicePagination(Pageable pageable, D d);

}
