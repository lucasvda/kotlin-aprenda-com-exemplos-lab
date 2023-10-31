enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String){
	var formacao: Formacao? = null

    fun matricularNaFormacao(formacao: Formacao) {
        this.formacao = formacao
        formacao.inscritos.add(this)
    }
}

data class ConteudoEducacional(var nome: String, var duracao: Int, var nivel: String)

class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>){
	
    val inscritos = mutableListOf<Usuario>()
   
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	
	//Criando conteúdos para a formação Análise e Desenvolvimento de Sistemas
	val conteudo1 = ConteudoEducacional("JavaScript", 45, Nivel.valueOf("BASICO").toString())
    val conteudo2 = ConteudoEducacional("PHP", 45, Nivel.valueOf("INTERMEDIARIO").toString())
	val listaConteudoAds = mutableListOf<ConteudoEducacional>()
    listaConteudoAds.addAll(listOf(conteudo1, conteudo2))
    
    //Criando conteúdos para a formação UI/UX Design
    val conteudo3 = ConteudoEducacional("CSS", 60, Nivel.valueOf("AVANCADO").toString())
	val conteudo4 = ConteudoEducacional("Figma", 60, Nivel.valueOf("BASICO").toString())
    val listaConteudoDesign = mutableListOf<ConteudoEducacional>()
    listaConteudoDesign.addAll(listOf(conteudo3, conteudo4))
    
    //Criando conteúdos para a formação Ciência de Dados
    val conteudo5 = ConteudoEducacional("MySQL", 50, Nivel.valueOf("INTERMEDIARIO").toString())
    val conteudo6 = ConteudoEducacional("Machine Learning", 60, Nivel.valueOf("AVANCADO").toString())
	val listaConteudoCD = mutableListOf<ConteudoEducacional>()
    listaConteudoCD.addAll(listOf(conteudo5, conteudo6))
    
    //Criando conteúdos para a formação Ciência de Dados
	val conteudo7 = ConteudoEducacional("Pensamento Computacional", 40, Nivel.valueOf("BASICO").toString())
    val conteudo8 = ConteudoEducacional("Portas Lógicas", 50, Nivel.valueOf("INTERMEDIARIO").toString())
	val listaConteudoCC = mutableListOf<ConteudoEducacional>()
    listaConteudoCC.addAll(listOf(conteudo7, conteudo8))
	
	//Criando as formações
	val ads = Formacao("Análise e Desenvolvimento de Sistemas", listaConteudoAds)
    val design = Formacao("UI/UX Design", listaConteudoDesign)
    val cd = Formacao("Ciência de Dados", listaConteudoCD)
    val cc = Formacao("Ciência da Computação", listaConteudoCC)
    
	//Criando os usuários
    val usuario1= Usuario("José")	
	val usuario2= Usuario("Maria") 
    val usuario3= Usuario("João")
    val usuario4= Usuario("Sônia")

	//Matriculando os usuários nas formações
    usuario1.matricularNaFormacao(ads)
    usuario2.matricularNaFormacao(design)
    usuario3.matricularNaFormacao(cd)
	usuario4.matricularNaFormacao(cc)

	//Imprimindo a lista de inscritos por formação
    println(ads.inscritos)
    println(design.inscritos)
    println(cd.inscritos)
    println(cc.inscritos)
    
}