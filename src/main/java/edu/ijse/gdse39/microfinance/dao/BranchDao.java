package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.BranchModel;

import java.util.List;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public interface BranchDao {
    List<BranchModel> getBranchListByProvince(int provinceId);

    List<BranchModel> findAll() throws Exception;

    BranchModel findBranch(int i) throws Exception;

    boolean save(BranchModel branchModel) throws Exception;
}
