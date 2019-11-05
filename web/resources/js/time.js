$(document).ready(function(){
    showTime();
    setInterval(function(){
        showTime();
    }, 13000)
})
function showTime() {
    let date = new Date();
    let day = (date.getDate() < 10 ? "0" : "") + date.getDate();
    let month = (date.getMonth() < 10 ? "0" : "") + date.getMonth();
    let year = date.getFullYear();
    let hour = (date.getHours() < 10 ? "0" : "") + date.getHours();
    let minute = (date.getMinutes() < 10 ? "0" : "") + date.getMinutes();
    let seconde = (date.getSeconds() < 10 ? "0" : "") + date.getSeconds();
    $("#time").html(day + "." + month + "." + year + " " + hour + ":" + minute + ":" + seconde);
}