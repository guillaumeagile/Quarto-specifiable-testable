package quatro

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import quatro.doubluresDeTest.PiecePourLesTests

@Suppress("unused")
class PieceTest : ShouldSpec({
    context("un piece est déclarée")
    {
        val sut = PiecePourLesTests(1);

        should("égalite et inégalité") {
            sut shouldBe PiecePourLesTests(1)
            sut shouldNotBe PiecePourLesTests(2)
            sut shouldNotBe PasDePiece()
        }

        should("rien c'est rien") {
            PasDePiece() shouldBe PasDePiece()
        }

    }

    context("une piece quatro")
    {
        val observe = PieceDeQuarto(
            hauteur = Hauteur.BASSE,
            forme = Forme.BOUCHON,
            couleur = Couleur.NOIR,
            habillage = Habillage.UNI
        )

        should("égalite pour 4 caractéristiques identique") {
            val attendu = PieceDeQuarto(
                hauteur = Hauteur.BASSE,
                forme = Forme.BOUCHON,
                couleur = Couleur.NOIR,
                habillage = Habillage.UNI
            )
            observe shouldBe attendu
        }

        should("inégalite de deux pièces lorsqu'elles diffèrent d'une caractéristique ici la hauteur") {
            val attendu = observe.differentPour(hauteur = Hauteur.HAUT)

            observe shouldNotBe attendu
        }

        should("inégalite de deux pièces lorsqu'elles diffèrent d'une caractéristique ici la couleur") {
            val attendu = observe.differentPour(couleur = Couleur.BLANC)

            observe shouldNotBe attendu
        }


        should("aucune caractéristique en commun") {
            val attendu = PieceDeQuarto(
                hauteur = Hauteur.HAUT,
                forme = Forme.FOND,
                couleur = Couleur.BLANC,
                habillage = Habillage.RAYURES
            )
            observe possedeUneCaracteristiqueCommuneAvec attendu shouldBe false
        }

        should("devrait avoir une caractéristique en commun la hauteur") {
            val attendu = observe
                .differentPour(forme = Forme.FOND)
                .differentPour(couleur = Couleur.BLANC)
                .differentPour(habillage = Habillage.RAYURES)
            observe possedeUneCaracteristiqueCommuneAvec attendu shouldBe true
        }


        should("ces deux pieces ont pour unique caractéristique commune la forme") {
            val attendu = observe
                .differentPour(hauteur = Hauteur.HAUT)
                .differentPour(couleur = Couleur.BLANC)
                .differentPour(habillage = Habillage.RAYURES)
            observe possedeUneCaracteristiqueCommuneAvec attendu shouldBe true
        }
        should("ces deux pieces ont pour unique caractéristique commune la couleur") {
            val attendu = observe
                .differentPour(hauteur = Hauteur.HAUT)
                .differentPour(forme = Forme.FOND)
                .differentPour(habillage = Habillage.RAYURES)
            observe possedeUneCaracteristiqueCommuneAvec attendu shouldBe true
        }

        should("ces deux pieces ont pour unique caractéristique commune la cavité") {
            val attendu = observe
                .differentPour(hauteur = Hauteur.HAUT)
                .differentPour(forme = Forme.FOND)
                .differentPour(couleur = Couleur.BLANC)
            observe possedeUneCaracteristiqueCommuneAvec attendu shouldBe true
        }

    }


})

