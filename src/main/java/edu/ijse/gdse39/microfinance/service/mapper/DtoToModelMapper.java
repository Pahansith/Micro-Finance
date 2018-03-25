package edu.ijse.gdse39.microfinance.service.mapper;

import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.dto.LoanAddInfoDto;
import edu.ijse.gdse39.microfinance.dto.LoanProductDto;
import edu.ijse.gdse39.microfinance.dto.SocietyDto;
import edu.ijse.gdse39.microfinance.model.*;

/**
 * @author Pahansith on 10/12/2017
 * @project MicroFinance
 */

public class DtoToModelMapper {
    public LoanModel mapLoanInfoDtoToLoanModel(LoanAddInfoDto loanAddInfoDto){
        LoanModel loanModel = new LoanModel();
        loanModel.setApprovedLoanAmount(loanAddInfoDto.getLoanAmount());
        return loanModel;
    }


    public LoanProductModel mapLoanProductDto(LoanProductDto loanProductDto) {
        LoanProductModel loanProductModel = new LoanProductModel(loanProductDto.getProductName(), loanProductDto.getDefPeriod(), loanProductDto.getDefIntRate(), loanProductDto.getMinAmount(), loanProductDto.getMaxAmount());
        loanProductModel.setId(loanProductDto.getId());
        return loanProductModel;
    }

    public CustomerFeedbackDataModel mapMemberFeedback(LoanAddInfoDto loanAddInfoDto, MemberModel selectedMember) {
        return new CustomerFeedbackDataModel(loanAddInfoDto.getLoanHistory(),loanAddInfoDto.getCustomerProperties(),loanAddInfoDto.getCustomerBusiness(),selectedMember);
    }

    public SocietyModel mapSocietyDto(SocietyDto societyDto) {
        return new SocietyModel(societyDto.getSocietyName(), societyDto.getPresident(), societyDto.getSecretary(), null);
    }

    public BranchModel mapBranchDto(BranchDto branchDto) {
        return new BranchModel(branchDto.getName(), branchDto.getAddress(), branchDto.getTelephone(), branchDto.getFax(), null);

    }
}
