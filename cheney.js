$(document).ready(function() {
	$.ajax({
		url: "http://localhost:8080/CheneyThinker/greeting?name=CheneyThinker"
	}).then(function(data) {
		$('.greeting-id').append(data.id)
		$('.greeting-content').append(data.content)
	})
})