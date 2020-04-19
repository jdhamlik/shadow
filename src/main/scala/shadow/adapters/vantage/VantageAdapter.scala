package shadow.adapters.vantage

import shadow.adapters.{Adapter, Identifier}
import shadow.manager.DeviceManager

class VantageAdapter extends Adapter {

  override def register(visitor: DeviceManager.DeviceVisitor): Unit = ???
  override def identifier(value: Any): Identifier = ???
}
