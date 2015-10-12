package univ.lang.scala.lab5

/**
 * Created by fsznajderman on 12/10/15.
 */
import univ.lang.scala.lab5.ItemFactory._





class GildedRose(val items: Array[Item]) {

  def updateQuality() {

    items.foreach(item => {
      item updateQuality()
      item updateSellin()
    })
  }
}