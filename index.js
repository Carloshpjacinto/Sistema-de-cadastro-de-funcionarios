function Cadastrar(){

    anoAtual = new Date();

    nameUser = document.getElementById("NameUser").value

    ageUser = document.getElementById("AgeUser").value

    dateBirth = document.getElementById("dateBirth").valueAsDate

    console.log(nameUser)

    console.log(ageUser)

    if(anoAtual.getUTCFullYear() - dateBirth.getUTCFullYear() < 15){

        console.log("Idade não permitida")

    }else{

        console.log(dateBirth.getUTCDate() + "/" + Number(dateBirth.getUTCMonth() + 1)  + "/" + dateBirth.getUTCFullYear())

    }

    if(document.getElementById("masculine").checked){

        console.log("Masculino")

    }else{
        console.log("Feminino")

    }
}
