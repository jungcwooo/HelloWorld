<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#show {
	width: 500px;
	height: 300px;
	border: 1px solid blue;
}
</style>
</head>
<body>
	<%
	String user = request.getParameter("정철우");
	%>

	<div id="show">
		<div class="row">user1> test</div>
	</div>
	<input type="text" name="content">
	<input type="hidden" name="writer" value="<%=user%>">

	<script>
	document.querySelector('input[name="content"]').addEventListener('change', changeCall)
	
	function changeCall(e){
		let content = document.querySelector('input[name="content"]').value;
		let writer = document.querySelector('input[name="writer"]').value;
		
		fetch('message',{
			method: 'post',
			headers: {'Content-type': 'application/x-www-form-urlencoded'},
			body: 'writer='+ writer + '&content=' + content
		})
			.then(resolve => {
				console.log(resolve)
				e.target.value = '';
				})
			.catch(err =>  console.log(err));
	}
	
	
		setInterval(e => {
			fetch('message')
				.then(result => result.json())
					.then(resolve => {
						let divs = document.querySelectorAll('.row')
						divs.forEach(el => el.remove());
						
						/*fitAry = resolve.filter(el => {
							return el.msgId > lastMessageId -10;
						})*/
						
						
						let show = document.getElementById('show');
						resolve.forEach(row => {
							//lastMessageId = row.msg_id
							let div = createRow(row);
							show.append(div);
						});
						
					})
						.catch(error =>  console.log(error));
		},3000);
		
		function createRow(message){
			let div = document.createElement('div');
			div.setAttribute('class','row');
			let txt =document.createTextNode(message.Writer +'> '+ message.content);
			div.append(txt);
			
			return div;
		}
		
	</script>
</body>
</html>