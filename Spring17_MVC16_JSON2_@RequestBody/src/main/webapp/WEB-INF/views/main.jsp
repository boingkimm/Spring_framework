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
    		 
    	 	//ajax통신 : JSON을 보내면 (문자열형태로 바꿔서 "json") ==> LoginDTO 받음
   	 		$.ajax({
   			 url:'yyy', //에
   			 type:"post", //형식으로 보냄
   			 
   			 //받는 값
   			 dataType:"text", //응답데이터 타입
   			 headers:{     // 요청 데이터 타입
					"Content-Type":"application/json"
				 },
   			 //전달할 데이터 : json
   			 data:JSON.stringify({userid:"홍길동", passwd:"1234"}), //key: DTO의 변수명
   			 
   			 
   			 success:function(data,status,xhr){
   			 },
   			 error:function(xhr, status, error){
   			 }
   			});//end ajax
 	   	});//end yyy
	 	    
 	    
			//zzz이벤트 
			$("#zzz").on("click", function(){
	   		 
	   	 		//ajax통신 : JSON을 보내면 (문자열형태로 바꿔서 "json") ==> LoginDTO 받음
	  	 		$.ajax({
	  			 url:'zzz', //에
	  			 type:"post", //형식으로 보냄
	  			 
	  			 //받는 값
	  			 dataType:"text", //응답데이터 타입
	  			 headers:{     // 요청 데이터 타입
						"Content-Type":"application/json"
					 },
	  			 //전달할 데이터 : json - 배열
	  			 data:JSON.stringify([{userid:"홍길동1", passwd:"1234"},
	  														{userid:"홍길동2", passwd:"4567"}]), //key: DTO의 변수명
	  			 
	  			 
	  			 success:function(data,status,xhr){
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
