function sendTestAjax() {
    console.log("SendTestAjax");
    
    $.ajax({
      url: "/app4hab/api/test",
      success: function(result){
          console.log(result);
      }
    });
}


function initPage(){
    console.log("initPage");
    updateLastActivity();
}


function updateLastActivity(){
    console.log("Last activity") 
    
    $.ajax({
      url: "/app4hab/api/control/lastactivity",
      success: function(result){
          console.log("Last activity result:")
          console.log(result);
          
          var date = unixToReadableDate(result["timestamp"]);
          var ago = calculateTimeAgo(result["timestamp"]);
          $('#LastActivityTime').text(date);
          $('#LastActivityAgo').text(ago);
      }
    });
}


function unixToReadableDate(unixTime){
    var date = new Date(unixTime);

    var d = date.toLocaleDateString();
    var t = date.toLocaleTimeString();
    return d + " " + t;
} 

function calculateTimeAgo(unixTime){
    var date = new Date(Date.now() - unixTime);
    
    var days = 0;
    var res = "";

    days += (date.getFullYear() - 1970) * 365;
    days += date.getMonth() * 30;
    days += date.getDate() - 1;
            
    var hours = date.getHours() - 1;
    var minutes = date.getMinutes();
    var seconds = date.getSeconds();
    
    if (days != 0) res += days + "d "
    if (hours != 0) res += hours + "h "
    if (minutes != 0) res += minutes + "m "
    if (seconds != 0) res += seconds + "s "

    return res;
}