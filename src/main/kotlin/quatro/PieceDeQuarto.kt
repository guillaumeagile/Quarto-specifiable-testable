package quatro

data class PieceDeQuarto(
    val hauteur: Hauteur,
    val forme: Forme,
    val couleur: Couleur,
    val cavite: Cavite
) : Piece {
    infix fun possedeUneCaracteristiqueCommuneAvec(autre: PieceDeQuarto): Boolean {
        return when {
            hauteur == autre.hauteur -> true
            forme == autre.forme -> true
            couleur == autre.couleur -> true
            cavite == autre.cavite -> true
            else -> false
        }
    }

    fun differentPour(hauteur: Hauteur): PieceDeQuarto {
        return PieceDeQuarto(
            hauteur,
            this.forme,
            this.couleur,
            this.cavite
        )
    }

    fun differentPour(forme: Forme): PieceDeQuarto {
        return PieceDeQuarto(
            this.hauteur,
            forme,
            this.couleur,
            this.cavite
        )
    }
    fun differentPour(couleur: Couleur): PieceDeQuarto {
        return PieceDeQuarto(
            this.hauteur,
            this.forme,
            couleur,
            this.cavite
        )
    }
    fun differentPour(cavite: Cavite): PieceDeQuarto {
        return PieceDeQuarto(
            this.hauteur,
            this.forme,
            this.couleur,
            cavite
        )
    }
}

enum class Couleur {
    SOMBRE,
    CLAIRE
}

enum class Cavite {
    CREUSE,
    PLEINE
}

enum class Forme {
    RONDE,
    CARRE
}

enum class Hauteur {
    BASSE,
    HAUT

}