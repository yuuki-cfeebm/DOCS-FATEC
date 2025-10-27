const input = document.querySelector('.input-texto')
const listaTarefas = document.querySelector('.lista-tarefas')

const select = document.querySelector('.select')

const filtro = document.querySelector('.filtro')
const filtroCasa = document.querySelector('#filtro-casa')
const checkboxes = document.querySelectorAll('.filtro')
let contador=0

function adicionarTarefa() {
    if(contador >= 10) { //validação
        alert("Não pode haver mais que 10 tarefas")
        return 
    }

    if(input.value == "") { //validação
        alert("Digite o nome da tarefa")
        return
    }

    const categoria = select.value 
    const li = document.createElement('li')
    contador += 1

    li.id = `span_${contador}_${categoria}`
    li.textContent = `Tarefa: ${input.value}`
    li.classList = `${categoria}`
    
    const btnRemover = document.createElement('button')
    btnRemover.textContent = 'Remover'
    btnRemover.addEventListener('click', () => removerTarefa(li.id))

    li.appendChild(btnRemover)
    listaTarefas.appendChild(li)

    input.value = (" ") //limpa input
}

function removerTarefa(id) {
    const tarefaConcluida = document.getElementById(id)
    console.log(tarefaConcluida)
    tarefaConcluida.remove()
}


function filtrarTarefa() {
    const tarefas = document.querySelectorAll('ul li') //retorna um node list com o li e seu id
    const marcadas = Array.from(document.querySelectorAll('.filtro'))
    .filter(checkbox => checkbox.checked) // primeiro filtra quem está checked
    .map(checkbox => checkbox.value) // depois pega o value de quem está checked, que pode ser casa,trabalho ou faculdade

    tarefas.forEach(li => {
        const liClasse = li.getAttribute('class') //pega o nome da classe li, que é definida pela 'li.classList = `${categoria}`'
        if(marcadas.includes(liClasse)) { //verifica se em marcadas(array), tem liClasse, se tem aplica estilo de display padrão de lista, se não, aplica um display none
            li.style.display = 'list-item'
        console.log("aaaa")

        } else {
            li.style.display = 'none'        
        console.log("bbb")

        }
    })
}
//tenho que pegar o value dos inputs do tipo checkbox, e comparar eles com a variavel 'marcadas', que tem os values das checkboxes que foram marcadas, se marcadas e inputCategorias tiverem o mesmo value aparece a lista, se não, não aparece

//limpar o campo de input e limitar as tarefas, 10 por exemplo,
//dividir em categorias,
//filtro para mostrar uma categoria especifica