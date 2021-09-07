$(document).ready(function(){
	$('#submit').click(function(event){
		var email = $('input[name*="email"]');
	    var pword = $('input[name*="pword"]');
	    var radio = $('input[name*="employeeOrManager"]');
	    $.get('/login',{email:email,password:pword,employeeOrManager:radio},function(text){
		$('#error').text(text);
		});
	});
});