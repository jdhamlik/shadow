package shadow.adapters.features

object DimmableFeature {

  val name = "DIMMABLE"
}

class DimmableFeature extends Feature {

  override def name(): String = DimmableFeature.name
}
