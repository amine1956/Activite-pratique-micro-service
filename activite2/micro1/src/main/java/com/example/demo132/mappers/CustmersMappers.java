package com.example.demo132.mappers;

import com.example.demo132.dto.CusrmerDtoResponce;
import com.example.demo132.dto.CustmerDtoRequest;
import com.example.demo132.entite.Custmer;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;


@Mapper(componentModel = "spring")
public interface CustmersMappers{
    CusrmerDtoResponce CustmerToCustmerResponce(Custmer custmer);
    Custmer CusrmerDtoResponceToCustmer(CusrmerDtoResponce cusrmerDtoResponce);

    CustmerDtoRequest CustmerToCustmerDtoRequest(Custmer custmer);
    Custmer CustmerDtoRequestToCustmer(CustmerDtoRequest custmerDtoRequest);

}
