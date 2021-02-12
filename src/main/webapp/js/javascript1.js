document.addEventListener("DOMContentLoaded", function() {
console.log("zaladowanie dokumentu js");
    /*
    HOMEPAGE
     */

    var submitButtonForm = document.getElementById("submit-button-form");
    submitButtonForm.addEventListener("click", function() {

        var form = document.getElementById("div-form-and-logo");
        form.toggleAttribute("visible");
        form.toggleAttribute("invisible");

        var pInformationAfterForm = document.getElementById("p-information-after-form");
        pInformationAfterForm.classList.toggle("invisible");
        pInformationAfterForm.classList.toggle("visible");
    })

});

