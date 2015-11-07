$(function(){
	$('[data-toggle="tooltip"]').tooltip();
});


$("#form-user-login").submit(function(event){
	
	var username = $("#username").val();
	var password = $("#password").val();
	
	if(username.length > 0 && password.length > 0){
		$("#form-user-login").submit();
	}else{
		$("#user-login-warning").html("<p>Usu&aacuterio ou senha inv&aacutelidos.</p>");
		$("#user-login-warning").removeClass("hidden");
	}
	
	event.preventDefault();
});


