package quatro

class Partie(val plateau: Plateau, val dernierJoueur: Joueur = Joueur.AUCUN) {

    fun joueur(joueur: Joueur): PartieEnCours {
        return PartieEnCours(joueurEnCours = joueur, plateau = plateau)
    }

    fun estEn(x: Int, y: Int): Piece =
        plateau.estEn(x, y)

    fun dernierCoupEstValide(): Boolean {
        return plateau.dernierCoupEstValide()
    }

    fun estGagnee(): Boolean {
        //  plateau.touteLesPiecesALaVerticale(0).ontToutesUneCaracteristiqueCommune()
        return true
    }
}

fun List<QuatroPiece>.ontToutesUneCaracteristiqueCommune(): Boolean {
    if (this.isEmpty())
        return false;

    return this.all { p -> p.couleur == this.first().couleur }
            || this.all { p -> p.hauteur == this.first().hauteur }
}
