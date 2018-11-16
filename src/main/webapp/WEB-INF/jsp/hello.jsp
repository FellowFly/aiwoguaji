<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ taglib prefix="bls" uri="http://www.critc.com/jsp/jstl/tags"%>--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        #select{
            margin:100px;
            background: rgba(0,0,0,0);
            width: 249px;
            height: 40px;
            font-family: "微软雅黑";
            font-size: 18px;
            color: white;
            border: 1px #1a1a1a solid;
            border-radius: 5px;
        }
        .select-head{
            overflow: hidden;
            width: 249px;
            height: 40px;
            box-sizing: border-box;
            padding: 0 10px;
            line-height: 40px;
        }
        .select-head .select-head-cont{
            float: left;
        }
        .select-head .select-icon{
            float: right;
        }
        .option{
            text-indent: 10px;
            margin-top: 1px;
            width: 249px;
            color: black;
            background: rgba(236,111,111,0.1);
            line-height: 25px;
            border: 1px #cfcfcf solid;
            display: none;
        }
        .option-item:hover{
            background: rgba(204,106,67,0.3);
        }
input {
    width: 400px;
    height: 100px;
    margin: 0 auto;
}
table
{
    border-collapse: collapse;
    margin: 0 auto;
    text-align: center;
}
table td, table th
{
    border: 1px solid #cad9ea;
    color: #666;
    height: 30px;
}
table thead th
{
    background-color: #CCE8EB;
    width: 100px;
}
table tr:nth-child(odd)
{
    background: #fff;
}
table tr:nth-child(even)
{
    background: #F5FAFA;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
</head>
<body>


<select  id="moshi">
    <option value="1"  selected>电器类</option>
    <option value="2" >厨房设备</option>
    <option value="3" >家具</option>
</select>
<input id="money" name="money"></input>
<div >
    <table id="table">
        <caption>
            <h2>
                鲸起网</h2>
        </caption>
        <thead>
        <tr>
            <th>
                使用年限
            </th>
            <th>
                代卖评估价（元）
            </th>
            <th>
                鲸起网佣金收益
            </th>
            <th>
                客户回款
            </th>
            <th>
                现金回收价（元）
            </th>
        </tr>
        </thead>
        <tbody id="tbody">

        </tbody>
    </table>

</div>
<script src="<c:url value="/js/jq/jquery-3.3.1.min.js"/>"></script>
<script type="text/javascript">
    $('#table').hide();
    $(function(){
        var   isTrue=false;
        $("#money").on('input',function(){
            var money=$("#money").val();
            var  moshi=$("#moshi").val();;

            if(money==""){

            }else {
                $.ajax({
                    url:"<c:url value='/calculate/su'/>",
                    type: "get",
                    dataType: "json",
                    data: {money: money, moshi: moshi},
                    success: function (json) {
                        if(json.success){
                            $('#table').show();
                            $('#table').removeClass("display");
                            $("#tbody").empty();
                            for(var i=0;i<json.data.length;i++){
                                var $trTemp = $("<tr></tr>");

                                //往行里面追加 td单元格
                                $trTemp.append("<td>"+ (i+1)+"年" +"</td>");
                                $trTemp.append("<td>"+ json.data[i].dMoney+"￥" +"</td>");
                                $trTemp.append("<td>"+ json.data[i].sMoney+"￥" +"</td>");
                                $trTemp.append("<td>"+ json.data[i].dkMoney+"￥" +"</td>");
                                $trTemp.append("<td>"+ json.data[i].xMoney+"￥"+"</td>");
                                // $("#J_TbData").append($trTemp);
                                $trTemp.appendTo("#tbody");

                                // var newRow=table.insertRow();
                                // newRow.setAttribute("align","center");
                                // var newcellname=newRow.insertCell(0);
                                // newcellname.innerHTML=i+1+"年";
                                // var newcellname=newRow.insertCell(1);
                                // newcellname.innerHTML=json.data[i].dMoney+"￥";
                                // var newcellname=newRow.insertCell(2);
                                // newcellname.innerHTML=json.data[i].sMoney+"￥";
                                // var newcellname=newRow.insertCell(3);
                                // newcellname.innerHTML=json.data[i].dkMoney+"￥";
                                // var newcellname=newRow.insertCell(4);
                                // newcellname.innerHTML=json.data[i].xMoney+"￥";
                            }
                            // document.getElementById("a").appendChild(table);
                        }else {
                            console.info()
                            $('#table').hide();
                           $("#tbody").empty();

                        }

                    }
                })
            }
        });

    })

</script>
</body>
</html>
