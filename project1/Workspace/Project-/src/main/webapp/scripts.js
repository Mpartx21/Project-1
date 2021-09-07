$(document).ready(function(){
	$('#submit').click(function(event){
		var email = $('input[name*="email"]').val();
	    var pword = $('input[name*="pword"]').val();
	    var radio = $('input[name*="employeeOrManager"]').val();
	    $.get('/login',{email:email,password:pword,employeeOrManager:radio},function(text){
		$('#error').text(text);
		});
	});
});//