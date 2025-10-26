const input = document.querySelector('.input-texto')
const listaTarefas = document.querySelector('.listaTarefas')

const select = document.querySelector('.select')

const optionCasa = document.querySelector('.tarefa-casa')
const optionTrabalho = document.querySelector('.tarefa-trabalho')
const optionFaculdade = document.querySelector('.tarefa-faculdade')

let contador=0


function adicionarTarefa() {
    if(contador >= 10) { //validação
        alert("Não pode haver mais que 10 tarefas")
        return 
    }

    li = document.createElement('li')

    contador += 1
    
    li.innerHTML = `
    <span id="span_${contador}">${input.value}</span>
    <button onclick="removerTarefa('span_${contador}')">remover</button>
    `

    const opcao = select.value
    console.log(opcao)

    listaTarefas.appendChild(li)
}

function removerTarefa(id) {

    const tarefaConcluida = document.getElementById(id)
    tarefaConcluida.parentElement.remove()
}



//limpar o campo de input e limitar as tarefas, 10 por exemplo,
//dividir em categorias,
//filtro para mostrar uma categoria especifica