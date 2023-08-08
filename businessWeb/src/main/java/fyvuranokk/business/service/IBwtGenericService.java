package fyvuranokk.business.service;

import fyvuranokk.business.dto.BwtDto;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBwtGenericService<D, E> extends IProfileService{
    //#####Model Mapper####
    public D EntityToDto(E e);
    public E DtoToEntity(D d);
    //#######CRUD#########
    //Create
    public D bwtServiceCreate(D d);
    //List
    public List<D> bwtServiceList();
    //Find (ben sana bi id veriyim o id ye gore bilgileri bul)
    public D bwtServiceFindById(Long id);
    //Delete
    public D bwtServiceDeleteById(Long id);

    @Transactional

    //######Pageable#######
    //list pageable structure
    public  List<D> bwtServiceAllList();
    //list page and page size
    public Page<E> bwtServicePagination(int currentPage, int pageSize);
    //List page and pageable
    public  Page<E> bwtServicePagination(Pageable pageable, D d);

}
