
function initSend(){
    showLastActivityDetails();

    $("#commandsForm").submit(function(e) {
        console.log($("#commandsForm").serialize())
        $.ajax({
               type: "POST",
               url: '/app4hab/api/control/commands/',
               data: $("#commandsForm").serialize(),
               contentType: "text/plain",
               success: function(data)
               {
                   showLastActivityDetails()
               },
               error: function(jqXHR, exception)
               {
                   alert("Błąd: " + jqXHR.status);
               }
             });
        e.preventDefault();
    });
}

function showLastActivityDetails(){
    $("#CodeArea").text("...");

    $.ajax({
      url: "/app4hab/api/control/lastcommands/",
      success: function(result){
          console.log(result);
          $("#CodeArea").html(syntaxHighlight(result));
      }
    });
}

