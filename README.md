<html>
<head>  </head>

<body>
  <div>
    <h3 align="center"> 
      <img align="center" alt="Kotlin" height="50" width="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg" />
      Interagindo com o Banco de Dados - "Meus contatos"
      <img align="center" alt="Kotlin" height="80" width="80" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original-wordmark.svg" />
    </h3>
    
##

<div align="justify">

 <h5>MainActivity </h5>
 A classe MainActivity estende ComponentActivity, que é parte do Jetpack Activity, e é responsável por hospedar a interface do usuário Compose.
 No método onCreate, o tema da aplicação é definido como MeusContatosTheme, e a interface do usuário é configurada através de um Surface e uma coluna contendo a tela de contatos (ContatosScreen).
  
 <h5>ContatosScreen</h5>
 ContatosScreen é uma função @Composable que define a tela principal da aplicação.
 Um contexto (context) e uma instância de ContatoRepository são criados.
 Variáveis de estado (nomeState, telefoneState, amigoState, listaContatosState) são criadas usando o remember.
 A tela é composta por um formulário de contato (ContatoForm) e uma lista de contatos (ContatoList).
    
 <h5>ContatoForm</h5>
 ContatoForm é uma função @Composable que representa o formulário para cada contato.
 Campos de entrada de texto (OutlinedTextField) são utilizados para o nome e o telefone do contato.
 Um Checkbox é usado para indicar se o contato é um amigo.
 Um botão "CADASTRAR" é fornecido para adicionar o contato à lista.
    
 <h5>ContatoList</h5>
 ContatoCard é uma função @Composable que representa visualmente um cartão para um contato específico.
 Utiliza um Card contendo informações sobre o contato (nome, telefone, se é um amigo) e um ícone de lixeira (Delete) para excluir o contato.
 A exclusão do contato é realizada através do ContatoRepository, e a lista é atualizada chamando a função atualizar.
    
 <h5>Observações Gerais:</h5>
 O código faz uso extensivo do Jetpack Compose para construir interfaces de usuário declarativamente.
 A persistência de dados é gerenciada por ContatoRepository, que interage com a base de dados.
 Funções de callback (onNomeChange, onTelefoneChange, onAmigoChange, atualizar) são utilizadas para manipular mudanças nos estados e atualizar a interface do usuário.
 Elementos visuais como cores, tamanhos de texto, e espaçamentos são configurados de acordo com o tema do aplicativo e requisitos de design.
 
 </div>
 


</body>
</html>
