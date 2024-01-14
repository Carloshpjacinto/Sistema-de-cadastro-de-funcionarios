const formulario = document.querySelector("form");

const nameUser = document.getElementById("NameUser");

const ageUser = document.getElementById("AgeUser");

const dateBirth = document.getElementById("dateBirth");

let usersGender;

function genderVeri(){

    if(document.getElementById("masculine").checked){

        usersGender = "Masculino"
        
    }else{

        usersGender = "Feminino"
    }
}

function cadastrar(){
    fetch("http://localhost:8090/api",
        {
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json"
            },
            method: "POST",
            body: JSON.stringify({
                nameUser: nameUser.value,
                ageUser: Number(ageUser.value),
                dateBirth: dateBirth.value,
                usersGender: usersGender
            })
        })
        .then(function(res){console.log(res)})
        .catch(function(res){console.log(res)})
}

function limpar(){

    nameUser.value = "";

    ageUser.value = "";

    dateBirth.value = "";

    usersGender = "";

}

formulario.addEventListener("submit", function(event){

    event.preventDefault();

    genderVeri()

    cadastrar()

    limpar()
})
