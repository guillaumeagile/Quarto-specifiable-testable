package specifions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import quatro.*

class AntiSecheSpec : BehaviorSpec({
    given("j'ai un plateau") {
        var plateau = PlateauQuarto.Build()

        `when`("je place une piece") {
            var nouvelEtatDePLateau =  plateau.placer(PieceDeQuarto(
                hauteur = Hauteur.BASSE,
                forme = Forme.BOUCHON,
                couleur = Couleur.NOIR,
                habillage = Habillage.UNI
            )).En(1, 0)
            then("la piece est bien posée") {
                // test code
                nouvelEtatDePLateau.estEn(1,0) shouldBe PieceDeQuarto(
                    hauteur = Hauteur.BASSE,
                    forme = Forme.BOUCHON,
                    couleur = Couleur.NOIR,
                    habillage = Habillage.UNI)
            }
        }
    }
})