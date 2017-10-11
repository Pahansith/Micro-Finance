package edu.ijse.gdse39.microfinance.service.mapper;

import edu.ijse.gdse39.microfinance.dto.*;
import edu.ijse.gdse39.microfinance.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/7/2017
 * @project MicroFinance
 */

public class ModelToDtoMapper {
    public List<ProvinceDto> mapProvinceModelList(List<ProvinceModel> modelList){
        ArrayList<ProvinceDto> dtoList = new ArrayList<>();
        for (ProvinceModel provinceModel:
             modelList) {
            ProvinceDto provinceDto = new ProvinceDto(provinceModel.getProvinceId(),provinceModel.getProvinceName());
            dtoList.add(provinceDto);
        }

        return dtoList;
    }

    public ArrayList<BranchDto> mapBranchModelList(List<BranchModel> modelList){
        ArrayList<BranchDto> dtoList = new ArrayList<>();
        for (BranchModel branchModel:
                modelList) {
            BranchDto branch = new BranchDto(branchModel.getBranchId(),branchModel.getName());
            dtoList.add(branch);
        }
        return dtoList;
    }

    public ArrayList<SocietyDto> mapSocietyModelList(List<SocietyModel> modelList){
        ArrayList<SocietyDto> dtoList = new ArrayList<>();
        for (SocietyModel society:
                modelList) {
            SocietyDto societyDto = new SocietyDto(society.getSocietyId(),society.getSocietyName());
            dtoList.add(societyDto);
        }
        return dtoList;
    }

    public ArrayList<MemberDto> mapMemberModelList(List<MemberModel> modelList){
        ArrayList<MemberDto> dtoList = new ArrayList<>();
        for (MemberModel member:
                modelList) {
            MemberDto memberDto = new MemberDto(member.getMemberId(),member.getfName()+" "+member.getlName(),member.getNic(),member.getHometown(),member.getGroupModel().getGroupName());
            dtoList.add(memberDto);
        }
        return dtoList;
    }

    public ArrayList<LoanDto> mapLoanModelList(List<LoanModel> modelList){
        ArrayList<LoanDto> dtoList = new ArrayList<>();
        for (LoanModel loan:
                modelList) {
            LoanDto loanDto = new LoanDto(loan.getLoanId(),loan.getLoanNumber(),loan.getLoanProductModel().getProductName(),loan.getApprovedLoanAmount(),loan.getIntRate(),loan.getLoanStatus());
            dtoList.add(loanDto);
        }
        return dtoList;
    }

    public MemberDto mapMemberModel(MemberModel selectedMember) {
        return new MemberDto(selectedMember.getMemberId(),selectedMember.getfName()+" "+selectedMember.getlName(),selectedMember.getNic(),selectedMember.getHometown(),selectedMember.getGroupModel().getGroupName());
    }

    public ArrayList<LoanProductDto> mapLoanProductList(List<LoanProductModel> modelList) {
        ArrayList<LoanProductDto> dtoList = new ArrayList<>();
        for (LoanProductModel product:
                modelList) {
            LoanProductDto loanProductDto = new LoanProductDto(product.getId(),product.getProductName(),product.getDefPeriod(),product.getDefIntRate(),product.getMinAmount(),product.getMaxAmount());
            dtoList.add(loanProductDto);
        }
        return dtoList;
    }
}
