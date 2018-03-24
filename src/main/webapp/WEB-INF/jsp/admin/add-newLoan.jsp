<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pahansith
  Date: 10/4/2017
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Add New Loan</title>
    <meta name="description" content="GARO is a real-estate template">
    <meta name="author" content="Kimarotec">
    <meta name="keyword" content="html5, css, bootstrap, property, real-estate theme , bootstrap template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800' rel='stylesheet' type='text/css'>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

    <link rel="stylesheet" href="assets/css/normalize.css">
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/fontello.css">
    <link href="assets/fonts/icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet">
    <link href="assets/fonts/icon-7-stroke/css/helper.css" rel="stylesheet">
    <link href="assets/css/animate.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="assets/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/icheck.min_all.css">
    <link rel="stylesheet" href="assets/css/price-range.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.css">
    <link rel="stylesheet" href="assets/css/owl.theme.css">
    <link rel="stylesheet" href="assets/css/owl.transitions.css">
    <link rel="stylesheet" href="assets/css/wizard.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/responsive.css">
</head>
<body>
<div id="preloader">
    <div id="status">&nbsp;</div>
</div>
<!-- Body content -->

<div class="header-connect">
    <div class="container">
        <div class="row">
            <div class="col-md-5 col-sm-8  col-xs-12">
                <div class="header-half header-call">
                    <p>
                        <span><i class="pe-7s-user"></i> LOGGED IN USER NAME</span>
                        <span><i class="pe-7s-medal"></i> LOGGED IN USER ROLE</span>
                    </p>
                </div>
            </div>
            <div class="col-md-2 col-md-offset-5  col-sm-3 col-sm-offset-1  col-xs-12">
                <div class="header-half header-social">
                    <ul class="list-inline">
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-vine"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                        <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--End top header -->

<nav class="navbar navbar-default ">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navigation">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><img src="assets/img/logo.png" alt=""></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse yamm" id="navigation">
            <div class="button navbar-right">
                <button class="navbar-btn nav-button wow bounceInRight login" onclick=" window.open('register')"
                        data-wow-delay="0.45s">Logout
                </button>
            </div>
            <ul class="main-nav nav navbar-nav navbar-right">

                <li class="dropdown ymm-sw " data-wow-delay="0.1s">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Loan
                        <b class="caret"></b></a>
                    <ul class="dropdown-menu navbar-nav">
                        <li>
                            <a href="newLoan">New Loan</a>
                        </li>
                        <li>
                            <a href="branch-search">Branch Manager Approval</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown ymm-sw " data-wow-delay="0.1s">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Loan
                        Operation<b class="caret"></b></a>
                    <ul class="dropdown-menu navbar-nav">
                        <li>
                            <a href="loan-payment">Loan Payment</a>
                        </li>
                        <li>
                            <a href="loan-scedule">Loan Schedule</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown ymm-sw " data-wow-delay="0.1s">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Member
                        <b class="caret"></b></a>
                    <ul class="dropdown-menu navbar-nav">
                        <li>
                            <a href="member-add">New Member</a>
                        </li>
                        <li>
                            <a href="update-member">Update Details</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown ymm-sw " data-wow-delay="0.1s">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Branch
                        <b class="caret"></b></a>
                    <ul class="dropdown-menu navbar-nav">
                        <li>
                            <a href="add-branch">New Branch</a>
                        </li>
                        <li>
                            <a href="branchList">Branch List</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown ymm-sw " data-wow-delay="0.1s">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Society
                        <b class="caret"></b></a>
                    <ul class="dropdown-menu navbar-nav">
                        <li>
                            <a href="add-society">New Society</a>
                        </li>
                        <li>
                            <a href="societyList">Society List</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<!-- End of nav bar -->
<!-- End page header -->

