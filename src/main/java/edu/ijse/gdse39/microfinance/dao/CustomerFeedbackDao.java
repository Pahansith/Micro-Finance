package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.CustomerFeedbackDataModel;

import java.io.Serializable;

/**
 * @author Pahansith on 10/19/2017
 * @project MicroFinance
 */

public interface CustomerFeedbackDao {

    Serializable saveFeedback(CustomerFeedbackDataModel customerFeedbackDataModel);
}
