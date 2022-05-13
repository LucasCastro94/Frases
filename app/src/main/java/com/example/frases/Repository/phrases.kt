package com.example.frases.Repository

import com.example.frases.infra.Constants
import java.util.*

class phrases(val description: String,val category: Int)

class GeratorPhrases {

    private val Morning = Constants.categoryID.morning
    private val Afternoon = Constants.categoryID.afternoon
    private val Evening = Constants.categoryID.evening
    private val all = Constants.categoryID.all


    val listphrases: List<phrases> = listOf(

        phrases("Não deixe as incertezas atrapalharem a sua felicidade Sorria e tenha um bom dia!", Morning),
        phrases("Bom dia! No lugar de olhar para as dificuldades, olhe hoje para todas as coisas boas que estão perto de você.", Morning),
        phrases("Bom dia! Dica para hoje: sorria para todos que puder!O pior que podeacontecer é ganharuns belos sorrisosde volta.", Morning),
        phrases("Bom dia! Que o dia seja de sol dentro de voce, mesmo que na rua seja chuva.", Morning),
        phrases("Todos os dias reservam algo bom para a gente. Vá confiante e descubra o que o dia de hoje guardou para voce!", Morning),
        phrases("Sabe aquele dia especial? e cheio de noticias boas? e o que eu quero pra você hoje!", Morning),
        phrases("Bom dia! O conselho de hoje é: tome um cafê e pense positivo. As vezes,estes dois itens são tudo o que um dia precisa.", Morning),
        phrases("Que o seu dia seja tão maravilhoso quanto o seu coração. Vista o seu melhor sorriso e espalhe motivação para todos ao seu redor. Bom dia!", Morning),
        phrases("Um novo dia é uma nova oportunidade da vida para fazer diferente tudo o que quiser mudar. Agradeça a Deus por esta chance!", Morning),








        phrases("Boa Tarde... Desfrute de cada momento da sua tarde, que seja serena, tranquila e que Deus nos abençoe transbordando nossos corações de paz.", Afternoon),
        phrases("Sabe aquela tarde recheada de surpresas? Então, foi essa tarde que eu vim te desejar...Que seja leve, tranquila,alegre e descontraida e que nao falte ânimo e paz nos corações!", Afternoon),
        phrases("Que tudo aquilo que te encanta os olhos... ilumine sua tarde... alimentando o coração somente daquilo que te faz bem!", Afternoon),
        phrases("Linda tarde para você que com alegria que espalha amor e carinho todos os dias!", Afternoon),
        phrases("E que não faltem as emoções lindas dos sorrisos sinceros ... nem as alegrias radiantes dos gestos simples das amizades que dividem com a gente os nossos caminhos !", Afternoon),
        phrases("Carinho é fonte de energia, é amor mais-que-perfeito! E eu lhe trouxe o meu só pra desejar uma tarde mega especial pra você!", Afternoon),
        phrases("Sabe aquela tarde deliciosa? Pra ficar guardada na memória? Então, é essa tarde que eu vim te desejar Que a sua tarde seja tranquila, que tenha sorrisos e risos, carinho e amor, com toques de magia e requintes de felicidade!", Afternoon),
        phrases("As vezes você só percebe a importância de um momento, quando se torna uma grande lembrança. Boa tarde", Afternoon),
        phrases("Eu apoio o caráter, a honestidade, o boa tarde, o chocolate ao fim da tarde, o casamento antigo, as bodas de ouro, a família unida, as amizades verdadeiras, sou do tempo em que as pessoas pensavam mais e falavam menos, os valores do mundo podem estar invertidos - os meus não!", Afternoon),
        phrases("Sabemos que tivemos uma boa tarde quando, mesmo depois de ter anoitecido, o sol parece ainda não ter se posto", Afternoon),


        phrases("Para boas recompensas, não há atalhos! Boa noite.", Evening),
        phrases("Encontramos a verdadeira felicidade quando somos felizes sem motivos. Boa noite!", Evening),
        phrases("Direcione o seu rosto sempre na direção do sol, para que as sombras fiquem para trás. Boa noite!", Evening),
        phrases("Vencedores não são pessoas que nunca falham, são pessoas que nunca desistem. Boa noite!", Evening),
        phrases("A cada noite temos uma nova oportunidade de recarregar as nossas energias e refletir sobre a nossa evolução espiritual. Bom descanso.", Evening),
        phrases("Cerque-se de pessoas que acreditam e lutam por você. Este é o primeiro passo para o sucesso. Boa noite!", Evening),
        phrases("Não se esqueça que a esperança é muito mais poderosa que o medo. Boa noite!", Evening),
        phrases("Às vezes, tudo que precisamos é encarar a vida com mais leveza e menos seriedade. Boa noite.", Evening),
        phrases("Apenas quem está livre de pensamentos destrutivos encontram a paz. Boa noite!", Evening),
        phrases("A sua vida nunca será verdadeiramente sua se você continuar se importando com o que as pessoas pensam sobre ela. Boa noite.", Evening)

    )


    fun GetPhrases(catID: Int) : String
    {
        val listFiltered= listphrases.filter { (it.category==catID) }

      val rand = Random().nextInt(listFiltered.size)

        return listFiltered[rand].description

    }

}