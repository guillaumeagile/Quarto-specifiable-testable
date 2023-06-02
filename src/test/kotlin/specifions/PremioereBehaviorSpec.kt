package specifions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import quatro.*

class PremioereBehaviorSpec : BehaviorSpec({
    given("Il y a") {
        var plateau = PlateauQuarto.Build()
        var bouteilleBlanche1 = PieceDeQuarto(hauteur = Hauteur.HAUT,
            couleur = Couleur.BLANC,
            forme = Forme.FOND,
            habillage = Habillage.RAYURES)
        var bouteille2 = bouteilleBlanche1.differentPour(hauteur = Hauteur.BASSE)
        var bouteille3 = bouteille2.differentPour(forme = Forme.BOUCHON)
        var bouteilleDeLadversaire = bouteille3.differentPour(Habillage.UNI)


        val plateauAJouer = plateau.placer(bouteilleBlanche1).En(0,0)
            .placer(bouteille2).En(1,0)
            .placer(bouteille3).En(2,0)

        `when`("je fais un truc") {
           var plateauResultat = plateauAJouer.placer(bouteilleDeLadversaire).En(3,0)


            then("il s'est passé quelque chose") {
                plateauResultat.cestGagné shouldBe true

            }
        }
    }
})