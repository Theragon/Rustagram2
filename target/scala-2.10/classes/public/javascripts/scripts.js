/**
 * Created with IntelliJ IDEA.
 * User: logan
 * Date: 11/21/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */

$(document).ready(function(){
    $( "#comment" ).click(function(e) {
        var text = $('#commentText').val();
        var id = $(".image").attr('id');

        console.log(text);
        console.log(id);


        $.ajax({
         type: "POST",
         url: "http://localhost:9000/image/"+id,
         data: {'text': text,
                'imageId': id },
         success: commentPosted(),
         dataType: "json"
         });
    });

    function commentPosted()
    {
        $('#commentText').val('');
        console.log("comment has been posted");
    }
});
