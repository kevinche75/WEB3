let isDefinedX = false;
let R = 0;
function validateForm(){
    $("#messageX").html("<br/>");
    let flag = true;
    if(!isDefinedX){
        $("#messageX").html("Выберите одно из значений X");
        flag = false;
    }
    if(!validateY()){
        flag = false;
    }
    if(!validateR()){
        return false;
    }
    return flag;
}

function validateY(){
    let y = $('#Y').val().trim();
    $("#messageY").html("<br/>");
    if(y==""){
        $("#messageY").html("значение Y должно быть числом в диапозоне (-5;5)");
    } else {
        if(!/^(-?\d+)([.,]\d+)?$/.test(y)) {
            $("#messageY").html("значение Y должно быть числом в диапозоне (-5;5)");
        } else {
            y = y.replace(',','.');
            y = Number(y);
            if (!(y > -5 && y < 5)) {
                $("#messageY").html("значение Y должно быть числом в диапозоне (-5;5)");
            } else {
                return true;
            }
        }
    }
    return false;
}

function validateR(){
    let radius = $("#R").val().trim();
    $("#messageR").html("<br/>");
    if(radius==""){
        $("#messageR").html("значение R должно быть числом в диапозоне (1;4)");
    } else {
        if(!/^(-?\d+)([.,]\d+)?$/.test(radius)) {
            $("#messageR").html("значение R должно быть числом в диапозоне (1;4)");
        } else {
            radius = radius.replace(',','.');
            radius = Number(radius);
            if (radius > 1 && radius < 4) {
                return true;
            } else {
                $("#messageR").html("значение R должно быть числом в диапозоне (1;4)");
            }
        }
    }
    return false;
}

$(document).ready(function(){
    let plot = document.getElementById("areas");
    let ctx = plot.getContext('2d');
    plot.addEventListener("click", clickCanvas, false);
    refresh();
    $('#R').val('');
    $('#formHiddenR').val('');
    paint(0);
    $('#result').bind("DOMSubtreeModified",function(){
        drawPoints();
        refresh();
    });

    function refresh() {
        $('#Y').val('');
        $('#formHiddenX').val('');
        $('#formHiddenY').val('');
        for(let i=-5; i<4;i++){
            $('#cL'+i).css('color','#5F5FBD');
        }
        $('#messageR').html('<br/>');
        $('#messageX').html('<br/>');
        $('#messageY').html('<br/>');
        isDefinedX = false;
    }

    function drawPoints(){
        let rows = $('table').find('tr');
        let number = rows.length;
        console.log(number);
        for(let i = 1; i < number; i++){
            let tdSet = $(rows[i]).find('td');
            let r = Number($(tdSet[2]).text().trim());
            let R = Number($('#formHiddenR').val());
            if(r == R) {
                if ($(tdSet[3]).text().trim() == 'true') {
                    ctx.fillStyle = 'green';
                } else {
                    ctx.fillStyle = 'red';
                }
            } else {
                ctx.fillStyle = 'grey';
            }
            if(String($(tdSet[0]).text().trim())!=""){
                paintPoint($(tdSet[0]).text(), $(tdSet[1]).text());
            }
            console.log($(tdSet[0]).text(), $(tdSet[1]).text(),$(tdSet[3]).text());
        }
    }

    function paintPoint(x, y){
        let xPoint = x*25 + 135;
        let yPoint = -y*25+135;
        ctx.beginPath();
        ctx.arc(xPoint, yPoint, 3, 0, Math.PI*2, false);
        ctx.closePath();
        ctx.fill();
    }
    for(let i=-5; i<4;i++){
        $('#cL'+i).click(function () {
            changeX(i)
        });
    }

    $('#R').blur( function () {
        if(validateR()){
            R = Number($(this).val().trim().replace(',','.'));
            $('#formHiddenR').val(R);
            paint(R * 25);
        }
        drawPoints();
    });

    $('#Y').blur( function () {
        if(validateY()){
            let Y = Number($(this).val().trim().replace(',','.'));
            $('#formHiddenY').val(Y);
        }
    });

    function changeX(valueX) {
        $("#messageX").html("<br/>");
        for(let i=-5; i<4;i++){
            $('#cL'+i).css('color','#5F5FBD');
        }
        $('#cL'+valueX).css('color','#1C0A5E');
        $('#formHiddenX').val(valueX);
        isDefinedX = true;
    }

    function paint(R){
        ctx.fillStyle = "#fff";
        ctx.fillRect(0,0, 270, 270);
        ctx.fillStyle = "#66C1FF";
        ctx.fillRect(135.5, 135.5-R/2, R, R/2);
        ctx.beginPath();
        ctx.arc(135.5, 135.5, R, Math.PI/2, Math.PI, false);
        ctx.lineTo(135.5,135.5);
        ctx.closePath();
        ctx.fill();
        ctx.beginPath();
        ctx.moveTo(135,135);
        ctx.lineTo(135, 135-R/2);
        ctx.lineTo(135-R, 135);
        ctx.closePath();
        ctx.fill();

        ctx.fillStyle = "#000";
        ctx.beginPath();
        ctx.moveTo(135, 270);
        ctx.lineTo(135, 0);
        ctx.moveTo(130, 8);
        ctx.lineTo(135,0);
        ctx.lineTo(140, 8);

        ctx.moveTo(0, 135);
        ctx.lineTo(270, 135);
        ctx.moveTo(262, 130);
        ctx.lineTo(270, 135);
        ctx.lineTo(262, 140);
        for(let i = 10; i<261; i+=25){
            ctx.moveTo(i, 130);
            ctx.lineTo(i, 140);
            ctx.moveTo(130, i);
            ctx.lineTo(140, i);
        }
        ctx.stroke();
        ctx.font = "bold 12px sans-serif";
        ctx.fillText("x", 260, 145);
        ctx.fillText("y", 145, 10);
    }

    function clickCanvas(e){
        let x = (e.offsetX-135)/25;
        let y = -(e.offsetY-135)/25;
        $('#formHiddenX').val(x);
        $('#formHiddenY').val(y);
        if(validateR()) canvasAction();
    }
});