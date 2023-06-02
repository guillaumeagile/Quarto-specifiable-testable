package specifions

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import quatro.*

class ExampleSpec : BehaviorSpec({
    given("j'ai un plateau") {
        var plateau = PlateauQuarto.Build()

        `when`("je place une piece") {
            var nouvelEtatDePLateau =  plateau.placer(PieceDeQuarto(
                hauteur = Hauteur.BASSE,
                forme = Forme.RONDE,
                couleur = Couleur.SOMBRE,
                cavite = Cavite.CREUSE
            )).En(1, 0)
            then("la piece est bien posée") {
                // test code
                nouvelEtatDePLateau.estEn(1,0) shouldBe PieceDeQuarto(
                    hauteur = Hauteur.BASSE,
                    forme = Forme.RONDE,
                    couleur = Couleur.SOMBRE,
                    cavite = Cavite.CREUSE)
            }
        }
    }
})