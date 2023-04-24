package quatro

class Partie(val plateau: Plateau,  val dernierJoueur: Joueur = Joueur.AUCUN) {

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
     // obtenir la liste des hauteurs de toutes les pieces, puis voir si cette liste est homogène
     val liste = this as List<QuatroPiece>
     val couleurDu1erElemement = liste.first().couleur

     return liste.all { p -> p.couleur == couleurDu1erElemement }
 }
