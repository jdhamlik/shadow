package shadow.adapters

import shadow.adapters.features.Feature

abstract class Device {

  def identifier(): Identifier
  def features(): List[Feature]
}