<!-- property area -->
<div class="content-area submit-property" style="background-color: #FCFCFC;">&nbsp;
    <div class="container">
        <div class="clearfix">
            <div class="wizard-container">

                <div class="wizard-card ct-wizard-orange" id="wizardProperty">
                    <form action="" method="">
                        <div class="wizard-header">
                            <h3>
                                <b>Submit</b> New Loan <br>
                                <small>Add Information about the loan</small>
                            </h3>
                        </div>

                        <ul>
                            <li><a href="#step1" data-toggle="tab">Previous Loans </a></li>
                            <li><a href="#step2" data-toggle="tab">Guarantors </a></li>
                            <li><a href="#step3" data-toggle="tab">Recommendation </a></li>
                            <li><a href="#step4" data-toggle="tab">Loan Details </a></li>
                        </ul>

                        <div class="tab-content">

                            <div class="tab-pane" id="step1">
                                <div class="row p-b-15  ">
                                    <h4 class="info-text"> Previous Loan Records</h4>
                                    <table class="table table-responsive">
                                        <thead>
                                        <th>Loan Number</th>
                                        <th>Loan Product</th>
                                        <th>Loan Amount</th>
                                        <th>Interest rate</th>
                                        <th>Status</th>

                                        </thead>
                                        <tbody>
                                        <c:forEach items="${customerLoanList}" var="list">
                                        <tr>
                                            <td>
                                                ${list.loanNumber}
                                            </td>
                                            <td>
                                                ${list.productName}
                                            </td>
                                            <td>
                                                ${list.amount}
                                            </td>
                                            <td>
                                                ${list.interestRate}
                                            </td>
                                            <td>
                                                ${list.status}
                                            </td>
                                        </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!--  End step 1 -->

                            <div class="tab-pane" id="step2">
                                <div class="row p-b-15  ">
                                    <h4 class="info-text"> Member Details</h4>
                                    <table class="table table-responsive">
                                        <thead>
                                            <th>Member Id</th>
                                            <th>Name</th>
                                            <th>NIC</th>
                                            <th>Home Town</th>
                                            <th>Group</th>

                                        </thead>
                                        <tbody>
                                        <tr>
                                            <c:set var="selectedIdOfMem" scope="session" value="${selectedMember.memberId}"/>
                                            <td>
                                                ${selectedMember.memberId}
                                            </td>
                                            <td>
                                                ${selectedMember.fulName}
                                            </td>
                                            <td>
                                                ${selectedMember.nic}
                                            </td>
                                            <td>
                                                ${selectedMember.hometown}
                                            </td>
                                            <td>
                                                ${selectedMember.group}
                                            </td>

                                        </tr>
                                        </tbody>
                                    </table>
                                    <h4 class="info-text"> Guarentor Details</h4>
                                    <table class="table table-responsive">
                                        <thead>
                                            <th>Member Id</th>
                                            <th>Name</th>
                                            <th>NIC</th>
                                            <th>Home Town</th>
                                            <th>Group</th>
                                        </thead>
                                        <tbody>

                                        <c:forEach items="${memberGroupDetails}" var="groupList">
                                            <c:if test="${selectedIdOfMem != groupList.memberId}">
                                                <tr>
                                                    <td>
                                                            ${groupList.memberId}
                                                    </td>
                                                    <td>
                                                            ${groupList.fulName}
                                                    </td>
                                                    <td>
                                                            ${groupList.nic}
                                                    </td>
                                                    <td>
                                                            ${groupList.hometown}
                                                    </td>
                                                    <td>
                                                            ${groupList.group}
                                                    </td>
                                                </tr>
                                            </c:if>

                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- End step 2 -->

                            <div class="tab-pane" id="step3">
                                <h4 class="info-text">Recommendation About Customer </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label for="l-history">Loan History :</label>
                                            <select id="l-history" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Good </option>
                                                <option>Cannot Trust</option>
                                                <option>Medium</option>

                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="c-properties">Customer Properties :</label>
                                            <select id="c-properties" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Good </option>
                                                <option>Medium</option>
                                                <option>Not enough for morgage</option>

                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="c-business">Customer Business :</label>
                                            <select id="c-business" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Mid Sized </option>
                                                <option>Large Sized</option>
                                                <option>No Business</option>
                                                <option>Small Business</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--  End step 3 -->


                            <div class="tab-pane" id="step4">
                                <h4 class="info-text">Loan Information </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label for="l-prod">Loan Product :</label>
                                            <select id="l-prod" class="selectpicker show-tick form-control" onchange="setLoanProductValues($(this).val())">
                                                <c:forEach items="${loanProductList}" var="loanProducts">
                                                    <option value="${loanProducts.id}">${loanProducts.productName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="l-amt">Loan Amount :</label>
                                            <input id="l-amt" class="l-amt" value="" placeholder="Enter Loan Amount" name="property_video" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="l-term">Loan Term :</label><br>
                                            <span id="l-term" style="margin-left: 15px;"></span>
                                        </div>
                                        <div class="form-group">
                                            <label for="l-rate">Interest Rate :</label><br>
                                            <span id="l-rate" style="margin-left: 15px;"></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--  End step 4 -->

                        </div>

                        <div class="wizard-footer">
                            <div class="pull-right">
                                <input type='button' class='btn btn-next btn-primary' name='next' value='Next'/>
                                <input type='button' class='btn btn-finish btn-primary ' name='finish' value='Finish' onclick="submitNewLoan()"/>
                            </div>

                            <div class="pull-left">
                                <input type='button' class='btn btn-previous btn-default' name='previous'
                                       value='Previous'/>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                    </form>
                </div>
                <!-- End submit form -->
            </div>
        </div>
    </div>
</div>



<script src="assets/js/modernizr-2.6.2.min.js"></script>
<script src="assets/js//jquery-1.10.2.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/bootstrap-select.min.js"></script>
<script src="assets/js/bootstrap-hover-dropdown.js"></script>
<script src="assets/js/easypiechart.min.js"></script>
<script src="assets/js/jquery.easypiechart.min.js"></script>
<script src="assets/js/owl.carousel.min.js"></script>
<script src="assets/js/wow.js"></script>
<script src="assets/js/icheck.min.js"></script>

<script src="assets/js/price-range.js"></script>
<script src="assets/js/jquery.bootstrap.wizard.js" type="text/javascript"></script>
<script src="assets/js/jquery.validate.min.js"></script>
<script src="assets/js/wizard.js"></script>
<script src="assets/js/bootbox.js"></script>
<script src="assets/js/main.js"></script>

<script>

    var selectedLoanProduct = 1;
    var loanProduct = null;
    $(document).ready(function () {

        loanProduct = {
            <c:forEach items="${loanProductList}" var="product" varStatus="loop">
            '${product.id}':{
                productId : '${product.id}',
                productName : '${product.productName}',
                defPeriod :'${product.defPeriod}',
                defIntRate :'${product.defIntRate}',
                minAmount : '${product.minAmount}',
                maxAmount : '${product.maxAmount}'
            },
            </c:forEach>
        };
        $("#l-term").text(loanProduct[selectedLoanProduct].defPeriod);
        $("#l-rate").text(loanProduct[selectedLoanProduct].defIntRate+"%");
    });

    function setLoanProductValues(productId) {
        selectedLoanProduct = loanProduct[productId];
        $("#l-term").text(selectedLoanProduct.defPeriod);
        $("#l-rate").text(selectedLoanProduct.defIntRate+"%");
    }

    function submitNewLoan() {
        var loanHistory = $("#l-history").val();
        var customerProperties = $("#c-properties").val();
        var customerBusiness = $("#c-business").val();
        var loanProductId = $("#l-prod").val();
        var loanAmount = $("#l-amt").val();
        var loanTerm = $("#l-term").text();
        var loanRate = $("#l-rate").text();

        $.ajax({
            type: "POST",
            url: 'submitNewLoan',
            contentType : 'application/json',
            data : JSON.stringify({
                "loanHistory":loanHistory,
                "customerProperties":customerProperties,
                "customerBusiness":customerBusiness,
                "loanProductId":loanProductId,
                "loanAmount":loanAmount,
                "loggedInUserId":1
            }),
            success: function (values) {
                //remove record from ui
                bootbox.alert({
                    message : values,
                    backdrop : true,
                    selected : false,
                    callback : function () {
                        window.open("newLoan","_self");
                    }
                }).find('.modal-content').css({
                    'margin-top': 225
                });
            },
            error : function () {
                bootbox.alert({
                    message : "Adding Failed",
                    backdrop : true,
                    selected : false
                }).find('.modal-content').css({
                    'margin-top': 225
                });
            }
        });

    }




</script>


</body>
</html>
