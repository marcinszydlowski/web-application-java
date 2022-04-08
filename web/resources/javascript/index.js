//--front-end--//

//check if user inserted any data to inputs before sending the form
function checkInput() {
    let user = document.forms["loginForm"]["username"].value
    let pass = document.forms["loginForm"]["password"].value
    if (user === "" || pass === "") {
        alert("Please enter your credentials before trying to sign in.")
        return false;
    }
    else {
        return true;
    }
}

$(function(){
    function jquery() {
        $("#btn").hide()
        console.log("jquery loaded")
    }
    jquery()
});
