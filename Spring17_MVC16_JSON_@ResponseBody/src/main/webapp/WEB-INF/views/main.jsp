<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
   
     $(document).ready(function(){
    	 
    	 //yyy이벤트 
    	 $("#yyy").on("click", function(){
    		 
    	 	//ajax통신 (Controller의 yyy와 통신, 받는 데이터: JSON)
   	 		$.ajax({
   			 url:'yyy',
   			 type:"get",
   			 dataType:"json",
   			 success:function(data,status,xhr){
   				 console.log(data);
   				 console.log(data.userid);
   				 var str = JSON.stringify(data); //JSON --> 문자열(str)로 변경
   			 },
   			 error:function(xhr, status, error){
   			 }
   			});//end ajax
 	    });//end yyy
 	    
 	    
   	 //zzz이벤트 
   	 $("#zzz").on("click", function(){
   		 
   	 	//ajax통신 (Controller의 zzz와 통신, JSON 사용)
  	 		$.ajax({
  			 url:'zzz',
  			 type:"get",
  			 dataType:"json",
  			 success:function(data,status,xhr){
  				 console.log(data);
  				 
  				 //배열 반복
					 $.each(data, function(idx,ele){
						 console.log(ele);
						 console.log(ele.userid);
					 });
  				 
  				 var str = JSON.stringify(data); //JSON --> 문자열(str)로 변경
  			 },
  			 error:function(xhr, status, error){
  			 }
  			});//end ajax
	    });//end zzz
	    
	    
 	    
     });//end document

</script>
</head>
<body>
<button id="yyy">yyy</button>
<button id="zzz">zzz</button>
</body>
</html>
