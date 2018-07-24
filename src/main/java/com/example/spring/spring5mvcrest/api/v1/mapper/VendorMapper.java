package com.example.spring.spring5mvcrest.api.v1.mapper;

import com.example.spring.spring5mvcrest.api.v1.model.VendorDTO;
import com.example.spring.spring5mvcrest.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    Vendor vendorDTOToVendor(VendorDTO vendorDTO);

    VendorDTO vendorToVendorDTO(Vendor vendor);
}
