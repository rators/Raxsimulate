package vendingmachine

/**
 * Nickel : five cents
 */
case class Nickel() extends Coin {
  override val value: Int = 5
}