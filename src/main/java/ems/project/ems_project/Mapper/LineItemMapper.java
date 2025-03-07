package ems.project.ems_project.Mapper;

import ems.project.ems_project.DTO.LineItemDTO;
import ems.project.ems_project.Model.LineItem;

public class LineItemMapper {
    public LineItemDTO LinItemToDTO(LineItem lineItem){
        return new LineItemDTO(lineItem.getId(),lineItem.getQuantity(), lineItem.getItem_Tprice(),lineItem.getProduct());
    }
    public LineItem LineItemDTOtoLineItem(LineItemDTO lineItemDTO){
        return new LineItem(lineItemDTO.getId(), lineItemDTO.getQuantity(), lineItemDTO.getItem_Tprice(), lineItemDTO.getProduct());
    }
}
