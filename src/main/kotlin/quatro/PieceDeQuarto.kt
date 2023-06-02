package quatro

data class PieceDeQuarto(
    val hauteur: Hauteur,
    val forme: Forme,
    val couleur: Couleur,
    val habillage: Habillage
) : Piece {
    infix fun possedeUneCaracteristiqueCommuneAvec(autre: PieceDeQuarto): Boolean {
        return when {
            hauteur == autre.hauteur -> true
            forme == autre.forme -> true
            couleur == autre.couleur -> true
            habillage == autre.habillage -> true
            else -> false
        }
    }

    fun differentPour(hauteur: Hauteur): PieceDeQuarto {
        return PieceDeQuarto(
            hauteur,
            this.forme,
            this.couleur,
            this.habillage
        )
    }

    fun differentPour(forme: Forme): PieceDeQuarto {
        return PieceDeQuarto(
            this.hauteur,
            forme,
            this.couleur,
            this.habillage
        )
    }
    fun differentPour(couleur: Couleur): PieceDeQuarto {
        return PieceDeQuarto(
            this.hauteur,
            this.forme,
            couleur,
            this.habillage
        )
    }
    fun differentPour(habillage: Habillage): PieceDeQuarto {
        return PieceDeQuarto(
            this.hauteur,
            this.forme,
            this.couleur,
            habillage
        )
    }
}

enum class Couleur {
    NOIR,
    BLANC
}

enum class Habillage {
    UNI,
    RAYURES
}

enum class Forme {
    BOUCHON,
    FOND
}

enum class Hauteur {
    BASSE,
    HAUT

}