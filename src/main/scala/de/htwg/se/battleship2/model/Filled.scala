package de.htwg.se.battleship2.model

enum Filled(StringRepresentation: String):
  override def toString = StringRepresentation
  case Ship extends Filled("O")
  case Hit extends Filled("H")
  case Empty extends Filled("-")
  
