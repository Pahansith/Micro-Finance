<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pahansith
  Date: 10/4/2017
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>New Loan</title>
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
                        <li>
                            <a href="issue-loan">Loan Issue</a>
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

<!-- Search Bar -->
<div class="row">
    <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-12">
        <h2>New Loan</h2>
        <p>Search by 3 steps. 1st you should define the province of the customer, then the branch and finally the
            society</p>
        <div class="search-form wow pulse" data-wow-delay="0.8s">

            <form action="" id="submitForm" method="post" class=" form-inline" style="margin-left: 10px;">
                <%--<button class="btn  toggle-btn" type="button"><i class="fa fa-bars"></i></button>--%>

                <div class="form-group">
                    <select id="provinceList" class="selectpicker" data-live-search="true"
                            data-live-search-style="begins" title="Select Province">
                        <c:forEach items="${provinceList}" var="list">
                            <option value="${list.provinceId}">${list.provinceName}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <select id="branchList" class="selectpicker" data-live-search="true"
                            data-live-search-style="begins" title="Select Branch">
                    </select>
                </div>
                <div class="form-group">
                    <select id="societyList" class="selectpicker" data-live-search="true"
                            data-live-search-style="begins" title="Select Society">
                    </select>
                </div>
                <button id="searchLoanList" class="btn search-btn" type="button"><i class="fa fa-search"></i></button>
            </form>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-12">
        <div class="form-group">
            <table class="table table-responsive" id="loanListTable">
                <thead>
                    <th>ID</th>
                    <th>Name</th>
                    <th>NIC</th>
                    <th>Home Town</th>
                    <th>Group</th>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            akjs
                        </td>
                        <td>
                            akjs
                        </td>
                        <td>
                            akjs
                        </td>
                        <td>
                            akjs
                        </td>
                        <td>
                            <button class="btn btn-default" type="button" onclick="goLoanAddView()">New Loan</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>


<script src="assets/js/modernizr-2.6.2.min.js"></script>

<script src="assets/js/jquery-1.10.2.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/bootstrap-select.min.js"></script>
<script src="assets/js/bootstrap-hover-dropdown.js"></script>

<script src="assets/js/easypiechart.min.js"></script>
<script src="assets/js/jquery.easypiechart.min.js"></script>

<script src="assets/js/owl.carousel.min.js"></script>
<script src="assets/js/wow.js"></script>

<script src="assets/js/icheck.min.js"></script>
<script src="assets/js/price-range.js"></script>

<script src="assets/js/main.js"></script>

<script>

    function goLoanAddView(customerId) {
        var url = "loanAddView?mem-id="+customerId+"";
        var $frm = $("#submitForm");
        $frm.attr('action',url);
        $frm.submit();
    }

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

    $("#searchLoanList").on("click",function () {

        var societyId = $("#societyList").val();

        $.ajax({
            type: "POST",
            url: "getLoanMemberList",
            data :{societyId:societyId},
            success: function (values) {
                $('#loanListTable > tbody').html("");
                var jsonArr = JSON.parse(values);
                var rowList = "";
                jsonArr.forEach(function (t) {
                    rowList+='<tr>' +
                        '<td>'+t.memberId+'</td>' +
                        '<td>'+t.fulName+'</td>' +
                        '<td>'+t.nic+'</td>' +
                        '<td>'+t.hometown+'</td>' +
                        '<td>'+t.group+'</td>' +
                        '<td><button class="btn btn-default" type="button" onclick="goLoanAddView('+t.memberId+')">New Loan</button></td>'+
                        '</tr>';
                });

                $('#loanListTable > tbody').append(rowList);

                $('.selectpicker').selectpicker('refresh');
            }
        });

    });

</script>
</body>
</html>
