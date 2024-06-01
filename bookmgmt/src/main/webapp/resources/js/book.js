$(document).ready(function() {

bookDataTable();
var $loading = $('#loading').hide();

	$(document).ajaxStart(function() {
		$loading.show();
	}).ajaxStop(function() {
		$loading.hide();
	});

});


function bookDataTable() {

	$('#bookdataTable').dataTable(
			{
//http://localhost:8082/book-mgmt/book/getAllDetails
				"ajax": {
					"url": "book/getAllDetails",
					"type": 'GET',
					"datatype": "json",
					"dataSrc": ""
				},
				"columns": [
					{
						"data": "id"
					},
					{
						"data": "bookName"
					},
					{
						"data": "price"
					},
					{
						"data": "remarks"
					},{
                'mRender': function (data, type, row,meta) {
                 var id = row.id;                                                                  
                 return '<a href="#" type="buttonclick" class="button" onclick="getbyID(' + id + ')">Edit</a>';
                  }
	               }
					
					
					],

			});

}



function getbyID(id){

	$("#bookid").val(id);
	
	$.ajax({
		url : "books/getBookDetailsById",
		type :"GET",
		data :{
			'id' : id,
		},
		success : function(data) {
			
			$("#bookname").val(data.bookName);
			$("#bookprice").val(data.price);
			$("#remarks").val(data.remarks);
			
			$("#saveBookDetails").val("Update");

			$( "#myForm" ).show();

		}
	});


}

function refreshPage(){
    window.location.reload();
} 