<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pahansith
  Date: 10/5/2017
  Time: 12:26 PM
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
    <title>Add New Member</title>
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
                            <a href="new-member">New Member</a>
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
                    <form action="saveNewCustomer" method="POST">
                        <div class="wizard-header">
                            <h3>
                                <b>Submit</b> New Customer <br>
                                <small>Add Customer Details</small>
                            </h3>
                        </div>

                        <ul>
                            <li><a href="#step1" data-toggle="tab">Basic Details </a></li>
                            <li><a href="#step2" data-toggle="tab">Contact Details </a></li>
                            <li><a href="#step3" data-toggle="tab">Property/Business Detail </a></li>
                            <li><a href="#step4" data-toggle="tab">Account Details </a></li>
                        </ul>

                        <div class="tab-content">
                            <div class="tab-pane" id="step1">
                                <h4 class="info-text">Basic Details </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label for="salutation">Salutation :</label>
                                            <select id="salutation" name="salutation" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Mr </option>
                                                <option>Mrs</option>
                                                <option>Ms</option>
                                                <option>Ven</option>
                                                <option>Dr</option>

                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="fName">First Name :</label>
                                            <input id="fName" class="form-control" value="" placeholder="First Name" name="fName" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="lName">Last Name :</label><br>
                                            <input id="lName" class="form-control" value="" placeholder="Last Name" name="lName" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="nic">NIC :</label>
                                            <input id="nic" class="form-control" value="" placeholder="NIC" name="nic" type="nic">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--  End step 1 -->


                            <div class="tab-pane" id="step2">
                                <h4 class="info-text">Contact Details </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label for="address-1">Address Line 1 :</label>
                                            <input id="address-1" class="form-control" value="" placeholder="Address Line 1" name="address_1" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="address-2">Address Line 2 :</label>
                                            <input id="address-2" class="form-control" value="" placeholder="Address Line 2" name="address_2" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="address-3">Address Line 3 :</label>
                                            <input id="address-3" class="form-control" value="" placeholder="Address Line 3" name="address_3" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="hometown">Home Town :</label>
                                            <input id="hometown" class="form-control" value="" placeholder="Home Town" name="hometown" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="mobile">Mobile :</label><br>
                                            <input id="mobile" class="form-control" value="" placeholder="Mobile" name="mobile" type="text">
                                        </div>
                                        <div class="form-group">
                                            <label for="telephone">Telephone :</label>
                                            <input id="telephone" class="form-control" value="" placeholder="Telephone" name="telephone" type="text">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--  End step 2 -->

                            <div class="tab-pane" id="step3">
                                <h4 class="info-text">Property Details </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label for="business">Business Status :</label>
                                            <select id="business" name="business" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Owned</option>
                                                <option>Government</option>
                                                <option>Private</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="financial">Financial Status :</label>
                                            <select id="financial" name="financial" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Good</option>
                                                <option>Potentially Growth</option>
                                                <option>Stable</option>
                                                <option>Risky</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="tab-pane" id="step4">
                                <h4 class="info-text">Account Details </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label for="provinceList">Province :</label>
                                            <select id="provinceList" name="provinceList" class="selectpicker" data-live-search="true"
                                                    data-live-search-style="begins" title="Select Province">
                                                <c:forEach items="${provinceList}" var="list">
                                                    <option value="${list.provinceId}">${list.provinceName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>

                                        <div class="form-group">
                                            <label for="branchList">Branch :</label>
                                            <select id="branchList" name="branchList" class="selectpicker" data-live-search="true"
                                                    data-live-search-style="begins" title="Select Branch">

                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="societyList">Society :</label>
                                            <select id="societyList" name="societyList" class="selectpicker" data-live-search="true"
                                                    data-live-search-style="begins" title="Select Society">
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="groupList">Group :</label>
                                            <select id="groupList" name="groupList" class="selectpicker" data-live-search="true"
                                                    data-live-search-style="begins" title="Select Group">
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>

                        <div class="wizard-footer">
                            <div class="pull-right">
                                <input type='button' class='btn btn-next btn-primary' name='next' value='Next'/>
                                <input type='submit' class='btn btn-finish btn-primary ' name='finish' value='Save' onclick="submitRecords()" style="margin-left: 10px;width: 90%"/>
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
    $("#provinceList").on("change",function () {
        var id = $("#provinceList").val();
        $.ajax({
            type: "POST",
            url: "getSelectedBranch",
            data :{provinceId:id},
            success: function (values) {
                $('#branchList').empty();
                var jsonArr = JSON.parse(values);
                jsonArr.forEach(function (t) {
                    $('#branchList')
                        .append($("<option></option>")
                            .attr("value",t.branchId)
                            .text(t.name));
                });

                $('.selectpicker').selectpicker('refresh');



            }
        });
    });

    $("#branchList").on("change",function () {
        var id = $("#branchList").val();
        $.ajax({
            type: "POST",
            url: "getSelectedSociety",
            data :{branchId:id},
            success: function (values) {
                $('#societyList').empty();
                var jsonArr = JSON.parse(values);
                jsonArr.forEach(function (t) {
                    $('#societyList')
                        .append($("<option></option>")
                            .attr("value",t.societyId)
                            .text(t.societyName));
                });

                $('.selectpicker').selectpicker('refresh');
            }
        });
    });

    $("#societyList").on("change",function () {
        var id = $("#societyList").val();
        $.ajax({
            type: "POST",
            url: "getSelectedGroup",
            data :{socId:id},
            success: function (values) {
                $('#groupList').empty();
                var jsonArr = JSON.parse(values);
                jsonArr.forEach(function (t) {
                    $('#groupList')
                        .append($("<option></option>")
                            .attr("value",t.groupId)
                            .text(t.groupName));
                });

                $('.selectpicker').selectpicker('refresh');
            }
        });
    });
</script>

</body>
</html>
