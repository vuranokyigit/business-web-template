package fyvuranokk.business.service;

import fyvuranokk.business.dto.BtwDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface IProfileService {
    // Add all data
    public List<BtwDto> speedDataService();

    //Delete all data
    public String allDeleteService();

    //App info
    public String appInformationService(HttpServletRequest request, HttpServletResponse response);
}
