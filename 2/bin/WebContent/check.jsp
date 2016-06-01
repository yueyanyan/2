<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>

<title>guitar</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/css.css" />
<script type="text/javascript" src="js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/sdmenu.js"></script>


</head>

<body>
<div class="header">
	 <div class="logo"><img  src="img/logo1.png" /></div>
     
				
</div>
<!-- 顶部 -->     
            
<div id="middle">
     <div class="left">
     
     <script type="text/javascript">
var myMenu;
window.onload = function() {
	myMenu = new SDMenu("my_menu");
	myMenu.init();
};
</script>


 
     </div>
     <div class="Switch"></div>
     <script type="text/javascript">
	$(document).ready(function(e) {
    $(".Switch").click(function(){
	$(".left").toggle();
	 
		});
});
</script>

     <div class="right"  id="mainFrame">
     
   

   <div class="title_right"><strong>查询清单</strong></div>  
   <div style="width:900px; margin:auto">
   <form action="select" method="post">
       <table width="101%" class="table table-bordered">
           <tr>
             <td width="20%"><input type="text" name="quantity" id="Input"  class="span1-1" />
           <input name="submit" type="submit" class="btn btn-info  " style="width:80px;" value="查询" />
             </td>
           </tr>
         </table>
        
	 
       <table class="table table-bordered">
         <tr>
           <td align="center" nowrap="nowrap" bgcolor="#f1f1f1"><strong>编号</strong></td>
           <td align="center" nowrap="nowrap" bgcolor="#f1f1f1"><strong>型号</strong></td>
           <td align="center" nowrap="nowrap" bgcolor="#f1f1f1"><strong>材质</strong></td>
           <td align="center" nowrap="nowrap" bgcolor="#f1f1f1"><strong>品牌</strong></td>
           <td align="center" nowrap="nowrap" bgcolor="#f1f1f1"><strong>价格</strong></td>
           <td align="center" nowrap="nowrap" bgcolor="#f1f1f1"><strong>剩余库存</strong></td>
         </tr>
          <tr>
        
           <td align="center">&nbsp;</td>
           <td align="center">&nbsp;</td>
           <td align="center">&nbsp;</td>
           <td align="center">&nbsp;</td>
           <td align="center">&nbsp;</td>
           <td align="center">&nbsp;</td>
         </tr>
       </table>
      </form> 
      
 	<c:forEach var="goods" items="${requestScope.list}">
      	<tr align="center">
      		<td>${goods.number}</td>
      		<td>${goods.type}</td>
      		<td>${goods.material}</td>
      		<td>${goods.brand}</td>
      		<td>${goods.price}</td>
      		<td>${goods.quantity}</td>
      	</tr>  
      </c:forEach>   
      
</div>
     
     
     </div>     
     </div>

<!-- 底部 -->

 <script>
	!function(){
		laydate.skin('molv');
		laydate({elem: '#Calendar'});
			}();

</script>

</body>
</html>
