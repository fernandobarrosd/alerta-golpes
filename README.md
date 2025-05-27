# Aplicativo AlertaGolpes

É um aplicativo onde os usuários podem desabafar sobre algum golpe que esteja acontecendo e alertar os outros usuários sobre.

## Por que essa ideia foi pensada?
Atualmente acontencem muitos golpes na internet e o aplicativo vai facilitar justamente na parte de alertar os usuários sobre algum golpe que esteja acontecendo.


## Requisitos funcionais
- O usuário pode se autenticar no aplicativo usando uma conta do Google.
- Pro usuário poder usar o aplicativo é necessário que ele se autentique no aplicativo.
- Os usuários poderem cadastrar posts sobre algum golpe.
- Os usuários poderem comentar em posts de golpes que eles já publicaram.
- Os usuários poderem editar ou deletar algum comentário que eles já publicaram.
- Os usuários poderem editar ou deletar algum post que eles publicaram.
- Os usuários também poderão categorizar os alertas em niveis de risco: baixo, médio e alto.
- Os usuários poderão filtrar os posts pela data, pelo ano e pelo nivel de risco.
- Os usuários poderão acessar o perfil de outros usuários para eles poderem acessar todos os posts e comentários que eles publicaram.


## Requisitos não funcionais
- O aplicativo deve seguir o padrão MVVM (Model-View-ViewModel).
- O aplicativo deve cachear os dados para evitar várias consultas ao banco de dados.
- Antes de cadastrar o usuário a senha deve ser criptografada.
- O usuário precisa ter uma experiência fluída.
- O usuário precisa saber quando os dados foram carregados ou não.
- Deter ter o aplicativo administrativo que irá monitorar as atividades dos usuário que usam o aplicativo não administrativo.